import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Basics {
	public static void main(String[] args) {
        int[] x = {1,3,5,7,9,13};
        int[] x2 = {-3,14,6,-5,2,-7};
        int[] x3 = {-3,12,6,-15,2,-7};
        int[] nums = {3,6,10};

        OneTo255();
        PrintOddNos();
        PrintSum();
        IterArray(x);
        FindMax(x2);
        GetAverage(nums);
        OddArray();
        GreaterThanY(x2, 0);
        SquareArray(x);
        EliminateNegatives(x2);
        MaxMinAverage(x);
        ShiftArrayValues(x3);
    }
    
    // Print 1 to 255
	public static void OneTo255() {
		for(int i = 1; i <= 255; i++)
			System.out.println(i);
    }
    
    //	Print odd numbers between 1 and 255
	public static void PrintOddNos() {
		for(int i = 1; i <= 255; i++) {
			if(i % 2 != 0)
				System.out.println(i);
		}
    }
    
	//	Print Sum
	public static void PrintSum() { 
		int sum = 0;
		for(int i = 0; i <= 255; i++) {
			sum += i;
			System.out.println(String.format("New number: %d, Sum: %d", i, sum));
		}
    }
    
	// Iterating through an array
	public static void IterArray(int[] x) {
		for(int val: x)
			System.out.println(val);
    }
    
	// Find Max number
	public static void FindMax(int[] x2) {
		int currMax = x2[0];
		for(int val: x2){
			if(val > currMax)
				currMax = val;
        }
        System.out.println(currMax);
    }
    
	// Get Average
	public static void GetAverage(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
		double avg = (double)sum/nums.length;
        System.out.println(String.format("Sum: %d, Average: %f", sum, avg));
    }
    
	// Array with Odd Numbers
	public static void OddArray() {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for(int i = 0; i <= 255; i++) {
			if(i % 2 != 0)
				nums.add(i);
		}
		System.out.println(nums);
    }
    
	// Greater Than Y
	public static void GreaterThanY(int[] arr, int y) {
		int count = 0;
		for(int num: arr) {
			if(num > y)
				count++;
		}
		System.out.println(String.format("Count > %d: %d", y, count));
	}

    // Square the values
	public static void SquareArray(int[] nums) {
        int squareNo = 0;
        ArrayList<Integer> sqNums = new ArrayList<Integer>();
		for(int i = 0; i < nums.length; i++) {
            squareNo = nums[i] * nums[i];	
            sqNums.add(squareNo);
        }
        System.out.println(sqNums);
    }
    
	// Eliminate Negative Numbers
	public static void EliminateNegatives(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] < 0)
				nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
    
	// Max, Min, and Average
	public static List<Object> MaxMinAverage(int[] nums) {
		int min = nums[0];
		int max = nums[0];
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
			if(nums[i] > max){
                max = nums[i];
            }
            if(nums[i] < min){
                min = nums[i];
            }	
        }
        double avg = (double)sum/nums.length;
		System.out.println(String.format("Max: %d, Min: %d, Average: %f", max, min, avg));
        return Arrays.asList(max, min, avg);
    }
    
	// Shifting the Values in the Array
	public static void ShiftArrayValues(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			arr[i-1] = arr[i];
		}
        arr[arr.length-1] = 0;
        System.out.println(Arrays.toString(arr));
	}
}