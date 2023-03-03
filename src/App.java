public class App {
    public static void main(String[] args) {
        Circle c =new Circle(5,"black","20%");
//        System.out.println("dien tich hinh tron la: " + c.getArea());
//        System.out.println("chu vi hinh tron la: " + c.getPerimeter());
//        System.out.println("duong kinh hinh tron la: " + c.getDimeter());
        c.printCirle();

        Rectangle rectangle = new Rectangle(5,7);
        System.out.println("dien tich hinh chu nhat la: " + rectangle.getArea());
        System.out.println(("chu vi hinh chu nhat la: " + rectangle.getPerimeter()));
    }
}
