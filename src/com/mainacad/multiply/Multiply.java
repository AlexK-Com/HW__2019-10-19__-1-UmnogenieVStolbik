package com.mainacad.multiply;

public class Multiply{
    private long mult1, mult2;

    public long getMult1() { return mult1; }
    public void setMult1(long mult1) { this.mult1 = mult1; }
    public long getMult2() { return mult2; }
    public void setMult2(long mult2) { this.mult2 = mult2; }

    public String getMultiply() {
        String  str1 = "", str2 = "", strMultResult = "";
        str1 += mult1;
        str2 += mult2;
        strMultResult += mult1 * mult2;

        int mult1Length, mult2Length, multResultLength;
        mult1Length = str1.length();
        mult2Length = str2.length();
        multResultLength = strMultResult.length();

        StringBuilder stringBuilder = new StringBuilder();

// вывод условия умножения (до подчеркивания)
        for (int i = 0; i < multResultLength-mult1Length; i++) {
             stringBuilder.append(" ");
        }
        stringBuilder.append(str1 + System.getProperty("line.separator"));

        for (int i = 0; i < multResultLength-mult2Length; i++) {
            stringBuilder.append(" ");
        }
        stringBuilder.append(str2 + System.getProperty("line.separator"));

        for (int i = 0; i < multResultLength; i++) {
            stringBuilder.append("—");
        }
        stringBuilder.append(System.getProperty("line.separator"));
// конец -- вывода условия умножения (до подчеркивания)

        StringBuilder stringBuilderTemp = new StringBuilder();
        long multTemp;
        int multTempResultLength;

// вывод данных между подчеркиваниями
        for (int i = 0; i < mult2Length; i++) {
            multTemp = mult2 % 10;
            mult2 = mult2 / 10;
            multTemp = multTemp * mult1;
            multTempResultLength = (int) Math.log10(multTemp) + 1;
            for (int j = 0; j < multResultLength - multTempResultLength - i; j++) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(multTemp + System.getProperty("line.separator"));
        }
        for (int i = 0; i < multResultLength; i++) {
            stringBuilder.append("—");
        }
        stringBuilder.append(System.getProperty("line.separator"));
// конец --- вывод данных между подчеркиваниями

        stringBuilder.append(strMultResult);
        stringBuilder.append(System.getProperty("line.separator"));
        return stringBuilder.toString();
    }
}
