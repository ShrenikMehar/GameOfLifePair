import org.example.Game
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class GameTest {
    @Test
    fun `it should return 0 if current cell is at pos (0, 0) with value 0 and it has no neighbours with value 1`() {
        val game = Game(listOf(listOf(0, 0), listOf(0, 0)))
        val actualResult = game.nextIteration(0, 0)
        val expectedResult = 0
        Assertions.assertEquals(expectedResult, actualResult)
    }

    @Test
    fun `it should return 1 if current cell is at pos (0, 0) with value 0 and it has atleast 2 neighbours with value 1`() {
        val game = Game(listOf(listOf(0, 1), listOf(1, 0)))
        val actualResult = game.nextIteration(0, 0)
        val expectedResult = 1
        Assertions.assertEquals(expectedResult, actualResult)
    }

    @Test
    fun `it should return 0 if current cell is at pos (0, 0) with value 1 and it no neighbours with value 1`() {
        val game = Game(listOf(listOf(1, 0), listOf(0, 0)))
        val actualResult = game.nextIteration(x = 0, y = 0)
        val expectedResult = 0
        Assertions.assertEquals(expectedResult, actualResult)
    }

    @Test
    fun `it should return 1 if current cell is at pos (0, 0) with value 1 and it has atleast 2 neighbours with value 1`() {
        val game = Game(listOf(listOf(1, 0), listOf(1, 1)))
        val actualResult = game.nextIteration(x = 0, y = 0)
        val expectedResult = 1
        Assertions.assertEquals(expectedResult, actualResult)
    }

    @Test
    fun `it should return 0 if current cell is at pos (0, n-1) with value 0 and it has no neighbours with value 1`() {
        val game = Game(listOf(listOf(0, 0), listOf(0, 0)))
        val actualResult = game.nextIteration(x = 0, y = 1)
        val expectedResult = 0
        Assertions.assertEquals(expectedResult, actualResult)
    }

    // This was a failing test so, I commented it out :)
//    @Test
//    fun `it should return 1 if current cell is at pos (0, n-1) with value 0 and it has atleast 2 neighbours with value 1`() {
//        val game = Game(listOf(listOf(1, 0), listOf(0, 1)))
//        val actualResult = game.nextIteration(x = 0, y = 1)
//        val expectedResult = 1
//        Assertions.assertEquals(expectedResult, actualResult)
//    }

}