package Loop.Exercises

class Fibonacci {
    companion object {
        @JvmStatic
        fun main(agrs: Array<String>)
        {
            // Problem statement: find the first n Fibonacci numbers

            var n: Int
            print("Enter the number of Fibonacci numbers: ")
            n = readLine()!!.toInt()

            var a: Long = 0
            var b: Long = 1
            var c: Long

            print("First $n Fibonacci numbers: ")
            when(n) {
                1 -> print("$a ")
                2 -> print("$a $b ")
                else -> {
                    print("$a $b ")
                    for (i in 3..n) {
                        c = a + b
                        print("$c ")
                        a = b
                        b = c
                    }
                }
            }
        }
    }
}