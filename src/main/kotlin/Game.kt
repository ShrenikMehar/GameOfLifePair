package org.example

class Game(val matrix: List<List<Int>>) {
    fun nextIteration(x: Int, y: Int): Int {
        if (x == 0 && y == 0 && matrix[x][y] == 0) {
            if (((matrix[0][1] == 1 && matrix[1][1] == 1) || matrix[1][0] == 1)) return 1
        } else if (x == 0 && y == 0 && matrix[x][y] == 1) {
            if ((matrix[0][1] == 0 && matrix[1][1] == 0) || matrix[1][0] == 0)
                return 0
            if (((matrix[0][1] == 1 && matrix[1][1] == 1) || matrix[1][0] == 0))
                return 1
            if ((matrix[0][1] == 0 && matrix[1][1] == 1) || matrix[1][0] == 1)
                return 1
        }
        if (x == 0 && y == 1 && matrix[x][y] == 0) {
            println("inside if")
            if (((matrix[0][0] == 0 && matrix[1][1] == 0) && matrix[1][0] == 0))
                println("inside if another 1")
                return 0
            if (((matrix[0][0] == 1 && matrix[1][1] == 1) || matrix[1][0] == 0))
                println("inside if another 2")
                return 1
        }
        return 0
    }
}