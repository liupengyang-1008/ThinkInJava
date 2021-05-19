public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 74) break;
            if (i % 9 == 0) continue;
            System.out.print(i + " ");
        }
        System.out.println("");
        for (int i : range(100)) {
            if (i == 74) break;
            if (i % 9 == 0) continue;
            System.out.print(i + " ");
        }
        System.out.println("");

        int i = 0;
        while (true) {
            i++;
            int j = i * 27;
            if (j == 1269) break;
            System.out.print(i + " ");
        }
    }

    private static int[] range(int i) {
        int[] arr = new int[i];
        for (int j = 0; j < i; j++) {
            arr[j] = j;
        }
        return arr;

    }
}
