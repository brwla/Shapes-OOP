package Shapes;

public class Rectangle extends Shape{
    private double length, width;

    public Rectangle(){
        color = "no color";
        length = 0;
        width = 0;
    }

    public Rectangle(String color, double len, double wid){
        this.color = color;
        length = len;
        width = wid;
        toString();
    }
    
    public double getArea(){
        return length*width;
    }

    public String toString(){
        return "Color of the shape = \"" + color + "\"";
    }
}