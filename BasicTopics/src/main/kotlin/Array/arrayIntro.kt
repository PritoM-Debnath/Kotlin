package Array

class arrayIntro {
    companion object {
        @JvmStatic
       fun main(args: Array<String>){
            //Arrays are used to store multiple values in a single variable, instead of creating separate variables for each value.
            //To create an array, use the arrayOf() function, and place the values in a comma-separated list inside it:
            val favouriteFruits = arrayOf("Mango", "Banana", "Oranges", "Grapes")
            print(favouriteFruits[0])


       }
    }
}