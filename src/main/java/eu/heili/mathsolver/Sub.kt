package eu.heili.mathsolver

class Sub(private val a: Expr, private val b: Expr) : Operator(a, b) {
    override fun simplify(): Expr {
        // evaluate parents first
        val aa = a.simplify()
        val bb = b.simplify()

        if (bb.isZero) return aa
        if (aa.isZero) return Mul(Const(-1.0), bb).simplify()

        if(aa.toInfixString() == bb.toInfixString())
            return Const(0)

        return this
    }

    override fun evaluate(): Double {
        return a.evaluate() - b.evaluate()
    }

    override fun toInfixString(): String {
        return "(${a.toInfixString()} - ${b.toInfixString()})"
    }
}