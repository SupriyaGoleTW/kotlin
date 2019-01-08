package test.com.example.pairless

fun findPairless(a: IntArray): Int {
    return a.reduce { x, y -> x xor y }
}
