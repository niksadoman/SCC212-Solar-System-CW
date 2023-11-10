public class Moon extends Planet {

    int polarDistance;
    int polarAngle;

    public Moon(int distance, int angle, int diameter, String colour, int speed, int polarDistance, int polarAngle){
        super(distance,angle,diameter,colour,speed);
        this.polarDistance = polarDistance;
        this.polarAngle = polarAngle;
    }

    public void drawMoon(SolarSystem alamSemesta, int polarDistance, int polarAngle){
        alamSemesta.drawSolarObjectAbout(distance, angle, diameter, colour, polarDistance, polarAngle);
    }

    public void setOrbitDistance(int polarDistance){
        this.polarDistance = polarDistance;
    }

    public void setOrbitAngle(int polarAngle){
        this.polarAngle = polarAngle;
    }
}
