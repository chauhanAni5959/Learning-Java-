import java.util.Arrays;

public class Day2 {

    public static void main(String[] args) {
        Day2 obj = new Day2();
        char [] s1 = {'a', 'n', 'k', 'i' , 't'};
        char [] s2 = {'n', 'i' , 'a', 'k', 'o'};
        if(Problem_no_2(s1, s2)){
            System.out.println("Yes both String are anagram!");
        }
        else{
            System.out.println("No both String are not anagram!");
        }

    }

    private static  boolean Problem_no_2(char [] s1 , char[] s2){
        if(s1.length !=s2.length){
            return false;
        }
        Arrays.sort(s1);
        Arrays.sort(s2);

        for(int i = 0 ; i < s1.length; i++){
            if(s1[i] != s2[i]){
                return false;
            }

        }
        return true;


    }
    public void Problem_no_1(String s1 , String s2){
        if(s1.equals(s2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }




}
