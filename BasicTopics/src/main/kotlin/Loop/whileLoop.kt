package Loop

class whileLoop {
    /*
    Loops can execute a block of code as long as a specified condition is reached.Loops are handy because they save time,
    reduce errors, and they make code more readable.
     */
    companion object {
        @JvmStatic
        /*
        if we want to print the number serially then we can use loop for that
         */
        fun main(args: Array<String>) {

            var i = 0// initiate the counter
            while (i < 5) { // set a braking condition
                println(i)
                i++ // incrementation
            }
        }
    }
}