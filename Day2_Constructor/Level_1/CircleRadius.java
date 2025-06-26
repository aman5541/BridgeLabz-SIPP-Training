public class CircleRadius {
    double radius;

    
    public CircleRadius() {
       

    }
    public CircleRadius(double radius) {
        this.radius = radius;
    }

    public void printDetails() {
        System.out.println("Circle Radius: " + radius);
    }
    public static void main(String[] args) {
       
         CircleRadius circle1 = new CircleRadius(39.99);
         CircleRadius circle2 = new CircleRadius();
          
          circle1.printDetails();
          circle2.printDetails();
    }
}

