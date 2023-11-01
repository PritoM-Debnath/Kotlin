package ConditionalStatement.Exercise

class VowelOrConsonant
{
    companion object
    {
        @JvmStatic
        fun main(args: Array<String>)
        {
            print("Enter an alphabet: ")
            val ch: Char = readLine()!!.single().toLowerCase()

            if((ch in 'a'..'z') || (ch in 'A'..'z'))
            {
                when(ch)
                {
                    'a', 'e', 'i', 'o', 'u' -> print("$ch is vowel.")
                    else -> print("$ch is consonant.")
                }
            }
            else {
                println("Invalid input.")
            }
        }
    }
}