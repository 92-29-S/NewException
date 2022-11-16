class FactorialException(info_type: Boolean) : ArithmeticException() {
    override var message: String = ""
    private var Type: Boolean = info_type

    init {
        if (Type) {
            message = "Factorial value got out of variable boundaries."
        } else {
            message = "Wrong factorial argument input (a negative number)."
        }
    }
}