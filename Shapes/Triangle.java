package Shapes;

public class Triangle extends Shape{
    private double base, height;

    public Triangle(){
        color = "no color";
        base = 0;
        height = 0;
    }

    public Triangle(String color, double base, double height){
        this.color = color;
        this.base = base;
        this.height = height;
        toString();
    }

    public double getArea(){
        return (base*height)/2;
    }

    public String toString(){
        return "Color of the shape = \"" + color + "\"";
    }
}