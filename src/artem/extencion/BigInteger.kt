package artem.extencion

import java.math.BigInteger

/**
 * Because we have a large number of possible letters, we need to use a type that can store a large number.
 * [BigInteger] was chosen for this purpose.
 *
 * Since [BigInteger] does not have the ability to convert [Int], extension functions were written.
 *
 * @author Created by Artem Gerasimov (gerasimov.av.dev@gmail.com).
 */

fun Int.toBigInteger() = BigInteger.valueOf(this.toLong())