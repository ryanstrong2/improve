package problems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {
        final String regularExpression = "[a-zA-Z][a-zA-Z0-9_]{7,29}+";//first char is letter, any lettern number or _ 8-30
//        String regex = "\\b(\\w+)(\\s+\\1\\b)+"; //finds a word
        String regex = "<([a-zA-Z0-9]*)\b[^>]*>(.*?)</\1>";//finds open and close tag
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE/* Insert the correct Pattern flag here.*/);
        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        while (numSentences > 0) {
            String input = in.nextLine();
            Matcher m = p.matcher(input);
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(0)/* The regex to replace */, m.group(1)/* The replacement. */);
            }
            // Prints the modified sentence.
            System.out.println(input);
            numSentences--;
        }
        in.close();
    }
}