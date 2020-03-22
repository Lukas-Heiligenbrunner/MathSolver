package eu.heili.division

import eu.heili.mathsolver.Const
import eu.heili.mathsolver.Div
import eu.heili.mathsolver.Var
import org.junit.Test

class DivEvalTests {
    @Test
    fun basicEvalTest(){
        val en = Div(Var("x",15), Const(3))
        println(en.simplify().evaluate())
        assert(en.simplify().evaluate() == 5.0)
    }
}