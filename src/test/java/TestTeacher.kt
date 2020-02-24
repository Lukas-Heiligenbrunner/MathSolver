import eu.heili.mathsolver.Addition
import eu.heili.mathsolver.Expression
import eu.heili.mathsolver.Val
import eu.heili.mathsolver.Var
import org.junit.Test


class TestTeacher {

    @Test
    fun test() {
        var e: Expression = Addition(Var("x"), Var("x"))
//        System.out.println(e.toInfixString()) // Ausgabe: (x + x)
//        System.out.println(e.simplify().toInfixString()) // Ausgabe: (2.0 * x)
        assert(e.simplify().toInfixString() == "(2.0 * x)")
    }

    @Test
    fun test2() {

        var e: Expression = Addition(Var("x"), Val(0.0))
//        System.out.println(e.toInfixString()) // Ausgabe: (x + 0.0)
//
//        System.out.println(e.simplify().toInfixString()) // Ausgabe: x
        assert(e.simplify().toInfixString() == "x")
    }

    @Test
    fun test3() {
        var e: Expression = Addition(Val(0.0), Var("x"))
        // System.out.println(e.toInfixString()) // Ausgabe: (0.0 + x)

        //System.out.println(e.simplify().toInfixString()) // Ausgabe: x

        assert(e.simplify().toInfixString() == "x")
    }

    @Test
    fun test4() {

        var e: Expression = Addition(Addition(Var("x"), Val(2.0)), Addition(Val(2.0), Var("x")))
//        System.out.println(e.toInfixString()) // Ausgabe: ((x + 2.0) + (2.0 + x))
//
//        System.out.println(e.simplify().toInfixString()) // Ausgabe: (2.0 * (x + 2.0))
        assert(e.simplify().toInfixString() == "(2.0 * (x + 2.0))")
    }
}