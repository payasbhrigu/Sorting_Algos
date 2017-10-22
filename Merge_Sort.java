
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
public class Merge_Sort 
{   void merarr(int a[],int l,int mid,int r)
    {
        int m=mid-l+1;
        int n=r-mid;
        int L[]=new int[m] ;
        int R[]=new int[n],i,j,k=0,z=0;
        for(i=l;i<=mid;i++)
        {
            L[k++]=a[i];
        }
        for(i=mid+1;i<=r;i++)
        {
            R[z++]=a[i];
        }
        i=0;
        j=0;
        k=l;
        while(i<m&&j<n)
        {
                int c=(L[i]<R[j])?L[i]:R[j];
		a[k]=c;
		if(L[i]<R[j])
		i++;
		else j++;
		k++;
        }
        while(i<m)
        {
            a[k]=L[i];
            i++;
            k++;
        }
        while(j<n)
        {
            a[k]=R[j];
            j++;
            k++;
        }
        
    }
    void mersort(int a[],int l,int r)
    {
        if(l<r)
        {
            int mid=(l+r)/2;
            mersort(a,l,mid);
            mersort(a,mid+1,r);
            merarr(a,l,mid,r);
        }
    }
     public static void main(String[] args)
    {   Merge_Sort  x=new Merge_Sort ();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        x.mersort(a,0,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
