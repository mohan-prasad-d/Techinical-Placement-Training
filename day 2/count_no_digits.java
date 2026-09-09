// count number of digits in a number
public class count_no_digits {
    public static void main(String[] args){
        int n = 23898223;
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
    }
}
