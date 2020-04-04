package ru.netology.radio.ru.netology;

public class radio {
    private final static int MAX_STATION = 10;
    private final static int MIN_STATION = 0;
    private final static int MAX_VOLUME = 10;
    private final static int MIN_VOLUME = 0;
    private int currentStation;
    private int volume;

    public setStation(int Station) {
        currentStation = 0;
    }

    public void next () {
        if (currentStation<MAX_STATION)
            currentStation=+1;
    }
    public void prev() {
        if (currentStation>MIN_STATION)
            currentStation=-1;
    }

    public increaseVolume (){
        if (volume<MAX_VOLUME)
            volume=+1;
    }
    public decreaseVolume (){
        if (volume>MIN_VOLUME)
            volume=+1;
    }

}



