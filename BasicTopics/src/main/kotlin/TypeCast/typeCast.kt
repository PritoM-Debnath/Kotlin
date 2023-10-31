package TypeCast

class typeCast {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            /*
        Type Cast :-

        To convert a numeric data type to another type, you must use one of the following functions:
        --toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble() or toChar()
         */
            var x = 10
            var y : String = x.toString()
            println(y +" "+ x)

            //User Input:

            val age = readlnOrNull()?.toInt() // here the input is taken and converted into integer
            print(age)

        }
    }
}