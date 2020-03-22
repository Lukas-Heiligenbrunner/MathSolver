package eu.heili.multiplication

import eu.heili.mathsolver.Const
import eu.heili.mathsolver.Expr
import eu.heili.mathsolver.Mul
import org.junit.Test

class MulSimplifyTests {
    @Test
    fun mulSimplifyZeroTerst(){
        val e: Expr = Mul(Const(8.0), Const(0))
        assert(e.simplify().toInfixString() == "0.0")
    }

    @Test
    fun mulSimplifyOneTerst(){
        val e: Expr = Mul(Const(8.0), Const(1))
        assert(e.simplify().toInfixString() == "8.0")
    }
}