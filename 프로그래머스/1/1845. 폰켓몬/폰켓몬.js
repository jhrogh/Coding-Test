function solution(nums) {
    const half = nums.length / 2;
    const uniqueTypes = new Set(nums);
    return Math.min(uniqueTypes.size, half);
}
