package entities;

public class Elevator {
    public boolean direction;
    public Integer id;
    public Integer currentFloor;
    public Integer[] schedule;

    public Elevator(Integer id) {
        this.id = id;
        this.currentFloor=0;
        this.direction=true;
        this.schedule = new Integer[]{};
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public boolean isDirection() {
        return direction;
    }

    public void setDirection(boolean direction) {
        this.direction = direction;
    }

    public Integer getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(Integer currentFloor) {
        this.currentFloor = currentFloor;
    }

    public Integer[] getSchedule() {
        return schedule;
    }

    public void setSchedule(Integer[] schedule) {
        this.schedule = schedule;
    }
}
