
    fun mergeSort(list: List<Int>): List<Int> {
        if(list.size <= 1) {
            return list
        }

        val split = list.size / 2
        val left = list.subList(0, split)
        val right = list.subList(split, list.size)

        return merge(mergeSort(left), mergeSort(right))
    }

    fun merge(left: List<Int>, right: List<Int>): List<Int> {
        var result = mutableListOf<Int>()

        var indexLeft = 0
        var indexRight = 0
        while(indexLeft < left.count() && indexRight < right.count()) {
            if(left[indexLeft] <= right[indexRight]) {
                result.add(left[indexLeft])
                indexLeft++
            } else {
                result.add(right[indexRight])
                indexRight++
            }
        }

        if(indexLeft < left.size) {
            result = (result + left.subList(indexLeft, left.size)).toMutableList()
        }

        if(indexRight < right.size) {
            result = (result + right.subList(indexRight, right.size)).toMutableList()
        }

        return result
    }



fun main(args: Array<String>) {
    val numbers = mutableListOf(18, 27, 47, 4, 92, 19)
    val sortedList = mergeSort(numbers)
    println("Unsorted: $numbers")
    println("Sorted: $sortedList")
}