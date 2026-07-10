package Java2DArrays;
import java.util.*;
public class SearchElements {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the size of Rows:");
       int rows=sc.nextInt();
       System.out.println("enter the size of columns:");
       int columns=sc.nextInt();
       int arr[][]=new int[rows][columns];
       for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr[i].length;j++){
               arr[i][j]=sc.nextInt();
           }
       }
       System.out.println("enter the searching number=");
       int search=sc.nextInt();
       for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr[i].length;j++){
               if(arr[i][j]==search){
                   System.out.println("this number is present at index="+"("+i+","+j+")");
               }
           }
       }
   }
}
