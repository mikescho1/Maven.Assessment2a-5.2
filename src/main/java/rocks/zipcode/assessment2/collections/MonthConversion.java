package rocks.zipcode.assessment2.collections;

import java.util.HashMap;

/**
 * Use a map to solve
 */
public class MonthConversion {
    private HashMap<Integer, String> monthConversion;
    private Integer monthNumber;
    private String monthName;

//    /**
//     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
//     * @param monthName - name of month
//     */

    public MonthConversion()    {
        monthConversion = new HashMap<Integer, String>();


    }


    public void add(Integer monthNumber, String monthName) {

        monthConversion.put(monthNumber, monthName);

    }


//     * @param monthNumber - ordinal of month in the year
//     * @return the name of the respective month
//     */
    public String getName(Integer monthNumber) {

        throw new NullPointerException(monthConversion.get(monthNumber));

    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName) {
        return (Integer)null;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        return null;
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        return null;
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return -1;
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {

    }
}
