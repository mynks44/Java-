public class Mainn {
    public static void main(String[] args) {
        Employeee employee = new Employeee("John Doe", 30, 50000.0);
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Age: " + employee.getAge());
        System.out.println("Employee Salary: " + employee.getSalary());

        Shape circle = new Circle(5.0);
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());

        Shape rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
    }
}