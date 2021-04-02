package artem

import artem.extencion.toBigInteger
import java.math.BigInteger

/**
 * A class that stores a person's name and the weight of that name.
 *
 * @param name - student name.
 * @author Created by Artem Gerasimov (gerasimov.av.dev@gmail.com).
 */
class Name(val name: String) {
    var weight = BigInteger("0")

    override fun toString(): String {
        return "$name;$weight"
    }

    /**
     * @param lexicalSequence - the lexical sequence by which the weight is determined.
     * @param maxWordLength - maximum word length
     */
    fun calculateWeight(lexicalSequence: String, maxWordLength: Int) {
        weight = nameToArrayWeigh(name, lexicalSequence, maxWordLength)
    }

    private fun nameToArrayWeigh(name: String, lexicalSequence: String, maxWordLength: Int): BigInteger {
        val p = lexicalSequence.length.toBigInteger()
        var weight = BigInteger.valueOf(0L)

        name.forEachIndexed { index, c ->
            val element = lexicalSequence.indexOf(c)

            if (element != 0) {
                weight += element.toBigInteger() * p.pow(maxWordLength - index)
            }
        }

        return weight
    }
}
