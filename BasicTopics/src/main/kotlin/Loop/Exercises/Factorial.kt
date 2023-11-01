package Loop.Exercises

class Factorial {
    companion object {
        @JvmStatic
        fun main(args: Array<String>)
        {

            // Problem Statement: Write a program to find the factorial of a number.

            print("Please enter a number: ")
            val num = readLine()!!.toInt()

            var factorial = 1

            if( num >= 0)
            {
                for(i in 1..num)
                {
                    factorial *= i
                }
                println("Factorial of $num is $factorial")
            } else {
                println("Please enter a positive number.")
            }

        }
    }
}