package ConditionalStatement

class whenStatement {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val day = 5

            val result = when (day) {
                1 -> "Monday"
                2 -> "Tuesday"
                3 -> "Wednesday"
                4 -> "Thursday"
                5 -> "Friday"
                6 -> "Saturday"
                7 -> "Sunday"
                else -> "Invalid day."
            }
            println(result)
        }
    }
}