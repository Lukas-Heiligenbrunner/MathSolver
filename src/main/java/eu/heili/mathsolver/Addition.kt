package eu.heili.mathsolver

class Addition(private val a: Expression, private val b: Expression) : Operator() {
    override fun simplify(): Expression {
        // evaluate parents first
        val aa = a.simplify()
        val bb = b.simplify()

        if (bb.evaluate() == 0.0) return aa
        if (aa.evaluate() == 0.0) return bb

        return Addition(aa,bb)
    }

    override fun evaluate(): Double {
        return a.evaluate() + b.evaluate()
    }

    override fun toInfixString(): String {
        return a.toInfixString() + " + " + b.toInfixString()
    }
}