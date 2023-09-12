
package Unit2;
import java.util.Scanner;
public class SumOfEachCol {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[][] arr = new int[100][];
        int n,i,j,row,col,sum=0;
        System.out.print("Enter row and col:");
        row = sc.nextInt();
        col = sc.nextInt();
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                 System.out.print("Enter Elements:");
                 arr[i][j]= sc.nextInt();
            }
        }
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
        {
                 System.out.print(sum+"\t\t");
                 sum = sum+arr[j][j];
        }
        System.out.print("");
    }
    }
}
