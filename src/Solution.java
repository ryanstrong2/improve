import java.math.BigDecimal;
import java.util.*;
class Solution{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        BigDecimal a[] = new BigDecimal[n];

        for(int i = 0;i<n;i++){
            a[i] = new BigDecimal(s[i]);
            for(int j=1;j<n-1;j++){
                if(a[i].compareTo(a[j])==-1){
                    BigDecimal temp = new BigDecimal("9");
                    a[j]=a[i];
                    a[i]=temp;
                }if (a[i].compareTo(a[j])==0){
                    s[i]=a[i].toString();
                }
            }s[i]=a[i].toString();
        }
        //Write your code here

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}