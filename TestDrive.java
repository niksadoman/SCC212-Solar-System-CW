public class TestDrive {

    public static void main (String[] args){

        SolarSystem alamSemesta = new SolarSystem(950,950);
        Sun matahari = new Sun(0, 0, 100, "YELLOW");
        Planet mercury = new Planet(70, 0, 15, "GRAY", 0);
        Planet venus = new Planet(120, 0, 20, "ORANGE", 0);
        Planet earth = new Planet(200, 0, 30, "BLUE", 0);
        Moon ourMoon = new Moon(50, 0, 7, "GRAY", 0, earth.distance, earth.angle);

            while(true){
                //The Sun
                matahari.drawSun(alamSemesta, matahari.distance, matahari.angle, matahari.diameter, matahari.colour);

                // Mercury
                alamSemesta.drawSolarObjectAbout(mercury.distance, mercury.angle, mercury.diameter, mercury.colour, matahari.distance, matahari.angle);
                mercury.rotate();
                mercury.setSpeed(3);

                // Venus
                alamSemesta.drawSolarObjectAbout(venus.distance, venus.angle, venus.diameter, venus.colour, matahari.distance, matahari.angle);
                venus.rotate();
                venus.setSpeed(2);
                
                // The Earth
                alamSemesta.drawSolarObjectAbout(earth.distance, earth.angle, earth.diameter, earth.colour, matahari.distance, matahari.angle);
                earth.rotate();
                earth.setSpeed(1);
                
                //Earth's Moon
                alamSemesta.drawSolarObjectAbout(ourMoon.distance, ourMoon.angle, ourMoon.diameter, ourMoon.colour, earth.distance, earth.angle);
                ourMoon.rotate();
                ourMoon.setSpeed(2);

                alamSemesta.finishedDrawing();
            }

        
        /*
        int e = 0;
        int m = 0;

        while(true){

            //Sun
            alamSemesta.drawSolarObject(0,0, 100, "YELLOW");

            //Earth
            alamSemesta.drawSolarObjectAbout(200, e, 30, "BLUE", 0, 0);
            e++;

            //Moon
            alamSemesta.drawSolarObjectAbout(100, m, 7, "GRAY",200 , e);
            m = m + 5;
            

            alamSemesta.finishedDrawing();



        }*/
    }
}