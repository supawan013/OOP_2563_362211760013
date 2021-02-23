package LAB8;

public abstract  class Object2D {
    //attributes
    private String b_color;
    private double area;

    //getter and setter
    abstract public void calArea();

    //getter and setter

    public double getArea() {
        return area;
    }

    public String getB_color() {
        return b_color;
    }

    public void setArea(double area) {
        this.area = area;
    }

    //class
}
