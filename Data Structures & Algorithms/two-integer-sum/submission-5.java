class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int looking = target - nums[i];

            if(map.containsKey(looking)){
                return new int[] {map.get(looking), i};
            }
            map.put(nums[i], i);
        }

        return null;
    }
}
