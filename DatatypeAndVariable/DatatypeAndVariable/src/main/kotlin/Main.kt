fun main() {
    println("Hello World!")


    /*To create a variable, use var or val. The difference between var and val is that variables
    declared with the var keyword can be changed/modified, while val variables cannot */

    var firstName = "pritom"
    val lastName = "debnath"
    println("My name is "+firstName+" " +lastName)

    firstName="pratik"
    //lastName = "Pandit"
    // As lastName is declared val it can not be modified, you can try to uncomment line 12 and check it
    println("My name is "+firstName+ " " +lastName)

    /*The general rule for Kotlin variables are:

    -Names can contain letters, digits, underscores, and dollar signs
    -Names should start with a letter
    -Names are case sensitive ("myVar" and "myvar" are different variables)
    -Names should start with a lowercase letter and it cannot contain whitespace
    -Reserved words (like Kotlin keywords, such as var or String) cannot be used as names
     */


    /*kotlin can detect the input, so mentioning the data type is not mandatory if value is assigned. In case
    value is not assigned while declaring then data type should be mentioned*/

    var age: Int
    age = 23
    println("My age is "+ age)

    /*Data types are divided into different groups:
    -Numbers
    -Characters
    -Booleans
    -Strings
    -Arrays
    */

    /*
    Number types are divided into two groups:
    -Integer types store whole numbers, positive or negative (such as 123 or -456), without decimals.
    Valid types are Byte, Short, Int and Long.
    -Floating point types represent numbers with a fractional part, containing one or more decimals.
    There are two types: Float and Double.
     */
    
    val intNum: Int = 100000
    println(intNum)

    val longNum: Long = 15000000000L
    println(longNum)


}