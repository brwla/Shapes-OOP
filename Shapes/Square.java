package Shapes;

public class Square extends Shape{
    private double side;

    public Square(){
        color = "no color";
        side = 0;
    }

    public Square(String color, double side){
        this.color = color;
        this.side = side;
        toString();
    }
    
    public double getArea(){
        return side*side;
    }

    public String toString(){
        return "Color of the shape = \"" + color + "\"";
    }
}
