package eu.heili.mathsolver

class Division(private val a: Expression, private val b: Expression) : Operator(a,b) {
    override fun simplify(): Expression {
        return this
        // todo
    }

    override fun evaluate(): Double {
        return a.evaluate() / a.evaluate();
    }

    override fun toInfixString(): String {
        return a.toInfixString() + "/" + b.toInfixString()
    }
}