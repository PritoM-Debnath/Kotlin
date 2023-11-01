package Loop.Exercises.PatternPrinting

class Triangle {
    companion object {
        @JvmStatic
        fun main(agrs: Array<String>)
        {
            // Problem statement: Print a triangle of stars

            var n: Int = 0

            do{
                print("Please enter the number of rows n (where n>1): ")
                n = readLine()!!.toInt()
            }
            while (n < 2)

            for (i in 1..n) {
                for (j in 1..i) {
                    print("* ")
                }
                println()
            }

        }
    }
}