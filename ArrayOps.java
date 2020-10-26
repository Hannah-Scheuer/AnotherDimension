public class ArrayOps {
  public static int sum(int[] arr) {
    int total = 0;
    for (int i = 0;i<arr.length;i++){
      total += arr[i];
    }
    return total;
  }

  public static  int largest(int[]arr) {
    int big = 0;
    for (int i = 0;i<arr.length;i++){
      if (arr[i]>big){
        big = arr[i];
      }
    }
    return big;
  }

  public static int[] sumRows(int[][] matrix) {
    int[] total = new int[matrix.length];
    for (int i = 0;i<matrix.length;i++){
      total[i]= ArrayOps.sum(matrix[i]);
    }
    return total;
  }

  public static  int[] largestInRows(int[][] matrix) {
    int[] total = new int[matrix.length];
    for (int i = 0;i<matrix.length;i++){
      total[i]= ArrayOps.largest(matrix[i]);
    }
    return total;
  }

  public static  int sum(int[][] arr) {
    return ArrayOps.sum(ArrayOps.sumRows(arr));
  }
}
