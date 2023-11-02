package Array.Problems

class AverageOfElements {
    companion object{
        @JvmStatic
        fun main(args: Array<String>)
        {
            // Problem statement: find the average of elements in an array

            var n: Int
            print("Enter the number of elements: ")
            n = readLine()!!.toInt()

            var arr = IntArray(n)
            println("Enter the elements: ")
            for(i in 0 until n)
                arr[i] = readLine()!!.toInt()

            var sum: Float = 0.0f
            for(i in 0 until n)
                sum += arr[i]

            var avg:Float = sum / n
            println("Average of elements: $avg")
        }
    }
}