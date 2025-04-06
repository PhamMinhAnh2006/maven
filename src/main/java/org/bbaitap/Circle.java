package org.bbaitap;

public class Circle implements Calculator{
    private int radius;

    public Circle(int radius) {
        super();
        this.radius = radius;
    }


    @Override
    public String toString() {
        return "dien tich hinh tron la; " + areaCalulation();
    }


    public double areaCalulation() {
        // TODO Auto-generated method stub
        return radius*radius*Math.PI;
    }
}
