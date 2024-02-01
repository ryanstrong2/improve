package problems;

import java.math.BigDecimal;
import java.util.*;
class Solution{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        BigDecimal a[] = new BigDecimal[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
            a[i] = new BigDecimal(s[i]);
        }
        sc.close();
        for(int i = 0;i<n;i++){
            for(int j=1;j<n;j++){
                if(a[i].compareTo(a[j])==-1){
                    BigDecimal temp = a[j];
                    a[j]=a[i];
                    System.out.println(a[j] + " <" + temp);
                    a[i]=temp;
                }
            }s[i]=a[i].toString();
            System.out.println(i);
        }
        //Write your code here
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}