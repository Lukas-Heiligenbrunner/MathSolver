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
}