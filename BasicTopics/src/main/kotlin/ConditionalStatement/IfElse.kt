package ConditionalStatement

class ifElse {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var num = 10
            // In case of handeling conditional problem we can use If-else, lets see an example, a problem of finding the odd numbers.
            if(num > 0) {
                print("Positive number")
            } else if( num < 0){
                print("Negative number")
            } else {
                print("Non-negative number")
            }
            // In case we have one line after the if statement we can ignore using braces.

            if(num > 0) print("Positive number")
            else if( num < 0)   print("Negative number")
            else    print("Non-negative number")


        }
    }
}