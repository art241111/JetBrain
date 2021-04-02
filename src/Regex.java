import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Solving the second problem.
 *
 * @author Created by Artem Gerasimov (gerasimov.av.dev@gmail.com).
 */
public class Regex {
    private static final Logger LOGGER = Logger.getLogger(Regex.class.getName());

    /**
     * In order to avoid freezes and errors, a pattern check was added.
     * If it did not pass the test, then the error text is simply displayed,
     * but the program does not stop working.
     *
     * @param text  - text to check,
     * @param regex - a regular expression.
     * @return true - if the value matches the condition, false-otherwise
     */
    public boolean matches(String text, String regex) {
        Pattern p;
        try {
            p = Pattern.compile(regex);

            return p.matcher(text).matches();
        } catch (PatternSyntaxException pse) {
            LOGGER.log(Level.WARNING, "Syntax error in a regular expression:" + pse.getMessage());
            LOGGER.log(Level.WARNING, "Error description: " + pse.getDescription());
            LOGGER.log(Level.WARNING, "Error position: " + pse.getIndex());
            LOGGER.log(Level.WARNING, "Erroneous template: " + pse.getPattern());
            return false;
        }
    }
}
