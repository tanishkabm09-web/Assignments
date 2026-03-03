package arrays;

public class E2 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        System.out.println(arr[1]);
        arr[1] = 40;
        System.out.println(arr[1]);
        //Access & Update elements in an array
        //This is because of index-based access or
        //direct index-mapping
        //[idx = pos-1] or [pos = idx+1]
        for (int i=0; i< arr.length; i++){
            System.out.println(arr[1] + " ");

        }
        System.out.println();
        for (int x : arr){
            System.out.print(x + " ");

        }
        System.out.println();
        for (Object o : arr){
            System.out.print(o + " ");
        }
        System.out.println();
        String name = "Java";
        System.out.println(name.length()); // length() method
        /*
        ☑️array.length is a property
        ☑️string.length() is a method
        ℹ️Memory Management
        Array object is stored in the heap
        Variable reference is stored i the stack
        Elements are stored in the contiguous memory blocks
        car[1][1][1][1] int[4][4][4][4] double[8][8][8][8][8] bytes
         */

    }
}
