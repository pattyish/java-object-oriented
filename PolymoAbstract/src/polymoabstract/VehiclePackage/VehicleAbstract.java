package polymoabstract.VehiclePackage;
import  polymoabstract.SeatPackage.Seat;
public abstract class VehicleAbstract {
    public int vehicleId;
    public String manufactureName;
    public String vehicleType;
    public boolean HasEngine;          
    public VehicleAbstract(int vehicleId,  String manufactureName, String vehicleType, boolean HasEngine ){
      this.vehicleId = vehicleId; 
      this.manufactureName = manufactureName;
      this.vehicleType = vehicleType;
      this.HasEngine = HasEngine; 
    }
    public void start(String vehicleType){
        if ( vehicleType == "bike"){
            this.HasEngine = false;
        }
    }
    public abstract void stop();   
    public abstract void setSeat(Seat seat);
    public abstract Seat getSeat();
}
