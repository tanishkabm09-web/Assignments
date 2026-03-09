package Assignment3.module6;

public class EvenIndexEvenNumber {

        public static void main(String[] args) {

            int[] arr = {3,6,12,1,5,8};
            int n = arr.length;

            int[] result = new int[n];

            int evenIndex = 0;
            int oddIndex = 1;

            for(int num : arr){

                if(num %2 ==0){
                    result[evenIndex] = num;
                    evenIndex +=2;
                }else{
                    result[oddIndex] = num;
                    oddIndex +=2;
                }
            }

            for(int num : result)
                System.out.print(num + " ");
        }
    }

