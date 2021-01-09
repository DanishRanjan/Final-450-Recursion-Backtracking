import java.util.*;
public class TargetSum {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i] = sc.nextInt();
	}
	int target = sc.nextInt();
	printTargetSumSubset(arr, 0, "", 0, target);
}
public static void printTargetSumSubset(int[] arr, int index, String set, int sumofSet, int target ) {
	if(index == arr.length) {
		if(sumofSet==target) {
			System.out.println(set+".");
		}
		return;
	}
	printTargetSumSubset(arr, index+1, set+arr[index]+", ", sumofSet+arr[index], target);
	printTargetSumSubset(arr, index+1, set, sumofSet, target);
}
}



//5
//10
//20
//30
//40
//50
//60