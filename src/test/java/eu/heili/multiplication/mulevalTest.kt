package eu.heili.multiplication

import eu.heili.mathsolver.Const
import eu.heili.mathsolver.Expr
import eu.heili.mathsolver.Mul
import eu.heili.mathsolver.Var
import org.junit.Test

class mulevalTest {
    @Test
    fun evalValMultiplication(){
        val e: Expr = Mul(Const(8.0), Var("x", 5.0))
        assert(e.evaluate() == 40.0)
    }
}