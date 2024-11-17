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

        Planet1 p1=new Planet1();

        p1.color="red";
        p1.temp="100000";

        Planet2 jupiter=new Planet2();

        jupiter.color="orange";
        jupiter.temp="150000";
    }
}
