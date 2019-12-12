package cn.wonderful.leetcode;


import main.java.cn.wonderful.leetcode.Day04;

/**
 * @ClassName Test
 * @Description TODO
 * @Author wdf
 * @Date 2019-12-12
 **/



public class Test {

    @org.junit.Test
    public void testMerge(){
        Day04 day04=new Day04();
        int [] nums1=new int[]{1,2,3,0,0,0};
        int [] nums2=new int[]{2,5,6};

        day04.merge(nums1,3,nums2,3);


    }


}
