package main.java.cn.wonderful.leetcode;

/**
 * @ClassName Day02
 * @Description TODO
 * @Author wdf
 * @Date 2019-12-06
 **/


public class Day02 {

    public void rotate1(int[] nums, int k) {
        int len = nums.length;
        for (int i = 0; i < k; i++) {
            int temp = nums[len - 1];
            int j = len - 1;
            while (j > 0) {
                nums[j] = nums[--j];
            }
            nums[0] = temp;
        }
    }


    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k=k%len;
        reverse(nums, 0, len - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, len - 1);
    }

    private void reverse(int[] nums, int begin, int end) {

        int temp;
        while (begin < end) {

            temp = nums[begin];
            nums[begin] = nums[end];
            nums[end] = temp;
            begin++;
            end--;
        }

    }
}
