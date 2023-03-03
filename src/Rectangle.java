
    public class Rectangle extends Geometric{
        private double width;
        private double height;

        public Rectangle() {

        }

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public Rectangle(String color, String filled, double width, double height) {
            super(color, filled);
            this.height = height;
            this.width = width;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getArea () {
            double getArea = height * width;
            return getArea;
        }

        public double getPerimeter () {
            double getPerimeter = (height + width) * 2;
            return getPerimeter;
        }
}
