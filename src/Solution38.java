class Solution38 {
    public String countAndSay(int n) {
        return countAndSay(n, 1, "1");
    }

    private String countAndSay(int n, int times, String s) {

        if (times == n) {
            return s;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length();) {
            char c = s.charAt(i);
            int count = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(j) == c) {
                    count++;
                } else {
                    break;
                }
            }
            sb.append(count);
            sb.append(c);
            i += count;
        }

        return countAndSay(n, times + 1, sb.toString());
    }
}