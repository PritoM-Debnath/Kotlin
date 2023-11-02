package ConditionalStatement.Exercise

class Palindrome {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            // Problem statement: check whether a string is palindrome or not

            var str: String
            print("Enter the string: ")
            str = readLine()!!

            var rev = str.reversed()
            if (str == rev)
                println("Palindrome")
            else
                println("Not Palindrome")
        }
    }
}