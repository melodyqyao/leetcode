package leetcode;

import java.util.HashMap;

public class TwoSum {
	public static int[] Solution(int[] nums, int target){
		int[] res = new int[2];
		if(nums == null || nums.length<2)
			return res;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<nums.length; i++){
			if(map.containsKey(nums[i])){
				res[0] = i;
				res[1] = map.get(nums[i]);
				return res;
			}
			map.put(target-nums[i], i);
		}
		return res;
	}
	public static void main(String[] args){
		int[] nums = {2,7,11,15};
		int target = 9;		
		int[] res = Solution(nums, target);
		System.out.print(res[0]+"\n"+res[1]);
	}

}
