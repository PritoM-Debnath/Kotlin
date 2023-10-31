package ConditionalStatement.Exercise

class EvenOrOdd {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            // Problem Statement: Write a program to check whether a number is even or odd.

            print("Please enter a number: ")
            val num = readLine()!!.toInt()

            if(num % 2 == 0)
                println("$num is even.")
            else
                println("$num is odd.")

        }
    }
}