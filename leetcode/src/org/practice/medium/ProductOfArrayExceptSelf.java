package org.practice.medium;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        // Calculate lefts and store in res.
        int left = 1;
        for (int i = 0; i < n; i++) {
            if (i > 0)
                left = left * nums[i - 1];
            res[i] = left;
        }
        // Calculate rights and the product from the end of the array.
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            if (i < n - 1)
                right = right * nums[i + 1];
            res[i] *= right;
        }
        return res;
    }
	
	public static void main(String[] args) {

		ProductOfArrayExceptSelf obj = new ProductOfArrayExceptSelf();
		int[] nums = {1, 2, 3, 4};
		int[] res = obj.productExceptSelf(nums);
		
		for (int n : res)
			System.out.print(n + " ");
		
	}

}
