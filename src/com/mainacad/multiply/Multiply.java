package com.mainacad.multiply;

public class Multiply{
    private long mult1, mult2;

    public long getMult1() { return mult1; }
    public void setMult1(long mult1) { this.mult1 = mult1; }
    public long getMult2() { return mult2; }
    public void setMult2(long mult2) { this.mult2 = mult2; }

    public long getMultiply() {
        return mult1 * mult2;
    }
}
