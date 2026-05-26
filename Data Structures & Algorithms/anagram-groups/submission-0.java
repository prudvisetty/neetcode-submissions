class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for(String s : strs) {
            char[] charArr = s.toCharArray();

            Arrays.sort(charArr);
            String sortedArr = new String(charArr);
            res.putIfAbsent(sortedArr, new ArrayList<>());
            res.get(sortedArr).add(s);
        }
        
        return new ArrayList<>(res.values());
    }
}
