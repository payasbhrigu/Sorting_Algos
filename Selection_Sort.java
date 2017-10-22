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
public class Selection_Sort
{   
    public  void selsort(int a[])
    {
        int n=a.length;
        for(int i=0;i<n-1;i++)
        {   int k=i;
            int min=a[i];
            for(int j=i+1;j<n;j++)
            {
                if(a[j]<min)
                {
                    min=a[j];
                    k=j;
                }
            }
            int t=a[i];
            a[i]=a[k];
            a[k]=t;
        }
        
    }
    public static void main(String[] args)
    {   Selection_Sort x=new Selection_Sort();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        x.selsort(a);
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
