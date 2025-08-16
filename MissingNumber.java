
public class MissingNumber {
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1; 
        long totalSum = (long) n * (n + 1) / 2;
        long actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return (int) (totalSum - actualSum);
    }

    public static void main(String[] args) {
        // Test Case 1
        int[] arr1 = {1, 2, 4, 5};  
        System.out.println(findMissingNumber(arr1));

        // Test Case 2
        int[] arr2 = {2, 3, 4, 5};
        System.out.println(findMissingNumber(arr2));

        // Test Case 3
        int[] arr3 = {1, 2, 3, 4};
        System.out.println(findMissingNumber(arr3));
    
        // Test Case 4
        int[] arr4 = {1};
       
        System.out.println(findMissingNumber(arr4));
        // Test Case 5 (large example)
        int n = 1000000;
        int[] arr5 = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            arr5[i] = i + 1;
        }
        System.out.println(findMissingNumber(arr5));
    }
}
