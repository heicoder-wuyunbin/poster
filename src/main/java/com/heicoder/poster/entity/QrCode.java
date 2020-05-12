package com.heicoder.poster.entity;

/**
 * @author wuyunbin
 */
public class QrCode {
    private String text;
    private int width;
    private int height;
    private double xPercent;
    private double yPercent;

    public QrCode() {
    }

    public QrCode(String text, int width, int height, double xPercent, double yPercent) {
        this.text = text;
        this.width = width;
        this.height = height;
        this.xPercent = xPercent;
        this.yPercent = yPercent;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getxPercent() {
        return xPercent;
    }

    public void setxPercent(double xPercent) {
        this.xPercent = xPercent;
    }

    public double getyPercent() {
        return yPercent;
    }

    public void setyPercent(double yPercent) {
        this.yPercent = yPercent;
    }

    @Override
    public String toString() {
        return "QrCode{" +
                "text='" + text + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", xPercent=" + xPercent +
                ", yPercent=" + yPercent +
                '}';
    }
}
