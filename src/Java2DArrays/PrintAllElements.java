package Java2DArrays;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;
public class PrintAllElements {
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the size of rows=");
        int rows=sc.nextInt();
        System.out.println("enter the size of columns=");
        int columns=sc.nextInt();
        int arr[][]=new int[rows][columns];
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix of the entered number =");
        for(int i=0;i<arr.length;i++) {
            for (int j=0;j<arr[i].length;j++) {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
