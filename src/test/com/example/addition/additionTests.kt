import main.com.example.addition.addAllNumbers
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
class AdditionTests {
    @Test
    fun testReturnsAdditionOfGivenNumbers(){
        assertEquals(150, addAllNumbers(arrayOf(10, 20, 30, 40, 50)))
        assertEquals(0, addAllNumbers(arrayOf()))
        assertEquals(0, addAllNumbers(arrayOf(-10, 10)))
    }
}
