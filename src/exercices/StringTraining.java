public class StringTraining {

    /**
     * @param firstname, ie : "Brandon"
     * @return a string that concatenates "Hello " and firstname, ie : "Hello Brandon"
     */
    String firstname = "Brandon";

    public static String helloFirstname(String firstname) {

        return "Hello " + firstname;
    }

    /**
     * @param first  word, ie : "test"
     * @param second word, ie : "value"
     * @return a string with both word, ie : "testvalue"
     */
    String first  = "test";
    String second = "value";


    public static String concatArgs(String first, String second) {

        return first + second;
    }

    /**
     * @param origin  string, eg: "test"
     * @param compare string, eg: "sample"
     * @return if origin string is equal to compare string
     */
    String origin  = "test";
    String compare = "sample";

    public static boolean equals(String origin, String compare) {

        if(origin.equals(compare)) {
         return true;
        }

        return false;
    }

    /**
     * @param value character, eg: 't'
     * @return conversion of the character into String, eg: "t"
     */
    char value = 't';
    public static String charToString(char value) {
       
        //return String.valueOf(value);
        return Character.toString(value);
    }

    /**
     * @param value integer, eg: 3
     * @return convertion of the integer into String, eg: "3"
     */
    int intValue = 3;
    public static String intToString(int intValue) {

        return String.valueOf(intValue);
    }

    /**
     * @param string, eg: "test"
     * @return string length, eg: 4
     */
    String stringLeng  = "test";
    public static int length(String stringLeng) {
        return stringLeng.length();
    }

    /**
     * @param string, ie "test"
     * @return string in upper case, eg: "TEST"
     */
    String stringUp  = "test";
    public static String upper(String stringUp) {
 
        return stringUp.toUpperCase();
    }

    /**
     * @param string, eg: "TEST"
     * @return string in lower case, eg: "test"
     */
    String stringLow  = "TEST";
    public static String lower(String stringLow) {

        return stringLow.toLowerCase();
    }

    /**
     * @param string, eg: "test"
     * @return first character of the string, eg: 't'
     */
    String stringIch  = "test";
    public static char firstChar(String stringIch) {

        return stringIch.charAt(0);
    }

    /**
     * @param string, eg: "value"
     * @return last character of the string, eg: 'e'
     */
    String stringLastCh  = "value";
    public static char lastChar(String stringLastCh) {

        return stringLastCh.charAt(stringLastCh.length() - 1);
    }

    /**
     * @param string, eg: "test"
     * @param begin   position (inclusive) of the substring, eg: 1
     * @param end     postion (exclusive) of the substring, eg: 3
     * @return the substring from begin position to end position, eg: "es"
     */
    String stringSub  = "test";
    int begin = 1; 
    int end = 3;
    public static String subString(String stringSub, int begin, int end) {
        // https://howtodoinjava.com/java/string/java-string-substring-example/

        return stringSub.substring(begin,end);
    }

    /**
     * @param string, eg: "test"
     * @return the string with the first character in upper case, eg: "Test"
     */
    String stringCap  = "test";
    public static String capitalize(String stringCap) {

        return stringCap.substring(0, 1).toUpperCase() + stringCap.substring(1);
    }

    /**
     * @param string, eg: "test"
     * @param search  character, eg: 't'
     * @return the number of character occurrences in string, eg: 2
     */
    String stringOcc  = "test";
    char   searchOcc  = 't';
    public static int occurrences(String stringOcc, char searchOcc) {

      int count = 0;
      for (int i=0; i < stringOcc.length(); i++){
          if (stringOcc.charAt(i) == searchOcc){
            count++;
          }
      }
      return count;
    }

    /**
     * @param string,  eg: "test"
     * @param search,  eg: 't'
     * @param replace, eg: 'w'
     * @return the string where searched characters are replaced, eg: "wesw"
     */
    String stringRepAll  = "test";
    char searchT  = 't';
    char replaceW = 'w';
    public static String replaceChar(String stringRepAll, char searchT, char replaceW) {

        return stringRepAll.replaceAll(String.valueOf(searchT), String.valueOf(replaceW));
    }

    /**
     * @param string,  eg: "test"
     * @param search,  eg: "e"
     * @param replace, eg: "oa"
     * @return the string where searched substring are replaced, eg: "toast"
     */
    String stringRep = "test";
    String searchCh  = "e";
    String replaceBy = "oa";
    public static String replaceString(String stringRep, String searchCh, String replaceBy) {

        return stringRep.replace(searchCh, replaceBy);
    }

    /**
     * @param string,    eg: "test|value"
     * @param delimiter, eg: "|"
     * @return string array that contains values splited on the delimiter, eg: {"test", "value"}
     */
    String stringSp   = "test|value";
    String delimiter  = "\\|";
    public static String[] split(String stringSp, String delimiter) {
        // https://howtodoinjava.com/java/string/java-string-split-example/
      
        return stringSp.split(delimiter);
    }

    /**
     * @param strings    array, eg: {"test", "value"}
     * @param delimiter, eg: ";"
     * @return string of array values joined with the delimiter, ex: "test;value"
     */
    String[] strings  = {"test", "value"};
    String delimit  = "; ";
    public static String join(String[] strings, String delimit) {
        // https://howtodoinjava.com/java8/java-8-join-string-array-example/

        return String.join(delimit, strings);
    }
}
