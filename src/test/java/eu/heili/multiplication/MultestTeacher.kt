package eu.heili.multiplication

import eu.heili.mathsolver.*
import org.junit.Test

class MultestTeacher {
    @Test
    fun test() {
        val e: Expr = Mul(Const(0), Var("x"))
        assert(e.toInfixString() == "(0.0 * x)") // Ausgabe: (0 * x)
        assert(e.simplify().toInfixString() == "0.0") // Ausgabe: 0.0
    }

    @Test
    fun test1() {
        val e = Mul(Var("x"), Const(0))
        assert(e.toInfixString() == "(x * 0.0)") // Ausgabe: (x * 0)
        assert(e.simplify().toInfixString() == "0.0") // Ausgabe: 0.0
    }

    @Test
    fun test2() {
        val e = Mul(Const(1), Var("x"))
        assert(e.toInfixString() == "(1.0 * x)") // Ausgabe: (1 * x)
        assert(e.simplify().toInfixString() == "x") // Ausgabe: x
    }

    @Test
    fun test3() {
        val e = Mul(Var("x"), Const(1))
        assert(e.toInfixString() == "(x * 1.0)") // Ausgabe: (x * 1)
        assert(e.simplify().toInfixString() == "x") // Ausgabe: x
    }

    @Test
    fun test4(){
        val e = Add(Mul(Var("x"), Const(2)), Mul(Const(2), Var("x")))
        assert(e.toInfixString() == "((x * 2.0) + (2.0 * x))") // Ausgabe: ((x * 2.0) + (2.0 * x))
        assert(e.simplify().toInfixString() == "(2.0 * (x * 2.0))") // Ausgabe: (2.0 * (x * 2.0))
    }
}