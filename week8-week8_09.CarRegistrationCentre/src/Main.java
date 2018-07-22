
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // below is the same examle program as in the assignment

        VehicleRegister vreg = new VehicleRegister();
        RegistrationPlate plate = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate secondPlate = new RegistrationPlate("DK", "123-ABC");
        vreg.add(plate, "me");
        vreg.add(secondPlate, "Donkey Kong");
        vreg.printOwners();
        System.out.println(vreg.get(secondPlate));
        vreg.printRegistrationPlates();

        // if the equals me
        // if the hashCode hasn't been overwritten, the owners are not found
    }
}
