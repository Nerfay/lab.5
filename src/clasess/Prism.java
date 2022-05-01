package clasess;

public class Prism extends Square {
    private int h;

    public int getH() {
        return h;
    }

    public void setH(int h) {
        if (h > 0) {
            this.h = h;
        } else {
            this.h = 1;
        }
    }

    public Prism(int side, int h) {
        super(side);
        this.setH(h);
    }
    public float getSquareOfSide (){
        return  (super.getP()*h);
    }
    public float getS() {
        return  (getSquareOfSide() + (2 * super.getSquareOfSquare()));
    }

    public float getV() {
        return (side*side*h);
    }
    public float getDiagonal(){
        return (float) ((h*h)+(super.getD()*super.getD()));
    }
    @Override
    public String toString() {
        return super.toString() +
                ", Height= " + this.getH() +
                ", SquareOfPrism= " + this.getS() +
                ", Volume= " + this.getV()+
                ", DiagonalOfPrism=" + this.getDiagonal() ;
    }
}