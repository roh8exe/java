public class _7_StringBuilder {
    public static void main(String[] args) {
        StringBuilder Builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            Builder.append(ch);
        }
        System.out.println(Builder.toString());
    }
}
