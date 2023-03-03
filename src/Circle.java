public class Circle extends Geometric {
    private double radius;

    public Circle(){

    }
    public Circle(double radius){
            this.radius = radius;
    }
    public Circle(double radius, String color, String filled) {
            super(color,filled);
            this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        double area;
        area = radius*radius*3.14;
        return area;
    }
    public double getPerimeter(){
        double perimerter;
        perimerter = radius*2*3.14;
        return perimerter;
    }
    public double getDimeter(){
        double dimeter;
        dimeter = radius*2;
        return dimeter;
    }

    @Override
    public String toString() {
        return "Circle{ " + " radius=" + radius + ", color=" + getColor() + ", filled = " + getFilled()+
        ", area = " + getArea() + ", perimeter = " + getPerimeter() + ", diameter = " + getDimeter() +
                " }";
    }
    public void printCirle(){
        System.out.println(toString());
    }
}

