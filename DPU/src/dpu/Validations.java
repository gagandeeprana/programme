package dpu;

public class Validations {

    public static boolean hasSpace(String str) {
        if (str.indexOf(" ") > 0) {
            return true;
        }
        return false;
    }

    public static boolean isEmpty(String str) {
        if (str.equals("")) {
            return true;
        }
        return false;
    }

    public static boolean hasNumerals(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!(ch >= '0' && ch <= '9')) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasAlphabets(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!(ch >= 'a' && ch <= 'z')) {
                return true;
            }
        }
        return false;
    }
}
