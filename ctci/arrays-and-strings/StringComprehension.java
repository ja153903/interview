public class StringComprehension {
    public static String stringCompression(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i-1) == s.charAt(i)) {
                count++;
            } else {
                sb.append(s.charAt(i-1));
                sb.append(count);
                count = 1;
            }    
        }
        
        // Take care of the last item
        sb.append(s.charAt(s.length()-1));
        sb.append(count);

        String result = sb.toString();
        return result.length() < s.length() ? result : s;
    }

    public static void main(String[] args) {
        System.out.println(stringCompression("aaab"));
        System.out.println(stringCompression("aabccccaaa"));
    }
}
