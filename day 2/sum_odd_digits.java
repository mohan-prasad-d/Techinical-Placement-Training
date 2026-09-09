public class sum_odd_digits {
    public static void main(String[] args){
        int n = 122334455;
        int sum = 0;
        while(n > 0){
            int digits = n % 10;
            if (digits % 2!=0){
                sum += digits;
            }
            n /= 10;
        }
        System.out.println("Sum of odd digits: " + sum);
    }
}
