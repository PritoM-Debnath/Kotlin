package Array.Problems

class SortElements {
    companion object {
        @JvmStatic
        fun main(agrs: Array<String>)
        {
            // Problem statement: sort the elements in an array

            var n: Int
            print("Enter the number of elements: ")
            n = readLine()!!.toInt()

            var arr = IntArray(n)
            println("Enter the elements: ")
            for(i in 0 until n)
                arr[i] = readLine()!!.toInt()

            var temp: Int
            for(i in 0 until n-1) {
                for(j in 0 until n-i-1) {
                    if(arr[j] > arr[j+1]) {
                        temp = arr[j]
                        arr[j] = arr[j+1]
                        arr[j+1] = temp
                    }
                }
            }

            println("Sorted array: ")
            for(i in 0 until n)
                print("${arr[i]} ")
        }
    }
}