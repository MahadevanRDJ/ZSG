public class FirstFivePrimeFibonacciSeries {
    static int count;
    public static void main(String[] args) {
        int a = -1, b = 1;
        firstFivePrimeFibonacciSeries(a, b);
    }
    private static void firstFivePrimeFibonacciSeries(int a, int b) {

        int c;
        while(count < 5) {
            c = a + b;
            if(isPrime(c)) {
                System.out.println(c);
                count++;
            }
            firstFivePrimeFibonacciSeries(b, c);
        }
    }
    private static boolean isPrime(int number) {

        boolean flag = true;
        if(number < 2) return false;
        for (int i = 2; i <= (int) Math.sqrt(number); i++) if(number % i == 0) flag = false;
        return flag;
    }
}
