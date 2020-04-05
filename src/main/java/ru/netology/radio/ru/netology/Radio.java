package ru.netology.radio.ru.netology;

public class Radio {
    private final static int MAX_STATION = 9;
    private final static int MIN_STATION = 0;
    private final static int MAX_VOLUME = 10;
    private final static int MIN_VOLUME = 0;
    private int currentStation;
    private int volume;

    public void setStation(int currentStation) {
        currentStation = 0;
    }
    public int getCurrentStation(){
        return currentStation;
    }

    public void next () {
        if (currentStation < MAX_STATION)
            currentStation = +1;
        if (currentStation == MAX_STATION)
            currentStation = 0;
       }

    public void prev() {
        if (currentStation>MIN_STATION)
            currentStation=-1;
        if (currentStation==MIN_STATION)
            currentStation=9;
    }

    public void increaseVolume (){
        if (volume<MAX_VOLUME)
            volume=+1;
    }
    public void decreaseVolume (){
        if (volume>MIN_VOLUME)
            volume=+1;
    }

}



