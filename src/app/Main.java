package app;

import app.entity.Linear;
import app.entity.Square;
import app.entity.Series;

public class Main {

    public static void main(String[] args) {
        Linear a = new Linear(1,2);
        Square q = new Square(3,3,333);
        Series s = new Series(a,q);
        s.solve(1);
        s.print();
    }
}
