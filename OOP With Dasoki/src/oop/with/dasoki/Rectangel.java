package oop.with.dasoki;

public class Rectangel {
    private double Length;
    private double Width;

    public Rectangel(double length, double width){
        Length = length;
        Width = width;
    }
    // public Rectangel addRectangel(Rectangel r){
    //     Rectangel result = new Rectangel();
    //     result.Length = this.Length + r.Length;
    //     result.Width = this.Width + r.Width;
    //     return result;
    // }

    public void setLength(double len) {
        Length = len;
    }

    public void setWidth(double width) {
        Width = width;
    }

    public double getLength() {
        return Length;
    }

    public double getWidth() {
        return Width;
    }

    public double getArea() {
        return Length*Width;
    }

    public boolean isequal(Rectangel r2) {
        if (this.Length == r2.Length && this.Width == r2.Width) {
            return true;
        }else {
            return false;
        }
    }

    public Rectangel(Rectangel sorceRectangel){
        Length = sorceRectangel.Length ;
        Width  = sorceRectangel.Width ;
    
    }
}
