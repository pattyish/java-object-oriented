package polymoabstract.MotorBikePackage;
import  polymoabstract.VehiclePackage.VehicleAbstract;
import  polymoabstract.SeatPackage.Seat;
public class MotorBike extends VehicleAbstract {
    private int BikeId;
    private String BikeName;
    private String startingBy;
    public String stoppingBy;
    public Seat seat; 
    
    public MotorBike(int id, String name, String vehicleType, String start, String stop, boolean HasEngine){
       super(id,name,vehicleType,HasEngine);
       this.BikeId = id;
       this.BikeName = name; 
       this.startingBy = start;
       this.stoppingBy = stop;
       
    }
    public void start(){
        this.startingBy = "Use kick";
    }
    @Override
    public void stop() {
       this.stoppingBy = "Use kick";
    }
    @Override
     public void setSeat(Seat seat){
        this.seat = seat; 
     }
     @Override
     public Seat getSeat(){
        return this.seat;
     }
     public void displayCar(){
        System.out.println("Bike Id:" + this.BikeId );
        System.out.println("Bike name:" + this.BikeName );
        System.out.println("Starting By:" + this.startingBy);
        System.out.println("Stopping By: " + this.stoppingBy);
        System.out.println("manufacture Name: " + this.manufactureName);
        System.out.println("vehicle type: " + this.vehicleType);
        System.out.println("Does it have engine?: " + this.HasEngine);
        System.out.println("seat id= : " + this.getSeat().seatId);
        System.out.println("seat color= : " + this.getSeat().seatColor);
        System.out.println("-------------------------------");
    }
}