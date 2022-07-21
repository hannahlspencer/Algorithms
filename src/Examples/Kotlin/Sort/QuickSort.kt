fun quickSort(array: IntArray, left: Int, right: Int) {
    val index = partition(array, left, right)

    if(left < index-1) {
        quickSort(array, left, index - 1)
    }

    if(index < right) {
        quickSort(array, index, right)
    }

}

fun partition(array: IntArray, l: Int, r: Int): Int {
    var left = l
    var right = r
    val pivot = array[(left + right) / 2]

    while(left <= right) {
        while(array[left] < pivot) {
            left++
        }

        while(array[right] > pivot) {
            right--
        }

        if(left <= right) {
            val temp = array[left]
            array[left] = array[right]
            array[right] = temp
            left++
            right--

        }
    }

    return left
}

fun quickSortWithFilter(list: List<Int>): List<Int> {
    if(list.count() < 2) {
        return list
    }
    val pivot = list[list.count()/2]

    val less = list.filter { it < pivot }
    val equal = list.filter { it == pivot }
    val more = list.filter { it > pivot }
    return quickSortWithFilter(less) + equal + quickSortWithFilter(more)
}

fun main(args: Array<String>) {
    val numbers = mutableListOf(18, 27, 47, 4, 92, 19)
    val sortedList = quickSortWithFilter(numbers)
    println("Unsorted: $numbers")
    println("Sorted: $sortedList")

    val array = intArrayOf(18, 27, 47, 4, 92, 19)
    quickSort(array, 0, array.size-1)
    for(i in array) print("$i ")
}