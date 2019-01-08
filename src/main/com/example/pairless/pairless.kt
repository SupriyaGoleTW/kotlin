package main.com.example.pairless

import org.junit.jupiter.api.Test
import test.com.example.pairless.findPairless
import kotlin.test.assertEquals

class FindPairlessTests{
    @Test
    fun shouldReturnPairlessElement(){
        assertEquals(1, findPairless(intArrayOf(2,1,2,1, 1)))
    }

    @Test
    fun shouldReturn0IfNoPairlessElement(){
        assertEquals(0, findPairless(intArrayOf(2,2,1,1)))
    }
}
