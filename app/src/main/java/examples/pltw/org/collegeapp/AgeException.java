package examples.pltw.org.collegeapp;

import java.util.Calendar;

/**
 * Created by wdumas on 4/12/16.
 */

public class AgeException extends RuntimeException {
    public AgeException(String message){
        super(message);
    }

    public String joinMessageAndYear(String message, int year) {
        return message + " " + year;
    }

    public boolean getDateComparison (int iYear){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        if(currentYear - iYear >= 8) {
            return true;
        }
        else {
            return false;
        }
    }

}
