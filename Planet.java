public class Planet extends Sun {
    
    int speed;

    public Planet(int distance, int angle, int diameter, String colour, int speed){
        super(distance,angle,diameter,colour);
        this.speed = speed;
    }

    public void drawPlanet(SolarSystem alamSemesta ,int distance, int angle, int diameter, String colour, int distanceFromSun, int angleFromSun ){
        alamSemesta.drawSolarObjectAbout(distance, angle, diameter, colour, distanceFromSun, angleFromSun);
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public void rotate(){
        angle = angle + speed;
    }
}
