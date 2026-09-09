public class count_odd_digits {
    public static void main(String[] args){
        int n = 122344598;
        int count = 0;
        while(n > 0){
            int digits = n % 10;
            if (digits % 2!=0){
                count++;
            }
            n /= 10;
        }
        System.out.println("Number of odd digits: " + count);
    }
}
