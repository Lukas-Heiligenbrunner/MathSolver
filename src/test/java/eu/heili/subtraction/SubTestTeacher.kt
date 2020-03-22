package eu.heili.subtraction

import eu.heili.mathsolver.*
import org.junit.Test

class SubTestTeacher {
    @Test
    fun test() {
        val e: Expr = Sub(Var("x"), Var("x"))
        assert(e.toInfixString() == "(x - x)") // Ausgabe: (x - x)
        assert(e.simplify().toInfixString() == "0.0") // Ausgabe: 0.0
    }

    @Test
    fun test1(){
        val e = Sub(Var("x"), Const(0))
        assert(e.toInfixString() == "(x - 0.0)") // Ausgabe: (x - 0.0)
        assert(e.simplify().toInfixString() == "x") // Ausgabe: x
    }

    @Test
    fun test2(){
        val e = Sub(Add(Var("x"), Const(2)), Add(Var("x"), Const(2)))
        assert(e.toInfixString() == "((x + 2.0) - (x + 2.0))") // Ausgabe: ((x + 2.0) - (x + 2.0))
        assert(e.simplify().toInfixString() == "0.0") // Ausgabe: 0.0
    }
}