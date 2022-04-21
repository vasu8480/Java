
import java.util.*;
public class quicksort_tech {
	public static void main(String args[])
    {	
		int arr[]= {1,2,3,4,5,6,78,78,8};
		
		quicksort(arr,0,arr.length-1);
		
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
    }

	private static void quicksort(int[] arr, int start, int end) {
		if (end<=start)	return;		
		int pivot=partition(arr, start, end);
		quicksort(arr, start, pivot-1);
		quicksort(arr, pivot+1, end);
		
		}
	private static int partition(int[] arr, int start, int end) {
		int pivot =arr[end];
		int i=start-1;
		for(int j =start ;j<=end-1;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		i++;
		int temp=arr[i];
		arr[i]=arr[end];
		arr[end]=temp;
		return i;
	}
}
