package artem

/**
 * This class generates from the default sequence,
 * the sequence that has the [mainName] at the beginning.
 *
 * @author Created by Artem Gerasimov (gerasimov.av.dev@gmail.com).
 */
class LexicalSequence {
    companion object {
        fun create(defaultLexicalSequence: String, mainName: String): String {
            var lexicalSequence = defaultLexicalSequence
            mainName.forEach { c ->
                lexicalSequence.replace(c.toString(), "", true)
            }
            lexicalSequence = mainName + lexicalSequence

            return lexicalSequence
        }
    }
}
