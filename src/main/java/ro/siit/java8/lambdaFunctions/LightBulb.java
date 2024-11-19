package ro.siit.java8.lambdaFunctions;

public class LightBulb {
    private Boolean isOn = false;
    private LightType lightType;
    private Integer power;
    public LightBulb(LightType lightType, Integer power) {
        this.lightType = lightType;
        this.power = power;
    }

    public Integer getPower() {
        System.out.println("Getting power of " + lightType + " for " + power);
        return power;
    }

    public LightType getLightType() {
        System.out.println("Get Light Type: " + lightType);
        return lightType;
    }

    public LightBulb start() {
        this.isOn = true;
        return this;
    }

    @Override
    public String toString() {
        return lightType + " " + power + " " + isOn.toString();
    }
}
