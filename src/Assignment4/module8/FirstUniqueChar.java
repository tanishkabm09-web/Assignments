package Assignment4.module8;

public class FirstUniqueChar {
    // LeetCode 387 - First Unique Character
        public static void main(String[] args) {
            String s = "leetcode";

            for (int i = 0; i < s.length(); i++) {
                if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                    System.out.println("Index: " + i);
                    return;
                }
            }
            System.out.println(-1);
        }
    }

