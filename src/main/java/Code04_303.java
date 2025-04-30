public class Code04_303 {
    public static void main(String[] args) {
        String text = "banana";
        char target = 'a';
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                count++;
            }
        }

        System.out.println("'" + target + "'는 " + count + "번 나왔습니다.");
    }
}

