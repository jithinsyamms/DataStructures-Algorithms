
public class BubbleSort {

	public static void main(String args[]) {
		BubbleSort sort = new BubbleSort();
		int arr[] = {9,8,7,6,5,4,3,2,1};
		sort.bubbleSort(arr, arr.length);
	}
	
	private void bubbleSort(int arr[], int n) {
		
		display(arr);
		
		for(int count = 0; count < n - 1 ; count++) {
			boolean swapped = false;
			 // Last count elements are already in place  
			for(int i = 0; i < n-count-1; i++) { 
				if(arr[i+1] < arr[i]) {
					swap(arr,i, i+1);
					swapped = true;
				}
			}
			if(!swapped)
				break;
		}
			
		display(arr);
	}
	
	private void swap(int arr[], int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
	private void display(int arr[]) { 
		for(int count = 0; count < arr.length ; count++) {
			System.out.print(arr[count] +"\t");
		}
		System.out.println();
	}
}
