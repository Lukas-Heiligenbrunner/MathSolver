package eu.heili.addition

import eu.heili.mathsolver.*
import org.junit.Test


class AdditionTest {

    @Test
    fun simplify() {
        val en = Addition(Addition(Val(0.0), Val(3.0)), Addition(Val(0.0), Val(0.0))).simplify()
        assert(en.toInfixString() == "3.0")
    }

    @Test
    fun simplifyToMul() {
        val en = Addition(Val(2.0), Val(2.0)).simplify()
        assert(en.toInfixString() == Multiplication(Val(2.0), Val(2.0)).toInfixString())
    }

    @Test
    fun simplify4Add() {
        val en = Addition(Addition(Val(2.0), Val(2.0)), Addition(Val(2.0), Val(2.0))).simplify()
        println(en.toInfixString())
        assert(en.toInfixString() == Multiplication(Val(4.0), Val(2.0)).toInfixString())
    }

    @Test
    fun evaluate() {
        val e: Expression = Addition(Multiplication(Val(8.0), Var("x", 5.0)), Val(5.0))
        assert(e.evaluate() == 45.0)
    }

    @Test
    fun toInfixString() {
        val e: Expression = Addition(Multiplication(Val(8.0), Var("x", 5.0)), Val(5.0))
        assert(e.toInfixString() == "((8.0 * x) + 5.0)")
    }
}