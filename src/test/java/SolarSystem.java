public class SolarSystem {

    public static void main(String[] args) {

        BasicStructure solar = new BasicStructure();

        solar.Sun="1";
        solar.Moon="1";
        solar.Planet="2";

        FeatureSun mars=new FeatureSun();

        mars.color = "blue";
        mars.size= "50 meters";
        mars.temp="90000";
    }
}
