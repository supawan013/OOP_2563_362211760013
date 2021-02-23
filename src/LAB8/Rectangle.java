package LAB8;

public class Rectangle extends Object2D{
    //
    private double width;
    private double lenght;
    //
    public Rectangle (double width,double lenght){
        this.width = width;
        this.lenght = lenght;
    }

    @Override
    public void calArea() {
        double area = width * lenght;
        super.setArea(area);
    }
}
