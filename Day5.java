public class Day5 {

    public static void main(String[] args) {
        Day5 obj = new Day5();
        int n = 5;
        obj.half_pattern(n);
        obj.reverse_half_pattern(n);

    }
//    Today we are going to learn about how the pattern works and practice some problems of How the pattern works

// Half Pattern
//            *
//            * *
//            * * *
//            * * * *
//            * * * * *

    private void half_pattern(int n ){

        for(int i = 0 ; i  <= n; i++){
            for(int j = 0 ; j  <= i; j++){
                System.out.print("* ");
            }
            System.out.println( );
        }
    }


//    Reverse Half pattern
//            * * * * *
//            * * * *
//            * * *
//            * *
//            *
    private void reverse_half_pattern(int n){

        for (int i = n; i >= 1; i--) {

            // inner loop to handle columns
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // printing new line for each row
            System.out.println();
        }
    }



}
