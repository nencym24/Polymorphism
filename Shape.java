public class Shape {

    public static void main(String[] args) {

        int a, b;

        Triangle t = new Triangle();
        t.dataCalculate(10, 5);
        Rectangle r = new Rectangle();
        r.dataCalculate(20, 2);
    }
}

class Rectangle {

    void dataCalculate(int a, int b) {

        float area = a * b;
    }
}

class Triangle extends Rectangle {

    void dataCalculate(int a, int b) {

        float area = (a * b) / 2;
        super.dataCalculate(a, b);
        System.out.println("Area of Rectengle :" + area);
        System.out.println("Area of triangle : " + area);
    }

}
