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

    public void drawSun(SolarSystem alamSemesta){
        alamSemesta.drawSolarObject(distance, angle, diameter, colour);
    }
}

