package jpu2016.dogfight.model;

public class Position {
    private double x;
    private double y;
    private double maxX;
    private double maxY;
    public Position(double x, double y, double maxX, double maxY){
        this.x=x;
        this.y=y;
        this.maxX=maxX;
        this.maxY=maxY;
    }
    public Position(Position position){
        this.x=position.getX();
        this.y=position.getX();
        this.maxX=position.maxX;
        this.maxY=position.maxY;
    }
    public void setX(double x) {
        x%=maxX;
        if(x<0)x=maxX;
        this.x = x;
    }
    public void setY(double y) {
        y%=maxY;
        if(y<0)y=maxY;
        this.y = y;
    }
    protected void setMaxX(double maxX){
        this.maxX=maxX;
    }
    protected void setMaxY(double maxY){
        this.maxY=maxY;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
}
