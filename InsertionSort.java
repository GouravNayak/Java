import java.util.Arrays;

/*
 * Learning Source: https://www.geeksforgeeks.org/insertion-sort/?ref=lbp
 * Definition: Insertion sort works similar to the way we sort playing cards. Compare 2 adjacent numbers and keep swapping. 
 */
public class InsertionSort {

	public static void main(String[] args) {
		Integer[] problemArray = {12, 11, 13, 5, 6};
		int temp_var = 0;
		int j=0;
		for (int i=0; i<problemArray.length-1;i++) {
			if(problemArray[i+1]<problemArray[i]) {
				temp_var = problemArray[i];
				problemArray[i] = problemArray[i+1];
				problemArray[i+1] = temp_var;
				j=i;
				while(j>0) {
					if(problemArray[j-1]>problemArray[j]) {
						temp_var = problemArray[j];
						problemArray[j] = problemArray[j-1];
						problemArray[j-1] = temp_var;
						j=j-1;
					}else {
						break;
					}
					
				}
			}
			System.out.println(Arrays.toString(problemArray));
		}
		System.out.println("Insertion Sort completed");
		System.out.println(Arrays.toString(problemArray));
	}

}
