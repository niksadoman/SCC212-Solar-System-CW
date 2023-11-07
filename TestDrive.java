public class TestDrive {

    public static void main (String[] args){

        SolarSystem alamSemesta = new SolarSystem(1000,1000);
        Sun matahari = new Sun(0, 0, 100, "YELLOW");
        Planet mercury = new Planet(70, 0, 15, "GRAY", 0);
        Planet venus = new Planet(120, 0, 20, "ORANGE", 0);
        Planet earth = new Planet(160, 0, 30, "BLUE", 0);
        Moon ourMoon = new Moon(25, 0, 7, "GRAY", 0, earth.distance, earth.angle);
        Planet mars = new Planet(200, 0, 15, "ORANGE", 0);
        Planet[] asteroids = new Planet[50];
        Planet jupiter = new Planet(300, 50, 60, "YELLOW", 2);
        Planet saturn = new Planet(350, 120, 50, "LIGHT_GRAY", 2);
        Planet uranus = new Planet(420, 240, 45, "CYAN", 2);
        Planet neptune = new Planet(470, 150, 40, "BLUE", 2);

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
                for(int i = 0; i < 5; i++){
                    asteroids[i] = new Planet(230, i, 3, "GRAY", 5);
                    asteroids[i].drawPlanet(alamSemesta, asteroids[i].distance, asteroids[i].angle, asteroids[i].diameter, asteroids[i].colour, matahari.distance, matahari.angle);
                    asteroids[i].rotate();
                    asteroids[i].setSpeed(5);
                }

                // An Asteroid 
                asteroids[49] = new Planet(230, 100, 3, "GRAY", 5);
                asteroids[49].drawPlanet(alamSemesta, asteroids[49].distance, asteroids[49].angle, asteroids[49].diameter, asteroids[49].colour, matahari.distance, matahari.angle);
                asteroids[49].rotate();
                asteroids[49].setSpeed(5);

                // Jupiter
                jupiter.drawPlanet(alamSemesta, jupiter.distance, jupiter.angle, jupiter.diameter, jupiter.colour, matahari.distance, matahari.angle);
                jupiter.rotate();
                jupiter.setSpeed(2);

                // Saturn
                saturn.drawPlanet(alamSemesta, saturn.distance, saturn.angle, saturn.diameter, saturn.colour, matahari.distance, matahari.angle);
                saturn.rotate();
                saturn.setSpeed(2);

                // Uranus (light blue)
                uranus.drawPlanet(alamSemesta, uranus.distance, uranus.angle, uranus.diameter, uranus.colour, matahari.distance, matahari.angle);
                uranus.rotate();
                uranus.setSpeed(2);

                // Neptune (blue)
                neptune.drawPlanet(alamSemesta, neptune.distance, neptune.angle, neptune.diameter, neptune.colour, matahari.distance, matahari.angle);
                neptune.rotate();
                neptune.setSpeed(2);

                // Pluto


                alamSemesta.finishedDrawing();
            }
    }
}