//package problems;
//
//import java.math.BigDecimal;
//import java.util.ArrayList;
//// A vending machine has the following denominations: 1c, 5c, 10c, 25c, 50c, and $1.
////        Your task is to write a program that will be used in a vending machine to return change.
////        Assume that the vending machine will always want to return the least number of coins or notes.
////        Devise a function getChange(M, P) where M is how much money was inserted into the machine and P
////        the price of the item selected, that returns an array of integers representing the number of
////        each denomination to return.
////
////        Example:
////        getChange(5, 0.99) // should return [1,0,0,0,0,4]
////
////        getChange(3.14, 1.99) // should return [0,1,1,0,0,1]
////        getChange(3, 0.01) // should return [4,0,2,1,1,2]
////        getChange(4, 3.14) // should return [1,0,1,1,1,0]
////        getChange(0.45, 0.34) // should return [1,0,1,0,0,0]
////getChange(5,.99);
////        System.out.println(getChange(5,.99));
//public class change {
//
//    public static ArrayList<Integer> getChange(BigDecimal M, BigDecimal P){
//        //take amount paid - price == change divide change into $ .5 .25 .10 .05 .01
//        ArrayList<Integer> money = new ArrayList<>(6);
//        BigDecimal owed;
//        owed = M.subtract(P);
////            System.out.println(owed);
//        int dollar;
//        BigDecimal changeDue = new BigDecimal(owed);
//        dollar = (int)owed/1;
////            System.out.println(dollar);
//        owed = changeDue.subtract(BigDecimal.valueOf(dollar));
//        BigDecimal half = BigDecimal.valueOf(0);
//        BigDecimal quarter= BigDecimal.valueOf(0);
//        BigDecimal dime= BigDecimal.valueOf(0);
//        BigDecimal nickle= BigDecimal.valueOf(0);
//        double penny=0;
//        if (owed > .5) {
//            half = owed.divide(BigDecimal.valueOf(.5));
//            owed= owed.subtract(half√.5);
//        }
//        if (owed.compareTo(BigDecimal.valueOf(.25)) > 0) {
//            quarter = owed.divide(BigDecimal.valueOf(.25));
//            owed= owed.subtract(quarter.multiply(BigDecimal.valueOf(.25)));
//        }
//        if(owed.compareTo(BigDecimal.valueOf(.1))>.1) {
//            dime = owed.divide(BigDecimal.valueOf(.1);
//            owed = owed.subtract(dime.multiply(BigDecimal.valueOf(.1)));
//        }
//        if (owed.compareTo(BigDecimal.valueOf(.05))) {
//            nickle = owed.divide(BigDecimal.valueOf(.05);
//            owed =owed.subtract(nickle*.05);
//
//        }
//        if (owed > 0) {
//            penny = owed.divide(BigDecimal.valueOf(.01);
//        }
//
//        money.add(0,(int)penny);
//        money.add(1,(int)nickle);
//        money.add(2,(int)dime);
//        money.add(3,(int)quarter);
//        money.add(4,(int)half);
//        money.add(5,dollar);
////            Array.set(money,dollar,5);
//
//        return money;
//    }
//}
