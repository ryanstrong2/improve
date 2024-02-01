import problems.DiagonalDif;
import test.TestCountEIP;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        TestCountEIP.anInt(
//        );
//        System.out.println("Hello world!");
//
        List<List<Integer>> lists = Arrays.asList(Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(9, 7, 9));
        DiagonalDif.diagonalDifference(lists);
}}