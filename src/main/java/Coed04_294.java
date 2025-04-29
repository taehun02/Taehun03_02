public class Coed04_294 {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 89, 34};
        int max = numbers[0];

        for (int num : numbers) {
            if (num > max) max = num;
        }

        System.out.println("최댓값: " + max);
    }
}
