public class CastingDemo {

    public static void main(String[] args) {

        // Implicit Casting (Widening)
        // Analogy: smaller items can ALWAYS fit inside larger box
        {
            // convert byte to short
            byte data = 102;
            short info = data;
            System.out.println("data = " + data);
            System.out.println("info = " + info + '\n');

            // convert int to long
            int intValue = 19802;
            long longValue = intValue;
            System.out.println("intValue = " + intValue);
            System.out.println("longValue = " + longValue + '\n');

        }

        // Explicit Casting (Narrowing)
        {
            // convert double to int
            double theDoubleGradeAvg = 89.70;
            int theIntGradeAvg = (int) theDoubleGradeAvg;

            System.out.println("theDoubleGradeAvg = " + theDoubleGradeAvg);
            System.out.println("theIntGradeAvg = " + theIntGradeAvg + '\n'); // data loss / truncation

            // convert float to byte
            float theFloatDistance = 123.60f;
            byte theByteDistance = (byte) theFloatDistance; // if no (byte) it will get a compilation error

            System.out.println("theFloatDistance = " + theFloatDistance);
            System.out.println("theByteDistance = " + theByteDistance + '\n'); // data loss / truncation

            // convert int to char
            int theCharacterCode = 65;
            char theChar = (char) theCharacterCode;

            System.out.println("theCharacterCode = " + theCharacterCode);
            System.out.println("theChar = " + theChar + '\n');

            int count = Integer.parseInt("49");
            System.out.println("count = " + count);
        }

    }
}
