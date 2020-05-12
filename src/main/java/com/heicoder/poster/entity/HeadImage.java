package com.heicoder.poster.entity;

/**
 * @author wuyunbin
 */
public class HeadImage {
    private String headImageUrl;
    private int width;
    private int height;
    private double xPercent;
    private double yPercent;

    public String getHeadImageUrl() {
        return headImageUrl;
    }

    public void setHeadImageUrl(String headImageUrl) {
        this.headImageUrl = headImageUrl;
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

    public HeadImage() {
    }

    public HeadImage(String headImageUrl, int width, int height, double xPercent, double yPercent) {
        this.headImageUrl = headImageUrl;
        this.width = width;
        this.height = height;
        this.xPercent = xPercent;
        this.yPercent = yPercent;
    }

    @Override
    public String toString() {
        return "HeadImage{" +
                "headImageUrl='" + headImageUrl + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", xPercent=" + xPercent +
                ", yPercent=" + yPercent +
                '}';
    }
}
