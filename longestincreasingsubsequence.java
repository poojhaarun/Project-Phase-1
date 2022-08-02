
public class longestincreasingsubsequence {
	static class Main {
		static int lis(int arr[], int n)
	    {
	        int lis[] = new int[n];
	        int i, j, max = 0;
	 
	        /* Initialize LIS values for all indexes */
	        for (i = 0; i < n; i++)
	            lis[i] = 1;
	 
	        /* Compute optimized LIS values in
	           bottom up manner */
	        for (i = 1; i < n; i++)
	            for (j = 0; j < i; j++)
	                if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
	                    lis[i] = lis[j] + 1;
	 
	        /* Pick maximum of all LIS values */
	        for (i = 0; i < n; i++)
	            if (max < lis[i])
	                max = lis[i];
	 
	        return max;
	    }
		public static void main(String args[]) {
			// Your code goes here
			int arr[] = {12, 82, 8, 43, 20, 86, 51, 70, 80};
			int n = 9;
			System.out.println(lis(arr, n));
		}
	}
}
