import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Source: https://www.geeksforgeeks.org/selection-sort/
//Complexity Analysis = O(N)*O(N)
public class SelectionSort {

	public static void main(String[] args) {
		List<Integer> problemArrayList = new ArrayList<>(Arrays.asList(64, 25, 12, 22, 11));
		int min = 0;
		int swap_index = 0;
		for(int j=0;j<problemArrayList.size()-1;j++) {
			min = problemArrayList.get(j);
			for(int i=j+1;i<problemArrayList.size();i++) {
				if(min>problemArrayList.get(i)) {
					swap_index=i;
					min=problemArrayList.get(i);
				}
			}
			problemArrayList.set(swap_index, problemArrayList.get(j));
			problemArrayList.set(j, min);
		}
		System.out.print(problemArrayList);
	}

}
