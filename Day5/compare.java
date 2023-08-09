public class CompareToExample {
    public static void main(String[] args) {
        // Comparing strings using compareTo
        String str1 = "apple";
        String str2 = "banana";
        String str3 = "apple";
        String rola = "rola"; // Nao foi o Mario 
        
        // Compare str1 with str2
        int result1 = str1.compareTo(str2);
        System.out.println("Comparing 'apple' with 'banana': " + result1);

        // Compare str2 with str1
        int result2 = str2.compareTo(str1);
        System.out.println("Comparing 'banana' with 'apple': " + result2);

        // Compare str1 with str3
        int result3 = str1.compareTo(str3);
        System.out.println("Comparing 'apple' with 'apple': " + result3);
        
        // Compare str1 with rola
        int result4 = str1.compareTo(rola);
        System.out.println("Comparing 'apple' with 'rola': " + result4);
    }
}
