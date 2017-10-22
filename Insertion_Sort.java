/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Payas Kumar Bhrigu
 */
public class Insertion_Sort 
{
    public void insort(int a[])
    {   
        for(int i=1;i<a.length;i++)
        {
            int key=a[i];
            int j=i-1;
            while(j>=0&&a[j]>key)
            {
               a[j+1]=a[j];
               j-=1;
            }
            a[j+1]=key;
        }
    }
    public static void main(String[] args)
    {   Insertion_Sort x=new Insertion_Sort();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        x.insort(a);
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
