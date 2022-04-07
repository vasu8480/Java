import java.util.Scanner;

class Binary {
  int binarySearch(int array[], int element, int low, int high) {
	  if (high >= low) {
	      int mid = (low + high ) / 2;
	      if (array[mid] == element)
	        return mid;
	      if (array[mid] > element)
	        return binarySearch(array, element, low, mid - 1);
	      return binarySearch(array, element, mid + 1, high);
	    }
	    return -1;
	  }

  public static void main(String args[]) {
	  rough obj = new rough();
    int[] array = { 3, 4, 5, 6, 7, 8, 9 };
    int n = array.length;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter element to be searched:");
    int element = input.nextInt();
    int result = obj.binarySearch(array, element, 0, n - 1);
    if (result == -1)
      System.out.println("Not found");
    else
      System.out.println("Element found at index " + result);
  }
}
