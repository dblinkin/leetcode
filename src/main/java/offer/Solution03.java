package offer;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution03 {


    public int findRepeatNumber(int[] nums) {
        // nums.length >= 2
        for (int i = 0; i < nums.length; i++) {

            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    System.out.println(new ArrayList<>(Arrays.asList(nums)));
                    return nums[i];
                }

                int temp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = temp;
            }
        }
        return -1;
    }

}
