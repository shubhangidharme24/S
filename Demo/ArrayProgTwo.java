package Demo;

import java.util.Arrays;

public class ArrayProgTwo {
	
	public static void AverageNo()
	{
		int[] no = new int[4];
		no[0]=56;
		no[1]=58;
		no[2]=39;
		no[3]=97;
		
		int sum=0;
		double avg = 0;
		for(int i=0; i<no.length; i=i+1)
		{
			sum=sum+no[i];
			avg=sum/no.length;
			
		}
		System.out.println("Array sum is "+sum);
		System.out.println("Array average is "+avg);
	}
	
	
	public static void CopyOneArrayInToAnotherArray()
	{
		int[] arr = new int[4];
		arr[0]=5;
		arr[1]=8;
		arr[2]=9;
		arr[3]=7;
		
		
		int[] arr2 = new int[arr.length];
		for(int i=0; i<arr.length; i++)
		{
		arr2[i]=arr[i];
		}
		System.out.println("Input Array-> "  +Arrays.toString(arr));
		System.out.println("Output Array-> "+Arrays.toString(arr2));
		
		
		
		
		
		
	}
	public static void ReverseCopyOneArrayInToAnotherArray()
	{
		int[] arr = new int[4];
		arr[0]=5;
		arr[1]=8;
		arr[2]=9;
		arr[3]=7;
		
		int[] reverse = new int[arr.length];
		for(int i=0, j=3;  i<=arr.length-1; i++, j--)
		{
		reverse[j]=arr[i];
		}
		System.out.println("Input Array-> "+Arrays.toString(arr));
		System.out.println("Output of reverse Array-> "+Arrays.toString(reverse));
		
		
		
		
	}
	

	public static void main(String[] args) 
	{
		int[] arr = new int[4];
		arr[0]=56;
		arr[1]=58;
		arr[2]=39;
		arr[3]=97;
		
		int[] arr1 = new int[4];
		arr1[0]=56;
		arr1[1]=58;
		arr1[2]=39;
		arr1[3]=97;
		
		System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.sort(arr));
		
		boolean m =Arrays.equals(arr, arr1);
		System.out.println(m);
		//AverageNo();
		//CopyOneArrayInToAnotherArray();
		ReverseCopyOneArrayInToAnotherArray();
		
		
		
		
				
	}

}
