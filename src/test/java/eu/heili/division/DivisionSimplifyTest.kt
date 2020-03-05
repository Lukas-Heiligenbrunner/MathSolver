package eu.heili.division

import eu.heili.mathsolver.Subtraction
import eu.heili.mathsolver.Val
import eu.heili.mathsolver.Var
import org.junit.Test

class DivisionSimplifyTest {
    @Test
    fun basicTest() {
        val en = Subtraction(Val(5.0),Val(3.0)).simplify()
        assert(en.toInfixString() == "(5.0 - 3.0)")
    }

    @Test
    fun basicMinusTest() {
        val en = Subtraction(Val(5.0),Val(-3.0)).simplify()
        assert(en.toInfixString() == "(5.0 - -3.0)")
    }

    @Test
    fun basicVarTest() {
        val en = Subtraction(Val(5.0), Var("x")).simplify()
        println(en.toInfixString())
        assert(en.toInfixString() == "(5.0 - x)")
    }

    @Test
    fun twoVarTest() {
        val en = Subtraction(Var("x"),Var("x")).simplify()
        println(en.toInfixString())
        assert(en.toInfixString() == "(x - x)")
    }
}