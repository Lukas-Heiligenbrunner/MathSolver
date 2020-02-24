package eu.heili.mathsolver

class Addition(private val a: Expression, private val b: Expression) : Operator(a,b) {

    override fun simplify(): Expression {
        // evaluate parents first
        val aa = a.simplify()
        val bb = b.simplify()

        try{
            if (bb.evaluate() == 0.0) return aa
        }catch (e: NullPointerException){

        }
        try {
            if (aa.evaluate() == 0.0) return bb
        }catch (e: NullPointerException){

        }

        // check if a and b are the same
        if(aa.toInfixString() == bb.toInfixString()){
            return Multiplication(Val(2.0),aa)
        }

        // if child is also operator then operators can be exchanged and are still the same.
        if(aa is Operator && bb is Operator){
            if(aa.geta().toInfixString() == bb.getb().toInfixString() && aa.getb().toInfixString() == bb.geta().toInfixString()) return Multiplication(Val(2.0),aa)
        }

        return this
    }

    override fun evaluate(): Double {
        return a.evaluate() + b.evaluate()
    }

    override fun toInfixString(): String {
        return "("+a.toInfixString() + " + " + b.toInfixString()+")"
    }
}