package eu.heili.addition

import eu.heili.mathsolver.*
import org.junit.Ignore
import org.junit.Test


class AdditionTest {
    @Test
    fun simplify() {
        val en = Add(
            Add(
                Const(0.0),
                Const(3.0)
            ), Add(Const(0.0), Const(0.0))
        ).simplify()
        assert(en.toInfixString() == "3.0")
    }

    @Test
    fun simplifyToMul() {
        val en = Add(
            Const(2.0),
            Const(2.0)
        ).simplify()
        assert(
            en.toInfixString() == Mul(
                Const(2.0),
                Const(2.0)
            ).toInfixString()
        )
    }

    @Ignore // not duty but would optionally be nice.
    @Test
    fun simplify4Add() {
        val en = Add(
            Add(
                Const(2.0),
                Const(2.0)
            ), Add(Const(2.0), Const(2.0))
        ).simplify()
        println(en.toInfixString())
        assert(
            en.toInfixString() == Mul(
                Const(4.0),
                Const(2.0)
            ).toInfixString()
        )
    }

    @Test
    fun evaluate() {
        val e: Expr = Add(
            Mul(Const(8.0), Var("x", 5.0)),
            Const(5.0)
        )
        assert(e.evaluate() == 45.0)
    }

    @Test
    fun toInfixString() {
        val e: Expr = Add(
            Mul(Const(8.0), Var("x", 5.0)),
            Const(5.0)
        )
        assert(e.toInfixString() == "((8.0 * x) + 5.0)")
    }
}