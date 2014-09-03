///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Cailee Cassidy
//lab02-Cyclometer
//September 3, 2014
public class Cyclometer {
    public static void main(String[] args) {
        int secsTrip1=480; //Seconds for trip 1
        int secsTrip2=3220; //Seconds for trip 2
        int countsTrip1=1561; //Rotations for trip 1
        int countsTrip2=9037; //Rotations for trip 2
        double wheelDiameter=27.0; //Diameter of wheel
        double PI=3.14159; //Pi, comma in instructions wrong, double
        int feetPerMile=5280; //Feet in a mile, comma in instructions wrong, not defined (int)
        int inchesPerFoot=12; //Inches in a foot, comma in instructions wrong, int
        int secondsPerMinute=60; //Seconds in a minute, comma in instructions wrong, int
        double distanceTrip1, distanceTrip2, totalDistance; //In instructions, totalDistance wasn't
        //defined so had to define it later 
        System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+
        " minutes and had "+countsTrip1+" counts");
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+
        " minutes and had "+countsTrip2+" counts");
        distanceTrip1=countsTrip1*wheelDiameter*PI; 
        //distance in inches (for each count, a rotation
        //of the wheel travels the diameter in inches times PI)
        distanceTrip1=inchesPerFoot*feetPerMile; //Gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;//not in instructions but had to define here
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "
        +totalDistance+" miles");
    }
}