package Array.Problems

class SearchElement {
    companion object {
        @JvmStatic
        fun main(args: Array<String>)
        {
            // Problem statement: search an element in an array

            var n: Int
            print("Enter the number of elements: ")
            n = readLine()!!.toInt()

            var arr = IntArray(n)
            println("Enter the elements: ")
            for(i in 0 until n)
                arr[i] = readLine()!!.toInt()

            var key: Int
            print("Enter the element to be searched: ")
            key = readLine()!!.toInt()

            var flag = 0
            for(i in 0 until n)
            {
                if(arr[i] == key)
                {
                    flag = 1
                    break
                }
            }

            if(flag == 1)
                println("Element found")
            else
                println("Element not found")
        }
    }
}