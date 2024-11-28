package com.csc;

// Write a set of four functions that calculate the minimum, maximum, sum,
// and average of an array of integers. These functions should use a for
// loop like we have seen in the class many times before.

// Write a set of four functions that calculate the minimum, maximum, sum,
// and average of an array of integers. These functions should use the
// Java Stream API.

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Calculator {
  public static void main(String[] args)
  {
    int[] nums = {0,1,2,3,4,5,20,6,7,8,9};
    int[] nums2 = {-1,-2,-3,-4,-5,-6,-7,-8,-9};
    int[] nums3 = {};

    // Output arrays for user to be able to see them
    System.out.println("nums is equal to: " + Arrays.toString(nums));
    System.out.println("nums is equal to: " + Arrays.toString(nums2));
    System.out.println("nums is equal to: " + Arrays.toString(nums3));
    System.out.println();

    // Arrays done using for loops
    // Array of positives
    System.out.println("nums forSum: " + forSum(nums));
    System.out.println("nums forAverage: " + forAverage(nums));
    System.out.println("nums forMax: " + forMax(nums));
    System.out.println("nums forMin: " + forMin(nums) + "\n");

    // Array of negatives
    System.out.println("nums2 forSum: " + forSum(nums2));
    System.out.println("nums2 forAverage: " + forAverage(nums2));
    System.out.println("nums2 forMax: " + forMax(nums2));
    System.out.println("nums2 forMin: " + forMin(nums2) + "\n");

    // Empty array
    System.out.println("nums3 forSum: " + forSum(nums3));
    System.out.println("nums3 forAverage: " + forAverage(nums3));
    System.out.println("nums3 forMax: " + forMax(nums3));
    System.out.println("nums3 forMin: " + forMin(nums3) + "\n");

    // Arrays when done with streaming
    // Array of positives
    System.out.println("nums streamSum: " + streamSum(nums));
    System.out.println("nums streamAverage: " + streamAverage(nums));
    System.out.println("nums streamMax: " + streamMax(nums));
    System.out.println("nums streamMin: " + streamMin(nums) + "\n");

    // Array of negatives
    System.out.println("nums2 streamSum: " + streamSum(nums2));
    System.out.println("nums2 streamAverage: " + streamAverage(nums2));
    System.out.println("nums2 streamMax: " + streamMax(nums2));
    System.out.println("nums2 streamMin: " + streamMin(nums2) + "\n");

    // Empty array
    System.out.println("nums2 streamSum: " + streamSum(nums3));
    System.out.println("nums2 streamAverage: " + streamAverage(nums3));
    System.out.println("nums2 streamMax: " + streamMax(nums3));
    System.out.println("nums2 streamMin: " + streamMin(nums3) + "\n");

    // Extra Credit
    // Add 5
    System.out.println("Add 5: " + Arrays.toString(addFive(nums)));

    // Squares
    System.out.println("Square: " + Arrays.toString(square(nums)));

    // Evens
    System.out.println("Evens: " + Arrays.toString(evens(nums)));

    // Odds
    System.out.println("Odds: " + Arrays.toString(odds(nums)));
  }

  public static Integer forSum(int[] nums)
  {
    Integer sum = 0;

    for(int num : nums)
    {
      sum += num;
    }

    return sum;
  }

  public static double forAverage(int[] nums)
  {
    double average = 0.0;

    for(int num : nums)
    {
      average += num;
    }

    return average / nums.length;
  }

  public static Integer forMax(int[] nums)
  {
    Integer max = null;

    for(int num : nums)
    {
      if(max == null)
      {
        max = num;
        continue;
      }
      if(num > max)
      {
        max = num;
      }
    }

    return max;
  }

  public static Integer forMin(int[] nums)
  {
    Integer min = null;

    for(int num : nums)
    {
      if(min == null)
      {
        min = num;
        continue;
      }
      if(num < min)
      {
        min = num;
      }
    }

    return min;
  }

  public static Integer streamSum(int[] nums)
  {
    return Arrays.stream(nums).sum();
  }

  public static Double streamAverage(int[] nums)
  {
    OptionalDouble average = Arrays.stream(nums)
                        .mapToDouble(num -> (double) num)
                        .average();

    Double answer = (average.isEmpty()) ? null : average.getAsDouble();
    return answer;
  }

  public static Integer streamMax(int[] nums)
  {
    OptionalInt max = Arrays.stream(nums)
                    .max();

    Integer answer = (max.isEmpty()) ? null : max.getAsInt();
    return answer;
  }

  public static Integer streamMin(int[] nums)
  {
    OptionalInt min = Arrays.stream(nums)
                    .min();
    Integer answer = (min.isEmpty()) ? null : min.getAsInt();
    return answer;
  }

  public static int[] addFive(int[] nums)
  {
    nums = Arrays.stream(nums)
                  .map(num -> num + 5)
                  .toArray();

    return nums;
  }

  public static int[] square(int[] nums)
  {
    nums = Arrays.stream(nums)
                  .map(num -> num * num)
                  .toArray();
    
    return nums;
  }

  public static int[] evens(int[] nums)
  {
    nums = Arrays.stream(nums)
                  .filter(num -> num % 2 == 0)
                  .toArray();
    
    return nums;
  }

  public static int[] odds(int[] nums)
  {
    nums = Arrays.stream(nums)
                  .filter(num -> num % 2 == 1)
                  .toArray();
    
    return nums;
  }
}
