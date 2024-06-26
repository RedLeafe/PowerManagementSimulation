public class Appliance {
    private int locationID;
    private String description;
    private double powerOn;
    private double probOn;
    private boolean isOn;

    // contructor with attributes
    public Appliance(int locationID, String description, double powerOn, double probOn) {
        this.locationID = locationID;
        this.description = description;
        this.powerOn = powerOn;
        this.probOn = probOn;
        this.isOn = false;
    }

    // getters so we can copy information
    public int getLocationID() {
        return this.locationID;
    }

    public String getDescription() {
        return this.description;
    }

    public double getPowerOn(){
        return powerOn;
    }

    public double getProbOn(){
        return probOn;
    }

    // off and on method functions
    public void turnOn(){
        isOn = true;
    }
    public void turnOff(){
        isOn = false;
    }
    public void tryTurnOn(){
        if( Math.random() <= probOn )
            isOn = true;
    }

    // other useful methods
    public boolean isOn() {
        return this.isOn;
    }

    public double getOutput()
    {
        if ( isOn )
            return powerOn;
        else
            return 0;
    }

    public String toString(){
        return (locationID + "," + description + "," + powerOn + "," + probOn + "," + "false,0.0" );
    }

    public void setStatus( boolean s ){
        isOn = s;
    }


}
