package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pyramid {

    public String pyramid(String arg) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer,String> code = new HashMap<>();
        StringBuilder out = new StringBuilder();
        Pattern pattern = Pattern.compile("\\b(\\w+) (\\w+)\\b");
        Matcher matcher = pattern.matcher(arg);
        while (matcher.find()) {
            Integer key = Integer.valueOf(matcher.group(1));
            String value = matcher.group(2);
            code.put(key,value);

        }
        int y = 1;
        for (int x = 1;y<=code.size();x++){//123
            out.append(code.get(y));
                if (y < code.size()) {
                    out.append(" ");
                }
            y+=x+1;

        }
        try {
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String result = (out.toString());
        return result;
    }
}
//
//        for (int i =0;i<50;i++) {
//        try {
//        String key = bufferedReader.readLine().);
//        String val = bufferedReader.next();
//        code.put(key, val);
//        } catch (Exception e) {
//        throw new RuntimeException(e);
//        }
