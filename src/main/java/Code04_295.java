public class Code04_295 {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 17;
        System.out.println(num + "은(는) 소수인가? " + isPrime(num));
    }
}

