class Solution {

 public String encode(List<String> strs) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : strs) {
            stringBuilder.append(str).append("أ");
        }
        return stringBuilder.toString();
    }

    public List<String> decode(String str) {
        if (str.isEmpty()) {
            return new ArrayList<>();
        }
        String[] parts = str.split("أ", -1);
        List<String> result = new ArrayList<>();
        for (int i = 0; i < parts.length - 1; i++) {
            result.add(parts[i]);
        }
        return result;
    }
}
