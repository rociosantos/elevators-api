package services;

import entities.Elevator;

import java.util.*;

public class ElevatorServices {

    public static final Map<String,Integer> elevatorData = new HashMap<String, Integer>() {
        {
            put("elevator", 2);
            put("floor", 4);
        }
    };
//

    public static List<Elevator> elevators = new ArrayList<>();


    public List<Elevator> initializeElevators(){
        if(elevators.isEmpty()){
            List<Elevator> allElevators = new ArrayList<>();
            for(int i = 0; i< elevatorData.get("elevator"); i++){
                allElevators.add(new Elevator(i));
            }
            this.elevators = allElevators;
            return allElevators;
        }
        return elevators;
    }

//    public final JSONObject elevators = new JSONObject(){
//        JsonElement userData = usersJson.getAsJsonObject().get("users");
//        List<User> allUsers = new Gson().fromJson(userData, new TypeToken<List<User>>() {
//        }.getType());
//    }

//    public static List<Elevator> elevators = new ArrayList<Elevator>() {{
//        add(new Elevator(1));
//        add(new Elevator(2));
//    }};
//    public static Elevator elevator1 = new Elevator(1);

//    public Elevator elevator2 = new Elevator(2);

    public void schedule(){
    }

    public List<Elevator> getElevators() {
        return initializeElevators();
    }
//
    public Elevator getElevatorById(Integer id){
       getElevators();
        for (Iterator<Elevator> iter = elevators.iterator(); iter.hasNext(); ) {
            Elevator elevator = iter.next();
           if(elevator.id.equals(id)){
               return elevator;
           }
        }
        System.out.println(elevators);
        return null;
    }
//
//    public Elevator pickElevator(){
//        List<Elevator> allElevators = elevators;
//
//        return allElevators.get(0);
//
//    }

    public Elevator createElevator(Integer id){

        return new Elevator(id);

    }

//    public Map getElevatorStatus(int id){
//        Elevator elevator = getElevatorById(id);
//
//
//        };
//
//    }

    public Integer pickFloor(){

        return 1;

    }

    public Elevator move(Elevator elevator){
        System.out.println(elevator.direction);
        System.out.println(elevator.currentFloor);
        if(elevator.isDirection()){
            elevator.setCurrentFloor(elevator.currentFloor + 1);

        } else {
            elevator.setCurrentFloor(elevator.currentFloor - 1);
        }
        System.out.println(elevator.direction);
        System.out.println(elevator.currentFloor);
        return elevator;
    }
//
//    public static void main(String[] args) {
//        getElevators();
//        Elevator elevator = getElevatorById(1);
//        elevator = move(elevator);
//
//        System.out.println(elevator);
//    }
}
