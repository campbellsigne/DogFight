package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;

public class Mobile implements IMobile{
    private int speed;
    private Direction direction;
    private Dimension dimension;
    private Position position;
    private Image image;
    private IDogfightModel dogfightmodel;
    public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image){
        this.speed=speed;
        this.direction=direction;
        this.position=position;
        this.dimension=dimension;
        // TODO(doc): image
        //this.image = image;
    }
    public Direction getDirection() {
        return direction;
    }
    public void setDirection(Direction direction) {
        this.direction=direction;
    }
    public Point getPosition() {
        Point p = new Point();
        p.setLocation(position.getX(), position.getY());
        return p;
    }
    public Dimension getDimension() {
        return dimension;
    }
    public int getWidth() {
        return dimension.getWidth();
    }
    public int getHeight() {
        return dimension.getHeight();
    }
    public int getSpeed() {
        return speed;
    }
    public Image getImage() {
        return image;
    }
    public void move() {
        // TODO Auto-generated method stub
    }
    public void placeInArea(IArea area) {
        // TODO Auto-generated method stub
    }
    public boolean isPlayer(int player) {
        // TODO Auto-generated method stub
        return false;
    }
    public boolean hit() {
        // NOTE(doc): can't be killed
        return false;
    }
    public boolean isWeapon() {
        return false;
    }
    private void moveUp(){
        position.setY(position.getY()-1);
    }
    private void moveDown(){
        position.setY(position.getY()+1);
    }
    private void moveRight(){
        position.setX(position.getX()+1);
    }
    private void moveLeft(){
        position.setX(position.getX()-1);
    }
    public Color getColor(){
        // TODO(doc): where to get that thing ?
        return null;
    }
    public IDogfightModel getDogfightModel(){
        return dogfightmodel;
    }
    public void setDogfightModel(IDogfightModel dogfightmodel){
        this.dogfightmodel=dogfightmodel;
    }
}
