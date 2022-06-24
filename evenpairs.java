class one
{
static int findPairs(int arr[], int n)
{
	int cntEven = 0;
	for (int i = 0; i < n; i++)
	{
		if (arr[i] % 2 != 0)
			cntEven++;
	}

	int evenPairs = 0;
	evenPairs += (((cntEven-1)));
	return evenPairs;
}
public static void main(String[] args)
{
	int arr[] = {2,4,6,8,10 };
	int n = arr.length;

	System.out.print(findPairs(arr, n));
}
}
