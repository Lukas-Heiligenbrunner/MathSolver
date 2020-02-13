import eu.heili.mathsolver.Addition
import eu.heili.mathsolver.Val
import org.junit.Test

class SimplifyTest {
    @Test
    fun PolynomAddSimplifyTest(){
        val en = Addition(Addition(Val(0.0), Val(3.0)), Addition(Val(0.0), Val(0.0))).simplify()
        assert(en.toInfixString() == "3.0")
    }
}