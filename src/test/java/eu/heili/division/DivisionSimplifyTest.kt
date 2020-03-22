package eu.heili.division

import eu.heili.mathsolver.Sub
import eu.heili.mathsolver.Const
import eu.heili.mathsolver.Var
import org.junit.Test

class DivisionSimplifyTest {
    @Test
    fun basicTest() {
        val en = Sub(
            Const(5.0),
            Const(3.0)
        ).simplify()
        assert(en.toInfixString() == "(5.0 - 3.0)")
    }

    @Test
    fun basicMinusTest() {
        val en = Sub(
            Const(5.0),
            Const(-3.0)
        ).simplify()
        assert(en.toInfixString() == "(5.0 - -3.0)")
    }

    @Test
    fun basicVarTest() {
        val en = Sub(Const(5.0), Var("x")).simplify()
        println(en.toInfixString())
        assert(en.toInfixString() == "(5.0 - x)")
    }

    @Test
    fun twoVarTest() {
        val en = Sub(Var("x"),Var("x"))
        assert(en.toInfixString() == "(x - x)")
    }
}