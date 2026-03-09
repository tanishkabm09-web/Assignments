package Assignment3.module7;

public class FirstLastOccurrence {


        // Find first occurrence
        static int firstOccurrence(int[] arr, int target) {
            int left = 0;
            int right = arr.length - 1;
            int result = -1;

            while (left <= right) {
                int mid = (left + right) / 2;

                if (arr[mid] == target) {
                    result = mid;
                    right = mid - 1;   // continue searching left side
                }
                else if (arr[mid] < target) {
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }

            return result;
        }

        // Find last occurrence
        static int lastOccurrence(int[] arr, int target) {
            int left = 0;
            int right = arr.length - 1;
            int result = -1;

            while (left <= right) {
                int mid = (left + right) / 2;

                if (arr[mid] == target) {
                    result = mid;
                    left = mid + 1;   // continue searching right side
                }
                else if (arr[mid] < target) {
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }

            return result;
        }

        public static void main(String[] args) {

            int[] arr = {1,2,2,2,3,4,5};
            int target = 2;

            int first = firstOccurrence(arr, target);
            int last = lastOccurrence(arr, target);

            System.out.println("First Occurrence: " + first);
            System.out.println("Last Occurrence: " + last);
        }
    }

