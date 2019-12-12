package cn.wonderful.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Day05
 * @Description
 * @Author wdf
 * @Date 2019-12-12
 **/
public class Day05 {


    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]),i};
            }
            map.put(target-nums[i],i);
        }
        throw new IllegalArgumentException("can not get two sum !");
    }

}
