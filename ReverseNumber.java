class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverseNumber(124564));
    }

    private static int reverseNumber(int number) {
        int reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            number = number / 10;
            reverse = reverse * 10 + remainder;
        }
        return reverse;
    }
}