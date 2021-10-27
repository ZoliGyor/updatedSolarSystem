public class Main {
    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystem(1200, 800);
        Simulation simulationSol = new Simulation(solarSystem);

        ObjectInSolarSystem sun = new ObjectInSolarSystem(80, "YELLOW");
        simulationSol.addObjectInSolarSystem(sun);

        RevolvingObject earth = new RevolvingObject(150, 180, 20, "BLUE", 0, 0, true);
        simulationSol.addRevolvingObject(earth, false);

        RevolvingObject moon = new RevolvingObject(20, 180, 10, "WHITE", 150 , 180, false);
        simulationSol.addRevolvingObject(moon, false);

        RevolvingObject mercury = new RevolvingObject(70, 10, 20, "LIGHT_GRAY", 0, 0, true);
        simulationSol.addRevolvingObject(mercury, false);

        RevolvingObject venus = new RevolvingObject(110, 300, 20, "ORANGE", 0, 0, true);
        simulationSol.addRevolvingObject(venus, false);

        RevolvingObject mars = new RevolvingObject(200, 240, 20, "RED", 0, 0, true);
        simulationSol.addRevolvingObject(mars, false);

        RevolvingObject jupiter = new RevolvingObject(250, 100, 40, "YELLOW", 0, 0, true);
        simulationSol.addRevolvingObject(jupiter, false);

        RevolvingObject saturn = new RevolvingObject(300, 330, 40, "LIGHT_GRAY", 0, 0, true);
        simulationSol.addRevolvingObject(saturn, false);

        RevolvingObject uranus = new RevolvingObject(350, 115, 20, "CYAN", 0, 0, true);
        simulationSol.addRevolvingObject(uranus, false);

        RevolvingObject neptune = new RevolvingObject(390, 77, 20, "BLUE", 0, 0, true);
        simulationSol.addRevolvingObject(neptune, false);

        simulationSol.startAnimation(sun); 
    }
}
