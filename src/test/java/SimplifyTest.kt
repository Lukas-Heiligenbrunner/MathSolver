import eu.heili.mathsolver.Subtraction
import eu.heili.mathsolver.Val
import org.junit.Test

// todo movie in seperate packages per operation
class SimplifyTest {
    @Test
    fun evalSimpleSubtraction(){
        val en = Subtraction(Val(0.0),Val(-1.0)).simplify()
        assert(en.toInfixString() == "(-1.0 * -1.0)")
    }
}