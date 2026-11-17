public class TempConverter { 
    public static void main(String[] args) {
        double celsiusIn= 32.0;
        double fahrenheitIn=100.0;
        
        // Must use 9.0/5 or put a double first: 9 / 5 alone is integer division = 1
        double fahrenheitOut = celsiusIn * 9 / 5 + 32;
        double celsiusOut = (fahrenheitIn - 32) * 5 / 9;
    
        System.out.println(celsiusIn+" C = "+fahrenheitOut+" F");
        System.out.println(fahrenheitIn+" F = "+celsiusOut+" C");
    }
}
