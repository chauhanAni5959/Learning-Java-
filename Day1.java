public class Day1 {

    public static void main(String[] args ){

//        System.out.println(Problem_no2());
        Day1 obj = new Day1();
//        obj.Problem_no3("Ankit");
        System.out.println(obj.Problem_no4("Ankit", "Ankit"));

    }


    public boolean Problem_no4(String s1 , String s2){
        int count = 0;
//        In this problem check whether two string are Identical Or Not
        if(s1.length() != s2.length()){
            return false;
        }
        else{
            for(int i = 0 ; i < s1.length() -1; i++){
                if(s1.charAt(i) == s2.charAt(i)){
                    count++;
                    break;
                }
                else{
                    count = count+0;
                }
            }

        }
        if(count == s1.length()){
            return true;
        }
        return false;




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
