package eu.heili.eqiv

import eu.heili.mathsolver.Add
import eu.heili.mathsolver.Const
import org.junit.Test

class EquivTests {
    @Test
    fun eqivToTest() {
        val en = Add(Const(2),Const(5))
        val en1 = Add(Const(2),Const(5))
        assert(en.isEquivto(en1))
    }

    @Test
    fun eqivnotToTest() {
        val en = Add(Const(2),Const(6))
        val en1 = Add(Const(2),Const(5))
        assert(!en.isEquivto(en1))
    }

    @Test
    fun equalsToTest() {
        val en = Add(Const(2),Const(5))
        assert(en.equals(en))
    }

    @Test
    fun equalsNotToTest() {
        val en = Add(Const(2),Const(5))
        val en1 = Add(Const(2),Const(5))
        assert(!en.equals(en1))
    }
}