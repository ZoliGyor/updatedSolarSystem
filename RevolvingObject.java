public class RevolvingObject extends ObjectInSolarSystem {
    private double distance;
    private double angle;
    private double centreOfRotationDistance;
    private double centreOfRotationAngle;
    private boolean revolvingAroundCenter;

    public RevolvingObject(double distance, double angle, double diameter, String colour, double centreOfRotationDistance, double centreOfRotationAngle, boolean revolvingAroundCenter){ 
        super(diameter, colour);
        this.distance = distance;
        this.angle = angle;
        this.centreOfRotationAngle = centreOfRotationAngle;
        this.centreOfRotationDistance = centreOfRotationDistance;
        this.revolvingAroundCenter = revolvingAroundCenter;
    }

    public double getDistance(){
        return distance;
    }

    public double getAngle(){
        return angle;
    } 

    public double getCentreOfRotationDistance(){
        return centreOfRotationDistance;
    }

    public double getCentreOfRotationAngle(){
        return centreOfRotationAngle;
    }

    public void move(){
        angle++;
        if(!revolvingAroundCenter){
            centreOfRotationAngle++;
        }
    }
}
