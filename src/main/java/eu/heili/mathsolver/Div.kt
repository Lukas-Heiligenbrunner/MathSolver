package eu.heili.mathsolver

class Div(private val a: Expr, private val b: Expr) : Operator(a, b) {
    override fun simplify(): Expr {
        // evaluate parents first
        val aa = a.simplify()
        val bb = b.simplify()


        if (aa.isZero) return Const(0.0)

        if (bb.isZero)
            throw NullPointerException("division through zero!!")

        if (bb.isOne)
            return aa


        // check if a and b are the same
        if (aa.toInfixString() == bb.toInfixString()) {
            return Const(1.0)
        }

        // if child is also operator then operators can be exchanged and are still the same.
        if (aa is Operator && bb is Operator) {
            if (aa.geta().toInfixString() == bb.getb().toInfixString() && aa.getb().toInfixString() == bb.geta().toInfixString())
                return Const(1.0)
        }

        return this
    }

    override fun evaluate(): Double {
        return a.evaluate() / b.evaluate();
    }

    override fun toInfixString(): String {
        return "(${a.toInfixString()} / ${b.toInfixString()})"
    }
}