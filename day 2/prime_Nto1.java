public class prime_Nto1 {
    public static void main(String[] args){
        int n = 120;
        System.out.println("Prime numbers from " + n + " to 1:");
        for (int i = n; i >= 2; i--) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
