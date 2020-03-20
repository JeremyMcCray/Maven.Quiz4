package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {

        return  string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        String ans = "";
        if (str.length()>1){
            for (int i = 0; i < str.length() / 2; i++) {
                ans += str.charAt(i);
            }
            String mid = "" + str.charAt(str.length() / 2 + 1);
            ans += mid.toUpperCase();
            for (int i = str.length() / 2 + 1; i < str.length(); i++) {
                ans += str.charAt(i);
            }
        } else {
            ans+=str.toUpperCase();
        }
        return ans;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        return null;
    }

    public static Boolean isIsogram(String str) {
        return null;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        char[] strToCharArr = str.toCharArray();
        for (int i = 0; i < strToCharArr.length-1; i++) {
            if(strToCharArr[i] == strToCharArr[i+1]){
                return true;
            }
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        String ans = "";
        char[] strToCharArr = str.toCharArray();
        for (int i = 0; i < strToCharArr.length-1; i++) {
            if(!(strToCharArr[i] == strToCharArr[i+1] )){
                ans+=strToCharArr[i];
            }else{i++;}
        }
        ans+=str.charAt(str.length()-1);
        return ans;
    }

    public static String invertCasing(String str) {
        return null;
    }
}