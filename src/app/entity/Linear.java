package app.entity;

public class Linear extends Solution{

    private double x;
    private double a;
    private double b;
    private boolean noRoots;

    public Linear(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    void calculate() {
        if(a==0 && b!=0){
            noRoots=true;
        }
        else if(a==0 && b==0){
            this.x=0;
        }
        else{
            this.x=-b/a;
        }
        setSolved(true);
    }

    @Override
    void print() {
        System.out.println(a + "x + " + b + " = 0");
        if(isSolved()) {
            if (!noRoots) {
                if (a == 0 && b == 0) {
                    System.out.println("Уравнение имеет бесконечное множество решений, т.к. a=b=0");
                } else {
                    System.out.println("x = " + x);
                }

            } else {
                System.out.println("Уравнение не имеет корней, т.к. а=0");
            }
        }
        else{
            System.out.println("Уравнение не решено");
        }
    }

    public double getX() {
        return x;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Linear{" +
                "x=" + x +
                ", a=" + a +
                ", b=" + b +
                '}';
    }
}
