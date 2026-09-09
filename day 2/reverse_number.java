public class reverse_number {
    public static void main(String[] args){
        int n = 23898223;
        int reverse = 0;
        while (n > 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }
        System.out.println("Reverse of number: " + reverse);
    }
}
