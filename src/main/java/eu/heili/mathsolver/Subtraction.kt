package eu.heili.mathsolver

class Subtraction(private val a: Expression, private val b: Expression) : Operator(a, b) {
    override fun simplify(): Expression {
        // evaluate parents first
        val aa = a.simplify()
        val bb = b.simplify()

        if (bb.isZero) return aa
        if (aa.isZero) return Multiplication(Val(-1.0), bb).simplify()

        return this
    }

    override fun evaluate(): Double {
        return a.evaluate() - b.evaluate()
    }

    override fun toInfixString(): String {
        return "(${a.toInfixString()} - ${b.toInfixString()})"
    }
}