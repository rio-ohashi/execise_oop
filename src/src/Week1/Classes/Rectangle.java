package Week1.Classes;

import java.util.stream.IntStream;

public class Rectangle {
    private int width = 0;
    private int height = 0;
    private String color = "";

    public Rectangle(int width, int height, String color) {
        if (width < 1) {
            this.width = 1;
        } else {
            this.width = width;
        }
        if (height < 1) {
            this.height = 1;
        } else {
            this.height = height;
        }
        if (color.equals("")) {
            this.color = "Blue";
        } else {
            this.color = color;
        }
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public int getWidth() {
        return width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {
        return height;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void draw() {
        String rec = "";
        for (int i=0;i<this.height;i++) {
            for (int j=0;j<this.width;j++) {
                rec += this.color.charAt(0);
                if (j == this.width - 1) {
                    rec += "\n";
                }
            }
        }
        System.out.println(rec);
    }
}
