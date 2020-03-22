package eu.heili.vari

import eu.heili.mathsolver.Var
import org.junit.Test

class VarTests {
    /**
     * test getter and int setter
     */
    @Test
    fun testGetSet(){
        val e = Var("x")
        e.setValue(5)
        assert(e.value == 5.0)
    }

    /**
     * test double setter
     */
    @Test
    fun testGetDSet(){
        val e = Var("x")
        e.setValue(6.0)
        assert(e.value == 6.0)
    }

    /**
     * Test name getter
     */
    @Test
    fun testGetName(){
        val e = Var("x")
        assert(e.name == "x")
    }
}