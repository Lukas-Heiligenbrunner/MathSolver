import eu.heili.mathsolver.Addition
import eu.heili.mathsolver.Multiplication
import eu.heili.mathsolver.Subtraction
import eu.heili.mathsolver.Val
import org.junit.Test

class SimplifyTest {
    @Test
    fun PolynomAddSimplifyTest(){
        val en = Addition(Addition(Val(0.0), Val(3.0)), Addition(Val(0.0), Val(0.0))).simplify()
        assert(en.toInfixString() == "3.0")
    }

    @Test
    fun evalSimpleSubtraction(){
        val en = Subtraction(Val(0.0),Val(-1.0)).simplify()
        assert(en.toInfixString() == "1.0")
    }

    @Test
    fun evalSameToMul(){
        val en = Addition(Val(2.0),Val(2.0)).simplify()
        assert(en.toInfixString() == Multiplication(Val(2.0),Val(2.0)).toInfixString())
    }
}