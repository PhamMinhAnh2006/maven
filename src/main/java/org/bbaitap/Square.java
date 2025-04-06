package org.bbaitap;

public class Square implements Calculator{
    private int edge;

    public Square(int edge) {
        super();
        this.edge = edge;
    }


    @Override
    public String toString() {
        return  "dien tich hinh vuong la:" + areaCalulation();
    }


    public double areaCalulation() {
        // TODO Auto-generated method stub
        return edge*edge;
    }


}
