package com.github.appreciated.apexcharts.config.yaxis;

public class AxisBorder {
    private Boolean show;
    private String color;
    private Number offsetX;
    private Number offsetY;


    public AxisBorder() {
    }

    public Boolean getShow() {
        return show;
    }

    public String getColor() {
        return color;
    }

    public Number getOffsetX() {
        return offsetX;
    }

    public Number getOffsetY() {
        return offsetY;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOffsetX(Number offsetX) {
        this.offsetX = offsetX;
    }

    public void setOffsetY(Number offsetY) {
        this.offsetY = offsetY;
    }

}
