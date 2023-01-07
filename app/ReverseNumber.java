public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("ReverseNumber => ");
        int ans = reverseNumber(12354);
        System.out.println(ans);
    }

    static int reverseNumber(int number) {
        int reverse = 0;
        while(number!=0){
            int remainder = number % 10;  
            reverse = reverse * 10 + remainder;  
            number = number/10; 
        }
        return reverse;
    }
}