package eu.heili.mathsolver

class Add(private val a: Expr, private val b: Expr) : Operator(a, b) {
    override fun simplify(): Expr {
        // evaluate parents first
        val aa = a.simplify()
        val bb = b.simplify()


        if (bb.isZero) return aa

        if (aa.isZero) return bb


        // check if a and b are the same
        if (aa.toInfixString() == bb.toInfixString()) {
            return Mul(Const(2.0), aa)
        }

        // if child is also operator then operators can be exchanged and are still the same.
        if (aa is Operator && bb is Operator) {
            if (aa.geta().toInfixString() == bb.getb().toInfixString() && aa.getb().toInfixString() == bb.geta()
                    .toInfixString()
            ) return Mul(Const(2.0), aa)
        }

        return this
    }

    override fun evaluate(): Double {
        return a.evaluate() + b.evaluate()
    }

    override fun toInfixString(): String {
        return "(" + a.toInfixString() + " + " + b.toInfixString() + ")"
    }
}