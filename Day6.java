package InterviewImportant.Shuati;

import java.util.ArrayList;
import java.util.List;

public class Day6 {


    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subsets(nums));

    }



    //魔术索引。在数组A[0...n-1]中，有所谓的魔术索引，满足条件A[i] = i。给定一个有序整数数组，
    // 编写一种方法找出魔术索引，若有的话，在数组A中找出一个魔术索引，如果没有，则返回-1。若有多个魔术索引，返回索引值最小的一个。
    public int findMagicIndex(int[] nums) {

        for (int i=0;i<nums.length;i++){
            if (nums[i]==i){
                return i;

            }

        }
        return -1;

    }



    //幂集。编写一种方法，返回某集合的所有子集。集合中不包含重复的元素。
    //说明：解集不能包含重复的子集。
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        subHelper(nums,0,list,res);
        return res;
    }

    private static void subHelper(int[] nums, int cur, List<Integer> list, List<List<Integer>> res) {
        res.add(new ArrayList<>());
        for (int i=cur;i<nums.length;i++){

            list.add(nums[i]);
            subHelper(nums,i+1,list,res);
            list.remove(list.size()-1);

        }

    }



    //递归乘法。 写一个递归函数，不使用 * 运算符， 实现两个正整数的相乘。可以使用加号、减号、位移，但要吝啬一些。
//    public int multiply(int A, int B) {
//
//
//    }



}
