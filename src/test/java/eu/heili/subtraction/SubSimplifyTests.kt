package eu.heili.subtraction

import eu.heili.mathsolver.Const
import eu.heili.mathsolver.Sub
import eu.heili.mathsolver.Var
import org.junit.Test

class SubSimplifyTests {
    @Test
    fun subSimplifyTest() {
        val e = Sub(Const(5), Var("x"))
        assert(e.simplify().toInfixString() == "(5.0 - x)")
    }

    @Test
    fun subSimplifyZeroTest() {
        val e = Sub(Const(5), Const(0))
        assert(e.simplify().toInfixString() == "5.0")
    }

    @Test
    fun subSimplifyMinusTest() {
        val e = Sub(Const(0), Const(5))
        assert(e.simplify().toInfixString() == "(-1.0 * 5.0)")
    }

    @Test
    fun subSimplifySameTest() {
        val e = Sub(Var("x"), Var("x"))
        assert(e.simplify().toInfixString() == "0.0")
    }

    @Test
    fun evalSimpleSubtraction() {
        val en = Sub(
            Const(0.0),
            Const(-1.0)
        ).simplify()
        assert(en.toInfixString() == "(-1.0 * -1.0)")
    }
}