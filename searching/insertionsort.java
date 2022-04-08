import java.util.*;

class insertionsort {
  public static void main(String args[]) {
	  int arr[]= {9,1,8,2,7,3,6,4,5};
	  insertionsort(arr);
	
	  for(int i :arr)
	  {
		 System.out.print(i+" ");
	  }
  }

private static void insertionsort(int arr[]) 
  {
	for(int i=1;i<arr.length;i++)
	{ 
		int temp =arr[i];
		int j=i-1;
		while(j>=0 && arr[j]>temp)
		{
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=temp;
		
	}
   }
}
