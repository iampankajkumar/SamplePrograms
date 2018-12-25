class Fib {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int n = 23;
        System.out.print(a + " " + b);
        for (int i = 0; i < n - 2; i++) {
            int temp = a + b;
            a = b;
            b = temp;
            System.out.print(" " + temp);
        }

    }
}