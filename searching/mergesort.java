import java.util.*;

class mergesort {
  public static void main(String args[]) {
	  int[] arr= {9,1,8,4,5};
	  mergesort(arr);
	
	  for(int i :arr)
	  {
		 System.out.print(i+" ");
	  }
  }

private static void mergesort(int arr[]) 
  {
	int len=arr.length;
	if(len<=1) return;
	
	int mid =len/2;
	int[] lef = new int[mid];
	int [] rig=new int[len-mid];
	
	int i=0,j=0;
	for(;i<len;i++)
	{
		if(i<mid) lef[i]=arr[i];
		else {
			rig[j]=arr[i];
			j++;
		}
	}
	mergesort(lef);
	mergesort(rig);
	merge(lef,rig,arr);
	
	
   }

private static void merge(int [] lef,int[] rig,int [] arr)
{
	int lsize=arr.length/2;
	int rsize=arr.length - lsize;
	int i=0,l=0,r=0;
	while(l<lsize && r<rsize)
	{
		if(lef[l]<rig[r])
		{
			arr[i]=lef[l];
			i++;
			l++;
			
		}
		else {
			arr[i]=rig[r];
			i++;
			r++;
			
		}
	}	
	while(l<lsize) {
		arr[i]=lef[l];
		i++;l++;
	} 
	while(r<rsize) {
		arr[i]=rig[r];
		i++;r++;
	}
	
}
}
