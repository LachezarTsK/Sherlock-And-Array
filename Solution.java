import java.util.*;

public class Solution {
		public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int numberOfTestCases = reader.nextInt();
		String[] results = new String[numberOfTestCases];

		for (int i = 0; i < numberOfTestCases; i++) {
			int numberOfelements = reader.nextInt();
			int[] inputArray = new int[numberOfelements];
			int totalSum = 0;
			for (int j = 0; j < numberOfelements; j++) {
				inputArray[j] = reader.nextInt();
				totalSum += inputArray[j];
			}
			String answer = solve(inputArray, totalSum);
			results[i] = answer;
		}
		for (int i = 0; i < numberOfTestCases; i++) {
			System.out.println(results[i]);
		}
	}

	public static String solve(int[] inputArray, int totalSum) {
		String result = "NO";
		int intermediateSum = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (totalSum - intermediateSum - inputArray[i] == intermediateSum) {
				result = "YES";
				return result;
			}

			intermediateSum += inputArray[i];
		}
		return result;
	}
}
