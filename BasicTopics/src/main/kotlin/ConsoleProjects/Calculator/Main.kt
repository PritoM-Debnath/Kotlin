package ConsoleProjects.Calculator

class Main {
    companion object {
        @JvmStatic
        fun main(agrs: Array<String>)
        {
            println("Welcome to the calculator!!!")
            var calc = Calc()
            var choice: Int
            var a: Float
            var b: Float

            do {
                calc.showInitialOptions()
                print("Enter your choice: ")
                choice = readLine()!!.toInt()

                if(choice == 5){
                    println("Thank you for using the calculator!!!")
                    println("Exiting...")
                    break
                }
                if(choice < 1 || choice > 5){
                    println("Invalid choice")
                    continue
                }

                print("Enter the first number: ")
                a = readLine()!!.toFloat()
                print("Enter the second number: ")
                b = readLine()!!.toFloat()

                when(choice) {
                    1 -> println("Sum of $a and $b is ${calc.add(a, b)}")
                    2 -> println("Difference of $a and $b is ${calc.sub(a, b)}")
                    3 -> println("Product of $a and $b is ${calc.mul(a, b)}")
                    4 -> println("Division of $a and $b is ${calc.divide(a, b)}")
                    else -> println("Invalid choice")
                }
            } while(choice != 5)

        }
    }
}