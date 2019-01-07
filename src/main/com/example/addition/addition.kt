package main.com.example.addition

fun main(args : Array<String>){
    val numbers = arrayOf(10, 20, 30, 40, 50)
    print(addAllNumbers(numbers))
}

fun addAllNumbers(numbers: Array<Int>) : Int {
    return numbers.fold(0) {sum, element -> sum + element}
}
