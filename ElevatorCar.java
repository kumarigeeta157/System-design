package com.example.System.Design.Elevator;
public class ElevatorCar {
    boolean isMoving;
    boolean isGoingUp;

    int currentFloor;
    com.example.System.Design.Elevator.CallingUnit callingUnit;

    public ElevatorCar(boolean isMoving, boolean isGoingUp, int currentFloor,CallingUnit callingUnit) {
        this.isMoving = isMoving;
        this.isGoingUp = isGoingUp;
        this.currentFloor = currentFloor;
        this.callingUnit = callingUnit;
    }

    void goToFloor(int destinationFloor){
        callingUnit.moveElevator(currentFloor,destinationFloor);
        currentFloor = destinationFloor;
    }
}
