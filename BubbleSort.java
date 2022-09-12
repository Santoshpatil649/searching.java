package binarySearch;

public class BubbleSort {
	public static void bubbleSort(int arr[]) {
		int n = arr.length;
		int temp = 0;
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-1; j++) {
				if(arr[j]>arr[j+1]) {
					 temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
				
			}
		}
	}
	public static void main(String args[]) {
		int arr[] = {10, 15, 25, 85, 50};
		int n=arr.length;
		
			System.out.println("Array before bubble sort");
			for(int i=0; i<n; i++) {
				System.out.print(arr[i]+ " ");
				System.out.println();
				
		}
			bubbleSort(arr);
		
		
			System.out.println("Array after bubble sort");
			for(int i=0; i<n; i++) {
				System.out.println(arr[i]+ " ");
			}
			
	}

}
