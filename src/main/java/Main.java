public class Main {
//https://leetcode.com/problems/two-sum/

    public static void main(String[] args) {

    }

    //Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    //You may assume that each input would have exactly one solution, and you may not use the same element twice.
    //You can return the answer in any order.

    public static int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];

        //Loop through nums
        for (int i = 0; i < nums.length; i++) {
            //Loop through nums again
            for (int j = 0; j < nums.length; j++) {
                // if same index, skip index
                if (i == j) {
                    continue;
                }

                //if two indexes added together == target
                if ((nums[i] + nums[j]) == target) {
                    answer[0] = j;
                    answer[1] = i;
                    break;
                }
            }
        }

        return answer;
    }

}
