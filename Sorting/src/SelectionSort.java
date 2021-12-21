
public class SelectionSort {

	public static void main(String args[]) {
		SelectionSort sort = new SelectionSort();
		int arr[] = {9,8,7,6,5,4,3,2,1};
		sort.selectionSort(arr, arr.length);
	}
	
	private void selectionSort(int arr[], int n) {
		
		display(arr);
		for(int i = 0; i < n- 1 ; i++) {
			int minimum = i;
			for(int j= i+1; j < n ; j++ ) {
				if(arr[j] < arr[minimum]) {
					minimum = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minimum];
			arr[minimum] = temp;
		}
		display(arr);
	}
	
	private void display(int arr[]) { 
		for(int count = 0; count < arr.length ; count++) {
			System.out.print(arr[count] +"\t");
		}
		System.out.println();
	}
}
