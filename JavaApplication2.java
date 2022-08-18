/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
public class pattern
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int min=0,max=0,n,i;
        System.out.println("Enter no. of Elements: ");
        n=s.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        min=arr[0];
        max=arr[0];
        for(i=0;i<n;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println("Maximum Element: "+max);
        System.out.println("Minimum Element: "+min);
    }
    
}
