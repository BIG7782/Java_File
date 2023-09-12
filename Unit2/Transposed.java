/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit2;
import java.util.Scanner;
public class Transposed {
    public static void main(String args[])
    {
        int [][] arr=new int[10][10];
        int row,col,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Order of the matrix: ");
        row = sc.nextInt();
        col = sc.nextInt();
         for(i=0;i<row;i++)
         {
           for(j=0;j<col;j++)
          {
           System.out.print("Enter elements for matrix:");
           arr[i][j]=sc.nextInt();
         }  
    }
         System.out.println("Displaying the Matrix : ");
         for(i=0;i<row;i++)
         {
           for(j=0;j<col;j++)
          {
              System.out.print(arr[i][j]+"\t");
          }
           System.out.println();
    }
         System.out.println("Displaying the Transpose: ");
         for(j=0;j<col;j++)
         {
           for(i=0;i<row;i++)
          {
              System.out.print(arr[i][j]+"\t");
          }
         System.out.println();
   }
}
}
