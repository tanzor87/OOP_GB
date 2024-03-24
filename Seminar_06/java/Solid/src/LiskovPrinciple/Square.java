package LiskovPrinciple;

public class Square extends Quadrangle{
    private int length;
    public Square(int length) {
        this.length = length;
    }

    @Override
    public int area() {
        return this.length * this.length;
    }
}
