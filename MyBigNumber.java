
package javaapplication7;
import java.util.*;
import java.util.Scanner;


public class MyBigNumber {                                                                        

    public static String sum(String so1, String so2) {    
        String Result = "";
        int chuoi1 = so1.length();
        int chuoi2 = so2.length();
        int maxlen = (chuoi1 > chuoi2) ? chuoi1 : chuoi2;     
        int index1, index2;
        char a1, a2;
        int nho=0;
        int sum;
        System.out.println("so1 = "+ so1 +"\t" + "so2 = "+ so2);
        for (int i = 0; i < maxlen; i++) {              
            index1 = chuoi1 - i - 1;
            index2 = chuoi2 - i - 1;

            a1 = (index1 >= 0) ? so1.charAt(index1) : '0';  
            a2 = (index2 >= 0) ? so2.charAt(index2) : '0';

            sum = (a1 - '0') + (a2 - '0');
            Result = (sum % 10) + Result;
            nho = sum / 10;
        }
        if (nho > 0) {                                       //
            Result = nho + Result;
        }
        return Result;

    }
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string number: ");
		String so1 = sc.nextLine();
		System.out.println("Enter second string number: ");
		String so2 = sc.nextLine();
		System.out.println("Sum: " +sum(so1,so2));
	}

}
