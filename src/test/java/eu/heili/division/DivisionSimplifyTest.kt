package eu.heili.division

import eu.heili.mathsolver.Const
import eu.heili.mathsolver.Div
import eu.heili.mathsolver.Var
import org.junit.Test

class DivisionSimplifyTest {

    @Test(expected = NullPointerException::class)
    fun divtoZero() {
        val en = Div(Var("x"),Const(0)).simplify()
    }

    @Test
    fun divnochangeTest(){
        val en = Div(Var("x"),Const(3))
        assert(en.simplify().toInfixString() == "(x / 3.0)")
    }
}