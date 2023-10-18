package jpu2016.dogfight.model;

public class Plane extends Mobile{
    private static int SPEED = 2;
    private static int WIDTH = 100;
    private static int HEIGHT = 30;
    private int player;
    public Plane(int player, Direction direction, Position position, String image){
        super(direction, position, new Dimension(WIDTH,HEIGHT), SPEED, image);
        this.player=player;
        // TODO(doc): direction, position, image
    }
    public boolean isPlayer(int player){
        // TODO(doc): maybe ?
        return this.player==player;
    }
    public boolean hit(){
        // NOTE(doc): can be hit
        return true;
    }
}
