class Circle{

    double radius;


   public Circle(double radius){
        this.radius =radius;
    }
    public double area(){
        return 3.14* radius* radius;
    }
    public double circumference(){
        return  2* 3.14* radius;
    }
   public void display(){
        System.out.println("Radius of Circle:"+ radius);
        System.out.println("Area of Circle:"+ area());
        System.out.println("Circumference of Circle:"+ circumference());
    }
    public static void main(String[]args){
        Circle circle = new Circle(4);
        circle.display();
    }

}