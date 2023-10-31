public class Planet extends Sun {
    
    int speed;

    public Planet(int distance, int angle, int diameter, String colour, int speed){
        super(distance,angle,diameter,colour);
        this.speed = speed;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public void rotate(){
        angle = angle + speed;
    }
}
