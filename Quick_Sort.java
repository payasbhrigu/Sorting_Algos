
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Payas Kumar Bhrigu
 */
public class Quick_Sort 
{   int partition(int a[],int l,int r)
    {   int pivot=a[r];
        int i=l-1,j=l;
        for(j=l;j<r;j++)
        {
            if(a[j]<=pivot)
            {
                i++;
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }
                int t=a[i+1];
                a[i+1]=a[r];
                a[r]=t;
        return i+1;
    }
    void quicksort(int a[],int l,int r)
    {
        if(l<r)
        {
            int pi=partition(a,l,r);
            quicksort(a,l,pi-1);
            quicksort(a,pi+1,r);
        }
    }
     public static void main(String[] args)
    {    Quick_Sort x=new Quick_Sort ();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        x.quicksort(a,0,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
