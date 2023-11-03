class userInput {
    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            print("What is your name? ")
            var input = readln() // it will take user input as string and it is not null supported , and by type cast it can be converted
            println("My name is $input")
            print("Type a number ")
            var num = readLine()!!.toInt() // it is nullable and takes input as a string
            print("$num + 10 is : ${num+10}")
        }
    }
}