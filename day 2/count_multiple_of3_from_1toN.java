public class count_multiple_of3_from_1toN {
    public static void main(String[] args){
        int n = 20;
        System.out.println("Multiples of 3 from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
