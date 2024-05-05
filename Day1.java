public class Day1 {

    public static void main(String[] args ){

        System.out.println(Problem_no2());

    }

   public String Problem_no3(String s ){
        String ans = "";
        for(int i = 0; i< s.length() -1; i++){
            if(s.charAt(i) =='A'){
                ans = ans + s.charAt(i);

            }
        }
        return ans ;
   }

    public static String Problem_no2(){
        String s = "My name is Ankit";
        String ans = "";
        for (int i = 0 ; i <= s.length() -1; i++){
            if(s.charAt(i) != ' '){
                ans = ans + s.charAt(i);
            }
        }
        return ans;
    }
    public static String  Problem_no1(String s ){
        String reverse = "";
        for(int i = s.length() -1; i>=0; i--){
            reverse = reverse + s.charAt(i);
        }
        return reverse;

    }
}
