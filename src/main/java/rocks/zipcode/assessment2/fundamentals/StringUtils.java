package rocks.zipcode.assessment2.fundamentals;

import java.util.Collections;
import java.util.regex.*;
import java.util.stream.Collectors;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        String padding = " ";
        String repatedStr = new String(new char[amountOfPadding - stringToBePadded.length()]).replace("\0", padding);
        return repatedStr + stringToBePadded;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        String padding = " ";
        String repatedStr = new String(new char[amountOfPadding - stringToBePadded.length()]).replace("\0", padding);
        return stringToBePadded + repatedStr;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {

        String newString = Collections.nCopies(numberOfTimeToRepeat, stringToBeRepeated).stream().collect(Collectors.joining(""));

        return newString;
    }


    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        return string.matches("^[a-zA-Z ]*$");
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        return string.matches("^[0-9]*$");
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        return string.matches("^[^a-zA-Z 0-9]*$");
    }
}
