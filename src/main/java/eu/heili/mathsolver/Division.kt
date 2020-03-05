package eu.heili.mathsolver

class Division(private val a: Expression, private val b: Expression) : Operator(a, b) {
    override fun simplify(): Expression {
        // evaluate parents first
        val aa = a.simplify()
        val bb = b.simplify()


        if (bb.isZero) return Val(0.0)

        if (aa.isZero)
            throw NullPointerException("division thruueeee zero")


        // check if a and b are the same
        if (aa.toInfixString() == bb.toInfixString()) {
            return Val(1.0)
        }

        return this
    }

    override fun evaluate(): Double {
        return a.evaluate() / a.evaluate();
    }

    override fun toInfixString(): String {
        return "(${a.toInfixString()} / ${b.toInfixString()})"
    }
}