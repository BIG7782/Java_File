/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit2;
public class JaggedArray {
    public static void main(String args[])
    {
        int arr[][] = new int [3][];   //phailo 3 le chai tinta array ko size vane 2nd arr [] le chai pratek array ko size denote garxa
        arr[0]=new int[]{1,2,3};
        arr[1]=new int[]{4,5};
        arr[2]=new int[]{6,7,8,9};
        int i,j;
        for(i=0;i<arr.length;i++)// suru ko size jasto 3 diyo jagged array
        {
            for(j=0;j<arr[i].length;j++)// for eg yo arr[i].length le chai arr[0]ko size garxa
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
