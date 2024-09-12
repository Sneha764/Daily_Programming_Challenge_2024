/*Merge Two Sorted Arrays

You are given two sorted arrays arr1 of size m and arr2 of size n. Your task is to merge these two arrays into a single sorted array without using any extra space (i.e., in-place merging). The elements in arr1 should be merged first, followed by the elements of arr2, resulting in both arrays being sorted after the merge.

Input:
Two sorted integer arrays arr1 of size m and arr2 of size n.
Example : 
arr1 = [1, 3, 5, 7]
arr2 = [2, 4, 6, 8]

Output:
Both arr1 and arr2 should be sorted after the merge. Since you cannot use extra space, the final result will be reflected in arr1 and arr2.
Example:
arr1 = [1, 2, 3, 4]
arr2 = [5, 6, 7, 8]

Constraints:
The arrays are sorted in non-decreasing order.
You must not use any extra space beyond a few variables (O(1) space complexity).
1 ≤ m, n ≤ 10^5.
1 ≤ arr1[i], arr2[j] ≤ 10^9.

Test Cases:
Test Case 1
Input: arr1 = [1, 3, 5], arr2 = [2, 4, 6]
Output: arr1 = [1, 2, 3], arr2 = [4, 5, 6]
Test Case 2:
Input: arr1 = [10, 12, 14], arr2 = [1, 3, 5]
Output: arr1 = [1, 3, 5], arr2 = [10, 12, 14]
Test Case 3:
Input: arr1 = [2, 3, 8], arr2 = [4, 6, 10]
Output: arr1 = [2, 3, 4], arr2 = [6, 8, 10]
Test Case 4:
Input: arr1 = [1], arr2 = [2]
Output: arr1 = [1], arr2 = [2]
Test Case 5:
Input: arr1 = [1, 2, 3, 4, ..., 100000], arr2 = [50001, ..., 100000]
Output: arr1 = [1, 2, 3, ..., 50000], arr2 = [50001, ..., 100000]

Edge Cases:
One or both arrays are already sorted in such a way that no swaps are needed.
One array is significantly smaller than the other.
 */

import java.util.Arrays;

public class merge_2_sorted_arr_without_extra_space {
    static void func(int arr1[], int arr2[], int n, int m){
        int i1=0, i2=n-1;
        int j=0;
        while(i1<=i2 && j<m){
            if(arr1[i1] <= arr2[j]){
                i1++;
            }
            else{
                int temp = arr1[i2];
                arr1[i2--] = arr2[j];
                arr2[j++] = temp;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("First sorted array:");
        for(int i=0; i<n; i++){
            System.out.println(arr1[i]);
        }
        System.out.println("Second sorted array:");
        for(int i=0; i<m; i++){
            System.out.println(arr2[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 12, 14};
        int[] arr2 = {0, 1, 3, 5};
        func(arr1, arr2, arr1.length, arr2.length);
    }
}
