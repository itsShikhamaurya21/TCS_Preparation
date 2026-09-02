public class PivotIndex {
  public static int pivotIndex(int arr[]) {
    int totalSum = 0;
    for (int i = 0; i < arr.length; i++) {
      totalSum += arr[i];
    }
    int leftSum = 0;
    int rightSum = 0;
    for (int i = 1; i < arr.length; i++) {

      leftSum += arr[i - 1];
      rightSum = totalSum - leftSum - arr[i];
      if (leftSum == rightSum) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String args[]) {
    int arr[] = { 1, 7, 3, 6, 5, 6 };
    int res = pivotIndex(arr);
    System.out.println(res);
  }
}
