public class check_number_contains_0 {
    public static void main(String[] args){
        int n = 73600387;
        boolean containsZero = false;
        while (n > 0) {
            if (n % 10 == 0) {
                containsZero = true;
                break;
            }
            n /= 10;
        }
        System.out.println("Contains zero: " + containsZero);
    }
}
