/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit2;
import java.util.Scanner;
public class Rectangle {
   public static void main (String args[])
    {
        int l,b,area;
        Scanner sc=new Scanner(System.in);
        System.out.print("length: ");
        l=sc.nextInt();
        System.out.print("breadth:");
        b=sc.nextInt();
        area=l*b;
        System.out.print("area="+area); 
    } 
}


