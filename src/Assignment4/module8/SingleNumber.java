package Assignment4.module8;

public class SingleNumber {
    // LeetCode 136 - Single Number

        public static void main(String[] args) {

            int[] nums = {4,1,2,1,2};
            int result = 0;

            for(int n : nums){
                result ^= n;
            }

            System.out.println(result);
        }
    }

