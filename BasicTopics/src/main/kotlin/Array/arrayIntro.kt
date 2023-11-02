package Array

class arrayIntro {
    companion object {
        @JvmStatic
       fun main(args: Array<String>){
            //Arrays are used to store multiple values in a single variable, instead of creating separate variables for each value.
            //To create an array, use the arrayOf() function, and place the values in a comma-separated list inside it:

            val favouriteFruits = arrayOf("Mango", "Banana", "Oranges", "Grapes") // initialization of array
            print(favouriteFruits[0]) // this is how we can traverse an array

            //how to show the elements then ? -> By simply using a loop which will traverse all the element

            var x : String
            for(x in favouriteFruits){
                println(x)
            }
            //taking user input in array
            print("Enter the elements")
            var item = IntArray(3)
            for (i in 0 until 3)
                item[i]= readLine()!!.toInt()

            for (i in 0 until 3)
                println(item[i])

            //there are some functions which are very useful
            favouriteFruits.reverse() // this will reverse the array by index
            println("It will print the size of the array : ${favouriteFruits.size}")

       }
    }
}