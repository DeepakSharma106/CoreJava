package com.initialization;

public class Diary {
    private int pagecount;
    private String color;

    public Diary(int pagecount, String color) {
        this.pagecount = pagecount;
        this.color = color;
    }

    public int getPagecount() {
        return pagecount;
    }

    public void setPagecount(int pagecount) {
        this.pagecount = pagecount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Diary{" +
                "pagecount=" + pagecount +
                ", color='" + color + '\'' +
                '}';
    }
}
