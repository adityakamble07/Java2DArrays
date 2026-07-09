package Java2DArrays;

import java.util.Scanner;

public class CountTotalElements {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of the rows=");
        int rows=sc.nextInt();
        System.out.println("enter the size of columns=");
        int column=sc.nextInt();
        System.out.println("enter the matrix:");
        int arr[][]=new int[rows][column];
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++) {
                arr[i][j]=sc.nextInt();
                count++ ;
            }
        }
        System.out.println("Total elemnts is="+count);
    }
    }

