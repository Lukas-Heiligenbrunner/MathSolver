import eu.heili.mathsolver.*
import org.junit.Test

class EvaluateTestCase {

    @Test
    fun evalValMultiplication(){
        val e: Expression = Multiplication(Val(8.0), Var("x", 5.0))
        assert(e.evaluate() == 40.0)
    }

    @Test
    fun evalValAddition(){
        val e: Expression = Addition(Multiplication(Val(8.0), Var("x", 5.0)),Val(5.0))
        assert(e.evaluate() == 45.0)
    }

    @Test
    fun evalSubtraction(){
        val e: Expression = Subtraction(Val(0.0),Val(5.0))
        assert(e.evaluate() == -5.0)
    }

    @Test
    fun evalComplexSubtraction(){
        val e: Expression = Subtraction(Val(0.0),Subtraction(Val(0.0),Val(-1.0)))
        assert(e.evaluate() == -1.0)
    }
}