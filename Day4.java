import java.util.ArrayList;

public class Day4 {

   private static ArrayList<Integer> remove_zeroestothe_end(int [] nums ){
       ArrayList<Integer> ans = new ArrayList<>();
       for(int i = 0; i <= nums.length -1; i++){
           if(nums[i] != 0 ){
                ans.add(nums[i]);
           }


       }
       return ans;


   }
    public static void main(String[] args) {
        int[] nums = {1,2,3,0,0, 5, 0,8, 0,0};
       System.out.println(remove_zeroestothe_end(nums ));
    }
}
