package Shapes;

public class Circle extends Shape{
    private double radius;

    public Circle(){
        color = "no color";
        radius = 0;
    }

    public Circle(String color, double rad){
        this.color = color;
        radius = rad;
        toString();
    }
    
    public double getArea(){
        return Math.PI*radius*radius;
    }

    public String toString(){
        return "Color of the shape = \"" + color + "\"";
    }
}