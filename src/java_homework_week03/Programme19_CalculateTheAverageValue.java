package java_homework_week03;

import java.util.Arrays;

public class Programme19_CalculateTheAverageValue {
    public static void main(String[] args) {

        int[] nums = { 31,44,150,220,340,460,510,670,720,890,900,1000};
             int length = nums.length;



        int sum = 0;

        for (int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
        }
        int average = sum / nums.length;
        System.out.println("value of array elements are : " + Arrays.toString(nums));
        System.out.println("Sum of array elements are : " + sum);
        System.out.println("Total Number of array are  : " + length);
        System.out.println("Average value of array iss  : " + average);
    }
}
