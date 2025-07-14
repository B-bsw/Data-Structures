public class Circle {
    private double r;
    public Circle(double r){this.r = r;}
    public Circle(){}
    public double getR() {return this.r;}
    public void setR(double r) {this.r = r;}
    public double area(){return Math.PI * (r * r);}
    public double circumference(){return 2 * Math.PI * r;}
    public double volume(){return ((double) 4/3) * Math.PI * (r * r * r);}
}
