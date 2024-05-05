public class Day1 {

    public static void main(String[] args ){

        System.out.println(Problem_no1("Hello world"));

    }
    public static String  Problem_no1(String s ){
        String reverse = "";
        for(int i = s.length() -1; i>=0; i--){
            reverse = reverse + s.charAt(i);
        }
        return reverse;

    }
}
