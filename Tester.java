import java.util.Arrays;
public class Tester{
  public static void main(String arg[]){
    int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
    int[][] intMatrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
    System.out.println(ArrayOps.sum(intArray));
    System.out.println(ArrayOps.largest(intArray));
    System.out.println(Arrays.toString(ArrayOps.sumRows(intMatrix)));
  }
}
