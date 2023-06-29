import java.util.Arrays;

public class task_5 {
  public static void main(String[] args) {
    task5();
    
  }

  static void task5(){
    /*Дан массив nums = [3,2,5,3,2]  и число val = 3. Если в массиве есть числа,
     * равные val, то нужно перенести эти элементы в конце массива.
     * в итоге элементы в конце массива должны быть равны заданному числу
     */

     int[] nums = {3, 2, 5, 3};
     int val = 3;
     int temp[] = new int [nums.length];

     Arrays.fill(temp, val);

     for(int i = 0, j= 0; i<nums.length; i++) {
      if (nums[i] != val) {
        temp[j] = nums[i];
        j++;
      }
     }

     for (int x:temp) {
      System.out.println(x+ " ");
     }

     
  }
}
