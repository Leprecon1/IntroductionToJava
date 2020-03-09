package com.company;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours < 24)
        this.hours = hours;
        else
            this.hours = 0;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes < 60)
        this.minutes = minutes;
        else
                this.minutes = 0;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds < 60)
        this.seconds = seconds;
                else
                    this.seconds = 0;
    }

    public void ChangeTime(int hours, int minutes, int seconds){
        if(hours + this.hours > 24)
            this.hours =  (this.hours + hours) % 24;
            else
        this.hours += hours;

        if(minutes + this.minutes > 60)
            this.minutes =  (this.minutes + minutes) % 60;
        else
            this.minutes += minutes;

        if(seconds + this.seconds > 60)
            this.seconds =  (this.seconds + seconds) % 60;
        else
            this.seconds += seconds;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }
}
