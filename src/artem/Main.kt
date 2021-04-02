package artem

const val MAIN_NAME = "artem"

/**
 * Entry point to the program.
 *
 * At the first, we generate lexicalSequence, when [MAIN_NAME] is at the beginning.
 * Then reading all the names and counting their weights.
 * There are two ways to calculate the weight.
 * You can, given the source data, which says that the maximum word length is 100,
 * set the maximum word length immediately. The second way is to get all the names first,
 * determine the maximum word length, and then calculate the weight for each name.
 * The optimization is that we don't need to build constantly to a greater degree if all the names are short.
 * Then sorting names by weight.
 * Add at the end, if first element not [MAIN_NAME], then program
 * print "Impossible", else print [lexicalSequence]
 *
 * @author Created by Artem Gerasimov (gerasimov.av.dev@gmail.com).
 */
fun main() {
    // For example "artembcd..."
    val lexicalSequence = LexicalSequence.create("abcdefghijklmnopqrstuvwxyz", MAIN_NAME)

    val nameList = mutableListOf<Name>()
    var maxNameLength = 0

    val n = readLine()?.toInt()
    if (n != null) {
        for (i in 0 until n) {
            val nameStr = readLine()?.decapitalize() ?: ""

            if (nameStr.length > maxNameLength) {
                maxNameLength = nameStr.length
            }
            val name = Name(nameStr)
            nameList.add(name)
        }
    }

    nameList.forEach {
        it.calculateWeight(lexicalSequence, maxNameLength)
    }

    nameList.sortBy { it.weight }
    println(nameList)

    if (nameList[0].name.contains(MAIN_NAME)) {
        print(lexicalSequence)
    } else {
        print("Impossible")
    }
}