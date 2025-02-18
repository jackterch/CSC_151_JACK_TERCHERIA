//
//  author: jack tercheria
//  date: 2/12/2025
//  description: physics lab
//

public class Physics {

    protected Double Velocity;
    protected Double Time;
    protected Double Displacement;
    protected Double Distance;
    protected Double Mass;
    protected Double Momentum;
    protected Double Acceleration;
    protected Double Force;
    protected Double Work;
    protected Double KineticEnergy;
    protected Double VelocitySquare;
    protected Double PotentialEnergy;
    protected Double Height;
    protected Double Angle;
    protected Double LightSpeedMPS;
    protected Double LightSpeedMPH;
    protected Double KnownDistance;
    protected Double TimeToEarth;
    
    /* 
    public void getDistance(double Velocity, double Time) {
        Distance = Velocity * Time;
        System.out.println("The distance is " + Distance + " miles");
    }
    */

    public void getVelocity(double Displacement, double Time) {
        Velocity = Displacement / Time;
        System.out.println("The velocity is " + Velocity + " mph");
    }

    public void getMomentum(double Mass, double Velocity) {
        Momentum = Mass * Velocity;
        System.out.println("The momentum is " + Momentum + " kg m/s");
    }

    public void getForce(double Mass, double Acceleration) {
        Force = Mass * Acceleration;
        System.out.println("The force is " + Force + " kg m/s^2");
    }

    public void getWork(double Force, double Displacement) {
        Work = Force * Displacement;
        System.out.println("The work is " + Work + " joules");
    }

    public void getKineticEnergy(double Velocity, double Momentum) {
        VelocitySquare = Math.pow(Velocity, 2);
        KineticEnergy = .5 * Momentum * VelocitySquare;
        System.out.println("The kinetic energy is " + KineticEnergy + " joule");
    }

    public void getPotentialEnergy(double Mass, double Acceleration, double Height) {
        PotentialEnergy = Mass * Acceleration * Height;
        System.out.println("The potential energy is " + PotentialEnergy + " joule");
    }

    public static double getTheta(double xVal, double yVal) {
        double theta = Math.atan2(yVal, xVal) * 180 / 3.1415;
        if (theta > 37 || theta < 36.87)
        System.out.println("Logging the angle " + String.format("%.2f", theta) + ". This is a valid 3-4-5 triangle.");
        else 
        System.out.println("Logging the angle " + String.format("%.2f", theta) + ". This is not a right triangle.");
        return theta;
    } 

    public void logInvalidAngleInfo(double Angle) {
        System.out.println("Logging the angle " + Angle + ". This is not a right triangle.");
    }

    public void logValidAngleInfo(double Angle) {
        System.out.println("Logging the angle " + Angle + ". This is a valid 3-4-5 triangle.");
    }

    public static double getDistance(double Velocity, double Time) {
        double x = Velocity * Time;
        System.out.println("The distance is " + x + " miles");
        return x;
    }

    public static double getLightSpeedInMPH() {
        double lightSpeed = getSpeedOfLightInMPS() * 60 * 60;
        return lightSpeed;
    }

    public static double getTimeFromSunToEarth() {
        double TimeToEarth = (getKnownDistance()  / getSpeedOfLightInMPS()) / 3600;
        return TimeToEarth;
    }

    public static double getSpeedOfLightInMPS() {
        double LightSpeedMPS = 186282;
        return LightSpeedMPS;
    }

    public static double getKnownDistance() {
        double KnownDistance = 92947266.72;
        return KnownDistance;
    }

    public void logEarthToSunInvalidDistance() {
        System.out.println("The distance does not reach the earth");
    }

    public void logEarthToSunValidDistance() {
        System.out.println("The distance is further than the known distance to earth");
    }

    public void logEarthToSunSameDistance() {
        System.out.println("The distance is the same as the known distance to earth");
    }

}
