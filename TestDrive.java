public class TestDrive {

    public static void main (String[] args){

        SolarSystem alamSemesta = new SolarSystem(950,950);
        Sun matahari = new Sun(0, 0, 100, "YELLOW");
        Planet mercury = new Planet(70, 0, 15, "GRAY", 0);
        Planet venus = new Planet(120, 0, 20, "ORANGE", 0);
        Planet earth = new Planet(160, 0, 30, "BLUE", 0);
        Moon ourMoon = new Moon(25, 0, 7, "GRAY", 0, earth.distance, earth.angle);
        Planet mars = new Planet(200, 0, 15, "ORANGE", 0);
        Planet asteroid = new Planet(230, 0, 5, "GRAY", 0);
        Planet[] asteroids = new Planet[50];

            while(true){
                //The Sun
                matahari.drawSun(alamSemesta, matahari.distance, matahari.angle, matahari.diameter, matahari.colour);

                // Mercury
                mercury.drawPlanet(alamSemesta, mercury.distance, mercury.angle, mercury.diameter, mercury.colour, matahari.distance, matahari.angle);
                mercury.rotate();
                mercury.setSpeed(3);

                // Venus
                venus.drawPlanet(alamSemesta, venus.distance, venus.angle, venus.diameter, venus.colour, matahari.distance, matahari.angle);
                venus.rotate();
                venus.setSpeed(2);
                
                // The Earth
                earth.drawPlanet(alamSemesta, earth.distance, earth.angle, earth.diameter, earth.colour, matahari.distance, matahari.angle);
                earth.rotate();
                earth.setSpeed(1);
                
                //Earth's Moon
                ourMoon.drawPlanet(alamSemesta, ourMoon.distance, ourMoon.angle, ourMoon.diameter, ourMoon.colour, earth.distance, earth.angle);
                ourMoon.rotate();
                ourMoon.setSpeed(2);

                // Mars
                mars.drawPlanet(alamSemesta, mars.distance, mars.angle, mars.diameter, mars.colour, matahari.distance, matahari.angle);
                mars.rotate();
                mars.setSpeed(2);

                // Asteroid Belt
                for(int i = 0; i < 50; i++){
                    asteroids[i].drawPlanet(alamSemesta, asteroid.distance, asteroid.angle, asteroid.diameter, asteroid.colour, matahari.distance, matahari.angle);
                    asteroids[i].rotate();
                    asteroids[i].setSpeed(5);
                }


                alamSemesta.finishedDrawing();
            }
    }
}