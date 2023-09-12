
package Unit2;
import java.util.Scanner;
public class SearchingArray {
    public static void main(String[] args)
    {
     int[] arr = new int[100];
        int i,j,n,search=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of array:");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.println("Enter element of array: ");
            arr[i]=sc.nextInt();
        }
         System.out.println("Enter elements to be found: ");
         arr[i]=sc.nextInt();
         for(i=0;i<n;i++)
         {
      if(search==arr[i])
      {
        System.out.println(" Elements found : ");
      }
         }
    if(n==i)
    {
         System.out.println(" Elements not found : ");
 }
 }
}