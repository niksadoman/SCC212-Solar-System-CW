public class TestDrive {

    public static void main (String[] args){

        SolarSystem alamSemesta = new SolarSystem(1100,1100);
        Sun matahari = new Sun(0, 0, 100, "YELLOW");
        Planet mercury = new Planet(70, 90, 15, "GRAY", 0);
        Planet venus = new Planet(120, 80, 20, "ORANGE", 0);
        Planet earth = new Planet(160, 270, 30, "BLUE", 0);
        Moon ourMoon = new Moon(25, 0, 7, "GRAY", 0, earth.distance, earth.angle);
        Planet mars = new Planet(200, 230, 15, "ORANGE", 0);
        Planet[] asteroids = new Planet[50];
        Planet jupiter = new Planet(300, 245, 60, "YELLOW", 2);
        Planet saturn = new Planet(350, 300, 50, "LIGHT_GRAY", 2);
        Planet uranus = new Planet(420, 45, 45, "CYAN", 2);
        Planet neptune = new Planet(470, 100, 40, "BLUE", 2);

            while(true){
                //The Sun
                matahari.drawSun(alamSemesta);

                // Mercury
                mercury.drawPlanet(alamSemesta);
                mercury.rotate();
                mercury.setSpeed(3);

                // Venus
                venus.drawPlanet(alamSemesta);
                venus.rotate();
                venus.setSpeed(2);
                
                // The Earth
                earth.drawPlanet(alamSemesta);
                earth.rotate();
                earth.setSpeed(1);
                
                //Earth's Moon
                ourMoon.drawMoon(alamSemesta, earth.distance, earth.angle);
                ourMoon.rotate();
                ourMoon.setSpeed(2);

                // Mars
                mars.drawPlanet(alamSemesta);
                mars.rotate();
                mars.setSpeed(2);

                // Asteroid Belt
                // for(int i = 0; i < 5; i++){
                //     asteroids[i] = new Planet(230, i, 3, "GRAY", 5);
                //     asteroids[i].drawPlanet(alamSemesta, asteroids[i].distance, asteroids[i].angle, asteroids[i].diameter, asteroids[i].colour, matahari.distance, matahari.angle);
                //     asteroids[i].rotate();
                //     asteroids[i].setSpeed(5);
                // }

                // An Asteroid 
                // asteroids[49] = new Planet(230, 100, 3, "GRAY", 5);
                // asteroids[49].drawPlanet(alamSemesta, asteroids[49].distance, asteroids[49].angle, asteroids[49].diameter, asteroids[49].colour, matahari.distance, matahari.angle);
                // asteroids[49].rotate();
                // asteroids[49].setSpeed(5);

                // Jupiter
                jupiter.drawPlanet(alamSemesta);
                jupiter.rotate();
                jupiter.setSpeed(2);

                // Saturn
                saturn.drawPlanet(alamSemesta);
                saturn.rotate();
                saturn.setSpeed(2);

                // Uranus (light blue)
                uranus.drawPlanet(alamSemesta);
                uranus.rotate();
                uranus.setSpeed(2);

                // Neptune (blue)
                neptune.drawPlanet(alamSemesta);
                neptune.rotate();
                neptune.setSpeed(2);

                alamSemesta.finishedDrawing();
            }
    }
}