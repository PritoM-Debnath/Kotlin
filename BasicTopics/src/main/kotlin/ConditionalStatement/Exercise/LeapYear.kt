package ConditionalStatement.Exercise

class LeapYear {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            // Problem Statement: Write a program to check whether a year is leap year or not.

            print("Please enter a year: ")
            val year = readLine()!!.toInt()

            if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                println("$year is a leap year.")
            else
                println("$year is not a leap year.")

        }
    }
}