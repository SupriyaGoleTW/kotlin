package main.com.example.indexOfMaximum

fun indexOfMaximumNumber(numbers : Array<Int>) : Int? {
    if(numbers.isNotEmpty()) {
        var maxIndex = 0
        for (index in numbers.indices) {
            val currentElement = numbers[index]
            if (currentElement > numbers[maxIndex]) {
                maxIndex = index
            }
        }
        return maxIndex
    }
    return null
}

