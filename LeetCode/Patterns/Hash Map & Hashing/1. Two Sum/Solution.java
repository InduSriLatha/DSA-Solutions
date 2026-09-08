class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++)
        {
            int j= target-numbers[i];
            if (map.containsKey(j))
                return new int[]{map.get(j),i};
            map.put(numbers[i], i);
        }
        return new int[]{-1, -1};
    }
}