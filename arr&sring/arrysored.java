class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
        // code here
        if (n <= 1) {
            return true;
        }

        // Iterate through the array to check for non-decreasing order
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // If any element is greater than the next one, the array is not sorted
                return false;
            }
        }

        // If the loop completes without returning false, the array is sorted
        return true;
    }