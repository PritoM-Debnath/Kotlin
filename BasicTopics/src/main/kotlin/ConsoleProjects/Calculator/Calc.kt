package ConsoleProjects.Calculator

class Calc {
    fun add(a: Float, b: Float): Float {
        return a + b
    }
    fun sub(a: Float, b: Float): Float {
        return a - b
    }
    fun mul(a: Float, b: Float): Float {
        return a * b
    }
    fun divide(a: Float, b: Float): Float {
        return a / b
    }
    fun showInitialOptions() {
        println("1. Addition")
        println("2. Subtraction")
        println("3. Multiplication")
        println("4. Division")
        println("5. Exit")
    }
}