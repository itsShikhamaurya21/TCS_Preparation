class MaximumSumArray {
  public static int maxSubArray(int[] nums) {
    int max = Integer.MIN_VALUE;
    int cursum = 0;
    for (int i = 0; i < nums.length; i++) {
      cursum += nums[i];

      max = Math.max(cursum, max);
      if (cursum < 0) {
        cursum = 0;
      }
    }
    return max;
  }

  public static void main(String args[]) {
    int arr[] = { -7, -2, -3, -4, -5, -6 };
    System.out.println(maxSubArray(arr));
  }
}
