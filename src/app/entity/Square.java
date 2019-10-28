package app.entity;

public class Square extends Solution{

    private String x1;
    private String x2;
    private double a;
    private double b;
    private double c;
    private double d;

    public Square(double a, double b, double c) {
        if(a==0){
            a=1;
        }
        this.a = a;
        this.b = b;
        this.c = c;
        d=b*b-4*a*c;
    }

    @Override
    void calculate() {
        if(d==0){
            x1=Double.toString(-b/(2*a));
            x2=x1;
        }
        else if(d>0){
            x1=Double.toString((-b+Math.sqrt(d))/(2*a));
            x2=Double.toString((-b-Math.sqrt(d))/(2*a));
        }
        else{
            x1="( "+(-b)+" + "+Math.sqrt(-d)+" * i ) / "+(2*a);
            x2="( "+(-b)+" - "+Math.sqrt(-d)+" * i ) / "+(2*a);
        }
        setSolved(true);
    }

    @Override
    void print() {
        System.out.println(a + "x^2 + " + b + "x + " + c + " = 0");
        if(isSolved()) {
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        else{
            System.out.println("Уравнение не решено");
        }
    }

    public String getX1() {
        return x1;
    }

    public String getX2() {
        return x2;
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Square{" +
                "x1=" + x1 +
                ", x2=" + x2 +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
