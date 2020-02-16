package pl.coderlab.servletjee.servlet.utils;

public class Numeric {

    public static boolean isNumeric(char strNum) {
        if (strNum == ' ') {
            return false;
        }
        try {
            double d = Double.parseDouble(String.valueOf(strNum));
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
