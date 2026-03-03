public class StringComparison {
        public static void main(String[] args) {

            // String (Immutable)
            String s = "Hello";
            s.concat(" World");
            System.out.println("String: " + s);

            // StringBuilder (Mutable, not thread-safe)
            StringBuilder sb = new StringBuilder("Hello");
            sb.append(" World");
            System.out.println("StringBuilder: " + sb);

            // StringBuffer (Mutable, thread-safe)
            StringBuffer sbf = new StringBuffer("Hello");
            sbf.append(" World");
            System.out.println("StringBuffer: " + sbf);
        }
    }

