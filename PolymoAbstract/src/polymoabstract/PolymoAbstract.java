
package polymoabstract;

import polymoabstract.MotorBikePackage.MotorBike;
import polymoabstract.SeatPackage.Seat;

public class PolymoAbstract {
       public static void main(String[] args) {
        MotorBike automobile = new MotorBike(123, "Suzuki", "Dyna", "12h:00", "17h:00", true);
        
        Seat st = new Seat();
        st.seatColor = "yellow";
        st.seatId = 124;
        automobile.setSeat(st);
        automobile.displayCar();
       }
    }
