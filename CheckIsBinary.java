public class CheckIsBinary {
    public static void main(String[] args) {
        System.out.println(isBinary(101010101));
        System.out.println(isBinary(121012444));
    }

    public static boolean isBinary(long number) {

        while (number != 0) {
            if (number % 10 > 1)
                return false;
            number /= 10;
        }
        return true;
    }
}