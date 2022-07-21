
fun bubbleSort(nums: List<Int>): List<Int> {
    val length = nums.size - 2
    val mutableNums = nums.toMutableList()
    for(i in 0..length) {
        for(j in 0..length - i) {
            if(mutableNums[j] > mutableNums[j + 1]) {
                val temp = mutableNums[j]
                mutableNums[j] = mutableNums[j + 1]
                mutableNums[j + 1] = temp
            }
        }
    }
    return mutableNums
}

fun main(args: Array<String>) {
    val numbers = mutableListOf(18, 27, 47, 4, 92, 19)
    val sortedList = bubbleSort(numbers)
    println("Unsorted: $numbers")
    println("Sorted: $sortedList")
}