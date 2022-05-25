// region imports
import problems.FindPivot
import problems.LargestAtleastTwice
import problems.PlusOne


// endregion imports

fun main(args: Array<String>) {

    // Plus one
    plusOne()
    // Plus one


    // Largest at least twice as other numbers
    // largestAtLeastTwice()

    // find pivot
    //findPivot()
}

// region PlusOne
fun plusOne() {
    val pO = PlusOne()
    pO.callPlusOne()
}
// endregion PlusOne

// region LargestAtLease twice as other numbers
private fun largestAtLeastTwice() {
    val lT = LargestAtleastTwice()
    lT.largestAtLeastTwice()
}
// endregion

// region findPivot
private fun findPivot() {
    val fp = FindPivot()
    fp.callFindPivot()
}
// endregion findPivot