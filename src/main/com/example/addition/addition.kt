package main.com.example.addition

fun addAllNumbers(numbers: Array<Int>) : Int {
    return numbers.fold(0) {sum, element -> sum + element}
}
