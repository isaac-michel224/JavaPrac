import java.util.HashMap;

public class LoopMapExercise {
    public static void main(String[] args) {
        HashMap<String, Integer> vehicle= new HashMap<>();

        vehicle.put("Fit",34);
        vehicle.put("Cybertruck",46);
        vehicle.put("CX-3",25);
        vehicle.put("Camry", 10);
        vehicle.put("Pacifica", 6);

        System.out.println("Size of map is:- "
                + vehicle.size());

        System.out.println(vehicle);

        if (vehicle.containsKey("Camry")) {

            Integer a = vehicle.get("Camry");

            System.out.println("The make for the model"
            + "\"Camry\" is:- " + a);
        }







    }
}