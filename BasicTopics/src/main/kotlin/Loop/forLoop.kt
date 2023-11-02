package Loop

class forLoop {
    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            //for is another kind of loop, we can use this in many ways depend on the requirements

            var item = IntArray(3)

            println("Enter elements")
            for (i in 0 until 3)
                item[i]= readLine()!!.toInt()

            for (x in item)
                println(x)

            if (10 in item) print("Present")

        }
    }


}