//
//  name: jack tercheria
//  date: 2/17/2025
//  description: physics lab
//
public class Main {
    public static void main(String[] args) {
        Physics physics = new Physics();

        double speedOfLight = physics.getLightSpeedInMPH();
        double timeToEarth = physics.getTimeFromSunToEarth();
        double knownDistance = physics.getKnownDistance();
        double distance = physics.getDistance(speedOfLight, timeToEarth);


        physics.getDistance(5, 1);
        physics.getVelocity(25, 1);
        physics.getMomentum(20, 10);
        physics.getForce(20, 10);
        physics.getWork(10, 30);
        physics.getKineticEnergy(20, 10);
        physics.getPotentialEnergy(25, 5, 20);
        physics.getTheta(18.9,18.9);

        if (distance > knownDistance) {
            System.out.println("The distance measured is " + distance);
            System.out.println("The known distance is " + knownDistance);
            physics.logEarthToSunValidDistance();
        }

        else if (distance == knownDistance) {
            System.out.println("The distance measured is " + distance);
            System.out.println("The known distance is " + knownDistance);
            physics.logEarthToSunSameDistance();
        }

        else {
            System.out.println("The distance measured is " + distance);
            System.out.println("The known distance is " + knownDistance);
            physics.logEarthToSunInvalidDistance();
        }


    }
}