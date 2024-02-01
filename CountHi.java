public class CountHi {
    public static void main(String[] args) {
        System.out.println(countHi("hihi"));    
        System.out.println(countHi("dce hi ho")); 
        System.out.println(countHi("XYZhi hi"));  
    }

    public static int countHi(String input) {
        int count = 0;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        return count;
    }
}
