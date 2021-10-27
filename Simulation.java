import java.util.ArrayList;

public class Simulation {
    private SolarSystem solarSystem;
    private ArrayList<RevolvingObject> allRevolvingObjects = new ArrayList<>();

    public Simulation(SolarSystem solarSystem){
        this.solarSystem = solarSystem;
    }

    public void addObjectInSolarSystem(ObjectInSolarSystem objectInSolarSystem){
        solarSystem.drawSolarObject(0, 0, objectInSolarSystem.getDiameter(), objectInSolarSystem.getColour());
    }

    public void addRevolvingObject(RevolvingObject revolvingObject, boolean hasAlreadyBeenAdded){
        solarSystem.drawSolarObjectAbout(revolvingObject.getDistance(), revolvingObject.getAngle(), revolvingObject.getDiameter(), revolvingObject.getColour(), revolvingObject.getCentreOfRotationDistance(), revolvingObject.getCentreOfRotationAngle());
        if(!hasAlreadyBeenAdded){
            allRevolvingObjects.add(revolvingObject);
        }
    }

    

    public void startAnimation(ObjectInSolarSystem centerObject){
        for(int i = 0; i < 720; i++){
            this.addObjectInSolarSystem(centerObject);
            for(int j = 0 ; j < allRevolvingObjects.size(); j++){
                allRevolvingObjects.get(j).move();
                this.addRevolvingObject(allRevolvingObjects.get(j), true);
            }
            solarSystem.finishedDrawing();
        }
    }
}
