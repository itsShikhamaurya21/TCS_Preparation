import java.util.*;

public class relativeSortArray {
  public static int[] relativeSortArray(int arr1[], int arr2[]) {
    // Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
    // Output: [2,2,2,1,4,3,3,9,6,7,19]
    int arr[] = new int[arr1.length];
    int k = 0;
    for (int i = 0; i < arr2.length; i++) {
      for (int j = 0; j < arr1.length; j++) {
        if (arr1[j] == arr2[i]) {
          arr[k++] = arr2[i];
          arr1[j] = -1;
        }
      }
    }
    int start = k;
    int i = 0;
    while (i < arr1.length) {
      if (arr1[i] != -1) {
        arr[k++] = arr1[i];
      }
      i++;
    }
    for (int n = start; n < arr.length; n++) {
      for (int j = n + 1; j < arr.length; j++) {
        if (arr[n] > arr[j]) {
          int temp = arr[n];
          arr[n] = arr[j];
          arr[j] = temp;
        }
      }
    }
    return arr;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr1[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr1[i] = sc.nextInt();
    }
    int m = sc.nextInt();
    int arr2[] = new int[m];
    for (int i = 0; i < m; i++) {
      arr2[i] = sc.nextInt();
    }
    // relativeSortArray(arr1, arr2);
    int result[] = relativeSortArray(arr1, arr2);
    System.out.println(Arrays.toString(result));
    // System.out.println(relativeSortArray(arr1, arr2));
  }

}
