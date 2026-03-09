package Assignment3.module7;

public class BinarySearchRecursive {


        static int binarySearch(int[] arr, int left, int right, int target){

            if(left<=right){

                int mid = (left+right)/2;

                if(arr[mid] == target)
                    return mid;

                if(arr[mid] > target)
                    return binarySearch(arr,left,mid-1,target);

                return binarySearch(arr,mid+1,right,target);
            }

            return -1;
        }

        public static void main(String[] args) {

            int[] arr = {1,2,3,4,5};
            int target = 3;

            int result = binarySearch(arr,0,arr.length-1,target);

            System.out.println("Index: " + result);
        }
    }

