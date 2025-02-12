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
    
    public void getDistance(double Velocity, double Time) {
        Distance = Velocity * Time;
        System.out.println("The distance is " + Distance + " miles");
    }

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
}
