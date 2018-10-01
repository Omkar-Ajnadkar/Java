public class HelloWorld
{   
    public static void main(String[] args)
    {
        byte bigByte = 127;
        short bigShort = 32767;
        int bigInt = 2100000000;
        long bigLong = 923414123412414141L;
        float bigFloat = 3.14F;
        double bigDouble = 3.1434322342424;

        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        boolean trueOrFalse = true;

        char randomChar = 65;
        char anotherChar = 'A';
        System.out.println(randomChar);

        char escapedChars = '\n';

        String randomString = "This is a random string";
        String anotherString = " in Java";
        String andAnotherString = randomString + anotherString;
        System.out.println(andAnotherString);

        String byteString = Byte.toString(bigByte);
        String shortString = Short.toString(bigShort);
        String intString = Integer.toString(bigInt);
        String longString = Long.toString(bigLong);
        String floatString = Float.toString(bigFloat);
        String doubleString = Double.toString(bigDouble);

        double doubleValue = 3.1465272627;
        int doubleInt = (int) doubleValue;
        System.out.println(doubleInt);

        int stringToInt = Integer.parseInt(intString);
        System.out.println(stringToInt);

    }
}