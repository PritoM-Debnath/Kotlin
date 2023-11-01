package Array.Problems

class MaximumAndMinimum {
    companion object {
        @JvmStatic
        fun main(agrs: Array<String>)
        {
            // Problem statement: find the maximum and minimum element in an array

            var n: Int
            print("Enter the number of elements: ")
            n = readLine()!!.toInt()

            var arr = IntArray(n)
            println("Enter the elements: ")
            for(i in 0 until n)
                arr[i] = readLine()!!.toInt()

            var max = arr[0]
            var min = arr[0]

            for(i in 1 until  n) {
                if(arr[i] > max)
                    max = arr[i]
                if(arr[i] < min)
                    min = arr[i]
            }

            println("Maximum element: $max")
            println("Minimum element: $min")
        }
    }
}