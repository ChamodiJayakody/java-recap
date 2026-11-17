public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 25;
        int temp;
        //Part A
        System.out.println("Before:\t"+"a = " + a + ", b = " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After:\t"+"a = " + a + ", b = " + b);
        //Part B
        a= 10;
        b= 25;
        System.out.println("Before:\t"+"a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;  
        a = a - b;
        System.out.println("After:\t"+"a = " + a + ", b = " + b);
    }
}
