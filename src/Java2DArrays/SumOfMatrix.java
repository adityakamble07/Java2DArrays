package Java2DArrays;
import java.util.*;
public class SumOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of Row=");
        int rows = sc.nextInt();
        System.out.println("enter the size of column=");
        int columns = sc.nextInt();
        System.out.println("enter the matrix " + "("+rows + "X" + columns+")");
        int arr[][] = new int[rows][columns];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
        }
        System.out.println("Sum Of Matrix is="+sum);
    }
}

