import java.util.Arrays;
public class Tester{
  public static void main(String arg[]){
    int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
    int[][] intMatrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
    int[][] a = new int[][]{{1,2,3,4},{2,3,4,1},{3,4,1,2}};
    int[][] b = new int[][]{{1,1,1},{2,2,2},{3,3,3}};
    int[][] E = new int[][]{{2,4,2},{2,2,2}};
    System.out.println(ArrayOps.sum(intArray));
    System.out.println(ArrayOps.largest(intArray));
    System.out.println(Arrays.toString(ArrayOps.sumRows(intMatrix)));
    System.out.println(Arrays.toString(ArrayOps.largestInRows(intMatrix)));
    System.out.println(ArrayOps.sum(intMatrix));
    System.out.println(Arrays.toString(ArrayOps.sumCols(a)));
    System.out.println(ArrayOps.isRowMagic(a));
    System.out.println(ArrayOps.isColMagic(b));
    System.out.println(ArrayOps.isLocationMagic(E,0,1));
    System.out.println(ArrayOps.isLocationMagic(E,1,1));



  }
}
