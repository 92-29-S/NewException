fun getFactorial(value: Int): Int {
    if (value < 0) {
        throw FactorialException(false)
    } else if (value == 0) {
        return 1
    }

    if (value * getFactorial(value-1) < 0) {
        throw FactorialException(true)
    }
    return value * getFactorial(value-1)
}

fun main(args: Array<String>) {
    var someValue: Int
    while (true) {
        println("Введите число, из которого нужно получить факториал: ")
        someValue = readLine()!!.toInt()
        try {
            println("$someValue! = ${getFactorial(someValue)}")
        } catch (e: FactorialException) {
            if (e.message == "Factorial value got out of variable boundaries.") {
                println("Было введено слишком большое значение.")
            } else if (e.message == "Wrong factorial argument input (a negative number).") {
                println("Было введено отрицательное значение.")
            }
        }
    }
}