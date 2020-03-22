package eu.heili.vari

import eu.heili.mathsolver.EvaluateException
import eu.heili.mathsolver.Expr
import eu.heili.mathsolver.Var
import org.junit.Test

class VarTestTeacher {
    val e: Expr = Var("x")

    @Test
    fun test() {
        assert(e.toInfixString() == "x")
    }

    @Test
    fun test1() {
        assert(e.simplify().toInfixString() == "x")
    }

    @Test(expected = EvaluateException::class)
    fun test2() {
        e.simplify().evaluate()
    }

    @Test
    fun test3() {
        (e as Var).setValue(2)
        assert(e.toInfixString() == "x")
    }

    @Test
    fun test4() {
        (e as Var).setValue(4)
        assert(e.simplify().evaluate() == 4.0)
    }
}