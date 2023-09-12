/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit2;
import java.util.Scanner;
public class Sorting {
    public static void main(String args[])
    {
        int[] arr = new int[100];
        int i,j,n,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of array:");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.println("Enter element of array: ");
            arr[i]=sc.nextInt();
        }
for(i=0;i<n-1;i++)
{
    for(j=i+1;j<n;j++)
    {
    if(arr[i]>arr[j])
    {
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    }  
    } 
    System.out.println("\n\nDisplaying in Ascending Order: ");
    for(i=0;i<n;i++)
    {
        System.out.println(arr[i]);
    }
}
}
