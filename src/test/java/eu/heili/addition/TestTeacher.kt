package eu.heili.addition

import eu.heili.mathsolver.Add
import eu.heili.mathsolver.Expr
import eu.heili.mathsolver.Const
import eu.heili.mathsolver.Var
import org.junit.Test


class TestTeacher {

    @Test
    fun test() {
        val e: Expr = Add(Var("x"), Var("x"))
//        System.out.println(e.toInfixString()) // Ausgabe: (x + x)
//        System.out.println(e.simplify().toInfixString()) // Ausgabe: (2.0 * x)
        assert(e.simplify().toInfixString() == "(2.0 * x)")
    }

    @Test
    fun test2() {

        val e: Expr = Add(Var("x"), Const(0.0))
//        System.out.println(e.toInfixString()) // Ausgabe: (x + 0.0)
//
//        System.out.println(e.simplify().toInfixString()) // Ausgabe: x
        assert(e.simplify().toInfixString() == "x")
    }

    @Test
    fun test3() {
        val e: Expr = Add(Const(0.0), Var("x"))
        // System.out.println(e.toInfixString()) // Ausgabe: (0.0 + x)
        //System.out.println(e.simplify().toInfixString()) // Ausgabe: x
        assert(e.simplify().toInfixString() == "x")
    }

    @Test
    fun test4() {
        val e: Expr = Add(Add(Var("x"), Const(2.0)), Add(Const(2.0), Var("x")))
//        System.out.println(e.toInfixString()) // Ausgabe: ((x + 2.0) + (2.0 + x))
//        System.out.println(e.simplify().toInfixString()) // Ausgabe: (2.0 * (x + 2.0))
        assert(e.simplify().toInfixString() == "(2.0 * (x + 2.0))")
    }
}