class Solution {
    public boolean isAnagram(String s, String t) {
if (s.length() != t.length()) {
            return false;
        } else if (t.equals(s)) {
            return true;
        } else {
            Map<Character, Integer> map1 = new HashMap<>();
            Map<Character, Integer> map2 = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {

                if (map1.containsKey(s.charAt(i))) {
                    map1.put(s.charAt(i), 1 + map1.get(s.charAt(i)));
                } else {
                    map1.put(s.charAt(i), 1);
                }
                if (map2.containsKey(t.charAt(i))) {
                    map2.put(t.charAt(i), 1 + map2.get(t.charAt(i)));
                } else {
                    map2.put(t.charAt(i), 1);
                }

            }
            
            return map1.equals(map2);
        }
    }
}
