package com.company;

public class Train {
    @Override
    public String toString() {
        return "Train{" +
                "destinationName='" + destinationName + '\'' +
                ", trainNumber=" + trainNumber +
                ", TimeSend=" + TimeSend +
                '}';
    }

    public Train(String destinationName, int trainNumber, int timeSend) {
        this.destinationName = destinationName;
        this.trainNumber = trainNumber;
        TimeSend = timeSend;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    private String destinationName;

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    private int trainNumber;

    public int getTimeSend() {
        return TimeSend;
    }

    public void setTimeSend(int timeSend) {
        TimeSend = timeSend;
    }

    private int TimeSend;


}
