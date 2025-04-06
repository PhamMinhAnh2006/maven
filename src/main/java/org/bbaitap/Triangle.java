package org.bbaitap;

public class Triangle implements Calculator{
    private int height;
    private int bottomlength;


    public Triangle(int height, int bottomlength) {
        super();
        this.height = height;
        this.bottomlength = bottomlength;
    }


    @Override
    public String toString() {
        return "dien tich hinh tam giac la" +areaCalulation();
    }


    public double areaCalulation() {
        // TODO Auto-generated method stub
        return (height*bottomlength)/2;
    }


}
