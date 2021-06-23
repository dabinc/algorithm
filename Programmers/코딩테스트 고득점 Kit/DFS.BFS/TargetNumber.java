class TargetNumber {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, 0, 0, target);
    }

    int dfs(int[] numbers, int idx, int sum, int target) {
        if(idx == numbers.length) {
            if(sum == target) {
                return 1;
            }
            return 0;
        }
        return dfs(numbers, idx + 1, sum + numbers[idx], target) + dfs(numbers, idx + 1, sum - numbers[idx], target);
    }
}