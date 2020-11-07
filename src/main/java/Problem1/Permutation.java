// Used this website: https://www.programcreek.com/2013/02/leetcode-permutations-java/
// To understand how permutations work and how it works with the multiple functions
// The first main function is the permute function which creates a new ArrayList and
// then checks if nums is null or is 0 and returns an empty array ( I had a lot of problems with this)
// And then it does the call to the helper function which is where the recursion happens.
// In helper it creates a new arraylist and adds in all the numbers from the nums array
// into the arraylist. then under that is a for loop that calls recursively to another function
// called swap, which is just a simple swap algorithm function and in that for loop
// of the main swapping of the permutation goes from swap, helper, and then swap.
// the way this works is it goes left to right of the list. Let's say our number is 1 2 3.
// The first swap would make 1 to 1 and then afterwards call the function again and
// call to swap and then have all the permutations of 1 2 3 and 1 3 2.
// Then afterwards it will focus on the 2 as the first int in the list and it would do
// 2 1 3 and 2 3 1. Then it will focus on 3 as the first int (which is what the first swap does)
// And do 3 1 2 nd 3 2 1. The last swap is the one that recovers the original lists instead of the
// already swapped lists from the first swap.

package Problem1;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            result.add(new ArrayList<>());
        }
        helper(0, nums, result);
        return result;
    }

    private static void helper(int start, int[] nums, List<List<Integer>> result) {
        if (start == nums.length - 1) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }
            result.add(list);
            return;
        }

        for (int i = start; i < nums.length; i++) {
            swap(nums, i, start);
            helper(start + 1, nums, result);
            swap(nums, i, start);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
