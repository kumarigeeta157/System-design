package com.example.System.Design.Elevator;

public class CallingUnit {
    DispatcherUnit dispatcherUnit;
//    CallingUnit callingUnit;
//
//    public CallingUnit getCallingUnit() {
//        return callingUnit;
//    }
//
//    public void setCallingUnit(CallingUnit callingUnit) {
//        this.callingUnit = callingUnit;
//    }

    public CallingUnit(DispatcherUnit dispatcherUnit) {
        this.dispatcherUnit = dispatcherUnit;
    }

    void moveElevator(int currentFloor, int destinationFloor){
        dispatcherUnit.getNextFloorForElevator(currentFloor, destinationFloor);
    };
}