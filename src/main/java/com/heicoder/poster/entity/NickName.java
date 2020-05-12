package com.heicoder.poster.entity;

/**
 * @author wuyunbin
 */
public class NickName {
    /**
     * 昵称文本
     */
    private String nickname;
    /**
     * x方向百分比
     */
    private double xPercent;
    /**
     * y方向百分比
     */
    private double yPercent;
    /**
     * 字体大小比例
     */
    private int fontSize;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public NickName() {
    }

    public NickName(String nickname, double xPercent, double yPercent, int fontSize) {
        this.nickname = nickname;
        this.xPercent = xPercent;
        this.yPercent = yPercent;
        this.fontSize = fontSize;
    }

    @Override
    public String toString() {
        return "NickName{" +
                "nickname='" + nickname + '\'' +
                ", xPercent=" + xPercent +
                ", yPercent=" + yPercent +
                ", fontSize=" + fontSize +
                '}';
    }
}
