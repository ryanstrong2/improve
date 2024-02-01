package problems;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.Math.abs;
import static java.util.stream.Collectors.toList;

public class DiagonalDif {
    public static String diagonalDifference(List<List<Integer>> arr) {
        int topD=0;
        int bottomU=0;
        for(int i = 0; i<arr.size(); i++){
            int value = arr.get(i).get(i);
            topD += value;
            int botI = (arr.size()-1-i);
            int bottomValue = arr.get(botI).get(i);
            bottomU+=bottomValue;
        }
        int dif = abs(topD - bottomU);
        System.out.println(dif);
        System.out.println(topD);
        System.out.println(bottomU);
        return "hi";
    }
    public static class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<List<Integer>> arr = new ArrayList<>();

            IntStream.range(0, n).forEach(i -> {
                try {
                    arr.add(
                            Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                    .map(Integer::parseInt)
                                    .collect(toList())
                    );
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

            String result = DiagonalDif.diagonalDifference(arr);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }

}
