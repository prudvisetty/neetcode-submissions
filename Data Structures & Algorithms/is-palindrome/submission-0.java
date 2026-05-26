class Solution {
    public boolean isPalindrome(String s) {
        // Step 1: Remove all spaces and convert to lowercase
        String input = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Step 2: Set pointers based on the cleaned string
        int left = 0;
        int right = input.length() - 1;

        // Step 3: Compare characters from both ends
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
