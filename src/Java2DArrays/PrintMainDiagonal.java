package Java2DArrays;
import java.util.*;
public class PrintMainDiagonal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of rows=");
        int rows=sc.nextInt();
        System.out.println("enter the size of columns=");
        int columns=sc.nextInt();
        System.out.println("enter the Matrix "+"("+rows+"X"+columns+")");
        int arr[][]=new int[rows][columns];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i==j) {
                    System.out.println(arr[i][j]);

                }

            }
        }}}