package homeWork2;

public class stringToPrimitiveDataTypes {
    public static void main(String[] args) {
        String strBoolean = "tRue";
        String strByte = "120";
        String strShort = "32000";
        String strInt = "147895632";
        String strLong = "987654321987654321";
        String strDouble = "4444.5d";
        String strFloat = "2354.56f";

        boolean aBoolean = Boolean.parseBoolean(strBoolean);
        byte aByte = Byte.parseByte(strByte);
        short aShort = Short.parseShort(strShort);
        int aInt = Integer.parseInt(strInt);
        long aLong = Long.parseLong(strLong);
        double aDouble = Double.parseDouble(strDouble);
        float aFloat = Float.parseFloat(strFloat);

        System.out.println(aBoolean);
        System.out.println(aByte);
        System.out.println(aShort);
        System.out.println(aInt);
        System.out.println(aLong);
        System.out.println(aDouble);
        System.out.println(aFloat);
    }

}
