import java.util.Arrays;

/*
 * Learning Source: Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in the wrong order. 
 * Weakness: This algorithm is not suitable for large data sets as its average and worst-case time complexity is quite high.
 * Boolean variable is implemented to identify iteration with no swap whihc indicates that Array is sorted
 * Time Complexity: O(N*N)
 */
public class BubbleSort {

	public static void main(String[] args) {
		Integer[] problemArray = {1, 5, 4, 2, 8, 4};
		int temp_var=0;
		boolean swap_var=false;
		for(int j=0;j<problemArray.length;j++) {
			swap_var = false;
			for(int i=j;i<problemArray.length-1;i++) {
				if(problemArray[i]>problemArray[i+1]) {
					swap_var = true;
					temp_var = problemArray[i];
					problemArray[i] = problemArray[i+1];
					problemArray[i+1] = temp_var;
				}
			}
			if(!swap_var) {
				System.out.println("BubbleSort Algorithm completed");
				break;
			}
		}
		System.out.println(Arrays.toString(problemArray));
	}
}
