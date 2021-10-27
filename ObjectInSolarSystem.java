public class ObjectInSolarSystem {
    private double diameter;
    private String colour;

    public ObjectInSolarSystem(double diameter, String colour){
        this.diameter = diameter;
        this.colour = colour;
    }

    public double getDiameter(){
        return this.diameter;
    }

    public String getColour(){
        return this.colour;
    }
}