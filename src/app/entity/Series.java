package app.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Series {

    private List<Solution> equations=new ArrayList<Solution>();;

    public Series(){
    }

    public Series(Solution...eq){
        equations.addAll(Arrays.asList(eq));
    }

    public void print(){
        for(int i=0;i<equations.size();i++){
            System.out.println("#"+(i+1) +" ");
            equations.get(i).print();
        }
    }

    public boolean add(Solution eq){
        return equations.add(eq);
    }

    public void add(List<? extends Solution> list){
        equations.addAll(list);
    }

    public Solution remove(int pos){
        return equations.remove(pos);
    }

    public boolean remove(Solution eq){
        return equations.remove(eq);
    }

    public void clear(){
        equations.clear();
    }

    public boolean solve(int pos){
        equations.get(pos).calculate();
        return true;
    }

    public void solveAll(){
        for(Solution eq : equations){
            eq.calculate();
        }
    }

    public List<Solution> getEquations() {
        return equations;
    }
}

