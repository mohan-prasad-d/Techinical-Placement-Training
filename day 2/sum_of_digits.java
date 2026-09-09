// find sum of digits of a number
public class sum_of_digits {
    public static void main(String[] args){
        int n = 23898223;
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
