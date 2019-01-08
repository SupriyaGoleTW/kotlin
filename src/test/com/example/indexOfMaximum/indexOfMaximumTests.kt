package test.com.example.indexOfMaximum
import main.com.example.indexOfMaximum.indexOfMaximumNumber
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class IndexOfMaximumTests{
    @Test
    fun shouldReturnIndexOfMaximumElementInArray(){
        assertEquals(1, indexOfMaximumNumber(arrayOf(10, 20, 5, 2)))
    }

    @Test
    fun shouldReturnNullIfGivenArrayIsEmpty(){
        assertEquals(null, indexOfMaximumNumber(arrayOf()))
    }
}
