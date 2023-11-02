package Function.Exercises

class BinarySearch {
    companion object {

        // Problem statement: find the index of an element in an array using binary search

        fun BinarySearch(arr: IntArray, low: Int, high: Int, key: Int): Int {

            var low = low
            var high = high
            while (low <= high) {
                val mid = (high + low) / 2
                if (arr[mid] == key)
                    return mid
                if (arr[mid] < key)
                    low = mid + 1
                else
                    high = mid - 1
            }
            return -1
        }

        @JvmStatic
        fun main(args: Array<String>)
        {

            var n:Int
            print("Enter the number of elements: ")
            n = readLine()!!.toInt()

            var arr = IntArray(n)
            println("Enter array elements: ")
            for(i in 0 until n)
                arr[i] = readLine()!!.toInt()

            var key: Int
            print("Enter the key/value to search: ")
            key = readLine()!!.toInt()

            var index = BinarySearch(arr, 0, n-1, key)
            if(index == -1)
                println("Element not found")
            else
                println("Element found at index $index")
        }
    }
}