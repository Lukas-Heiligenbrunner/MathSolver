package eu.heili.division

import eu.heili.mathsolver.*
import org.junit.Test

class DivisionTestTeacher {
    @Test
    fun test(){
        val e: Expr = Div(Const(0), Var("x"))
        assert(e.toInfixString() == "(0.0 / x)")
    }

    @Test
    fun test2(){
        val e: Expr = Div(Const(0), Var("x"))
        assert(e.simplify().toInfixString() == "0.0")
    }

    @Test
    fun test3(){
        val e: Expr = Div(Var("x"), Const(1))
        assert(e.simplify().toInfixString() == "x")
    }

    @Test
    fun test4(){
        val e = Div(Var("x"), Var("x"))
        assert(e.toInfixString() == "(x / x)") // Ausgabe: (x / x)
        assert(e.simplify().toInfixString() == "1.0")
    }

    @Test
    fun test5(){
        val e = Div(Add(Var("x"), Const(2)), Add(Const(2), Var("x")))
        assert(e.toInfixString() == "((x + 2.0) / (2.0 + x))") // Ausgabe: ((x + 2.0) / (2.0 + x))
        assert(e.simplify().toInfixString() == "1.0") // Ausgabe: 1.0
    }
}