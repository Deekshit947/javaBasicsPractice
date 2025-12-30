public class typesOfStrings {
        public static void main(String[] args) {

            // 1. Using String (Immutable)
            String s = "Hello ";
            s = s + "World";
            System.out.println("String result: " + s);

            // 2. Using StringBuffer (Mutable + Thread-safe)
            StringBuffer stringBuffer = new StringBuffer("Hello ");
            stringBuffer.append("World");
            System.out.println("StringBuffer result: " + stringBuffer);

            // 3. Using StringBuilder (Mutable + Fast)
            StringBuilder stringBuilder = new StringBuilder("Hello ");
            stringBuilder.append("World");
            System.out.println("StringBuilder result: " + stringBuilder);
        }
    }


