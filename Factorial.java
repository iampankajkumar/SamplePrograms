class Factorial {
    public static void main(String[] args) {
        System.out.println(calculateFactorial(1));
    }

    private static int calculateFactorial(int number) {
        if (number == 0 || number == 1)
            return 1;
        else
            return number * calculateFactorial(number - 1);
    }
}