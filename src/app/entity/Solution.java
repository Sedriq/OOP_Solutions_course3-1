package app.entity;

public abstract class Solution {

   private boolean solved;

    public boolean isSolved() {
        return solved;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }

    abstract void calculate();
   abstract void print();
}
