/*
 * ID: 6588152        NAME: Jinnipa Leepong
 * SEC: 2
 */

public class Coder {
    private static String code[] = {
            ".-", "-...", "-.-.", "-..", ".", "..-.",
            "--.", "....", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.", "--.-", ".-.", 
            "...", "-", "..-", "...-", ".--", "-..-", 
            "-.--", "--.."};
    
    //INCOMPLETE
    public static String encode(char c) {
        String str="?";
        //CODE HERE 
        c = Character.toLowerCase(c);
        if (c >= 'a' && c <= 'z' || Character.isWhitespace(c)) {
            int index = c - 'a';
            if(Character.isWhitespace(c)) {
            	return "  ";
            }
            if (index >= 0 && index < code.length) {
                return code[index] + " ";
            } else {
            	return "";
            }
        }
        return str;
        
    }
}

