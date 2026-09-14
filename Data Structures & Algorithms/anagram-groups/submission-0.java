class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> map = new HashMap<String,List<String>>();

        for (String str : strs) {
            char[] strChar = str.toCharArray();
            Arrays.sort(strChar);
            String sortedString = String.copyValueOf(strChar);
            List<String> stringList = map.getOrDefault(sortedString, new ArrayList<String>());
            stringList.add(str);
            map.put(sortedString, stringList);
        }

        return new ArrayList<>(map.values());
    }
}
