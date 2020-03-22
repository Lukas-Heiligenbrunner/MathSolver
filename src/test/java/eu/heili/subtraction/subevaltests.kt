package eu.heili.subtraction

import eu.heili.mathsolver.Const
import eu.heili.mathsolver.Expr
import eu.heili.mathsolver.Sub
import org.junit.Test

class subevaltests {
    @Test
    fun evalSubtraction(){
        val e: Expr = Sub(
            Const(0.0),
            Const(5.0)
        )
        assert(e.evaluate() == -5.0)
    }

    @Test
    fun evalComplexSubtraction(){
        val e: Expr = Sub(
            Const(0.0), Sub(
                Const(
                    0.0
                ), Const(-1.0)
            )
        )
        assert(e.evaluate() == -1.0)
    }

    @Test
    fun evalSimpleSubtraction(){
        val en = Sub(
            Const(0.0),
            Const(-1.0)
        ).simplify()
        assert(en.toInfixString() == "(-1.0 * -1.0)")
    }
}