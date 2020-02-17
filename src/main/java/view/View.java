/**
 * Provides the classes necessary to communicate with a user.
 */

package view;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Contains all the messages for a user and  print methods.
 */
public class View implements TextConstant {
    static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
                    new Locale("ua", "UA"));  // Ukrainian
    //new Locale("en"));        // English


    /**
     * Method prints single String message.
     *
     */
    public void printMessage(String message) {
        System.out.println(message);
    }

    /**
     * Method concatenates 2 and more Strings.
     * @param message - variable arguments
     */
    public String concatenationString(String... message) {
        StringBuilder concatString = new StringBuilder();
        for (String v : message) {
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }

    public void printStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }

    public void printWrongStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(WRONG_INPUT_DATA),
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }

}