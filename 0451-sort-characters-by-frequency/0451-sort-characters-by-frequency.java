class Solution {
    public String frequencySort(String s) {

        int[] freq = new int[128];

        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        Character[] chars = new Character[128];

        int count = 0;

        for (char c = 0; c < 128; c++) {
            if (freq[c] > 0) {
                chars[count++] = c;
            }
        }

        Arrays.sort(chars, 0, count, (a, b) -> freq[b] - freq[a]);

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < count; i++) {
            char c = chars[i];

            for (int j = 0; j < freq[c]; j++) {
                ans.append(c);
            }
        }

        return ans.toString();
    }
}