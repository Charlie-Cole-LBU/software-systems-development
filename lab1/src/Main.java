
public class Main {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(10.0,20.0);

        System.out.println("rectangle has " + r1.getSides() + " sides and a area of " + r1.getarea());

        Circle c1= new Circle(6.0);

        System.out.println("Circle " + c1.getSides() + " sides and a area of " + c1.getarea());

        Ellipse e1= new Ellipse(5.0,6.0);

        System.out.println("Ellipse has a area of " + e1.getarea());




    }
}