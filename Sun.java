public class Sun {
    
    int distance;
    int angle;
    int diameter;
    String colour;

    public Sun(int distance, int angle, int diameter, String colour){
        this.distance = distance;
        this.angle = angle; 
        this.diameter = diameter;
        this.colour = colour;
    }

    public int getDistance(){
        return distance;
    }

    public int getAngle(){
        return angle;
    }

    public int getDiameter(){
        return diameter;
    }

    public String getColour(){
        return colour;
    }

    public void drawSun(SolarSystem alamSemesta ,int distance, int angle, int diameter, String colour){
        alamSemesta.drawSolarObject(distance, angle, diameter, colour);

    }
}

