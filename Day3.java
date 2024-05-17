import java.util.ArrayList;

public class Day3 {


    public static  void Addtwoadjacent(char [] nums){
        ArrayList<Boolean> ans =  new ArrayList<>();
        for(int i = 0 ; i  <= nums.length -1 ; i++){
            if(nums[i] == 'i'){
                ans.add(true);

            }
            else{
                ans.add(false);

            }
        }
        System.out.println(ans);



    }

    private static int Binary_Searching(int [] arr , int target ){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end- start)/2;
            if(arr[mid] == target){
                return mid;

            }
            if(arr[mid] < target){
                start = mid +1;

            }
            else{
                end = mid -1;

            }


        }
        return -1;


    }

    public static ArrayList<Integer> Two_Sum(int [] arr , int target){
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0 ; i<= arr.length -1 ; i++){
                for(int j = i+1;  j <= arr.length -1; j++){
                    if(arr[i] + arr[j] == target){
                         ans.add(i);
                         ans.add(j);

                    }

                }

        }
        return ans;



    }









    public static void main(String[] args) {

        char [] nums = {'a', 'e', 'i', 'o', 'u'};
        int [] arr = {1,2,3,4,5,6};

        Day3 obj = new Day3();
        System.out.println(Two_Sum(arr, 6));

    }


}
