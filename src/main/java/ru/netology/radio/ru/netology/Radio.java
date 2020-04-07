package ru.netology.radio.ru.netology;

public class Radio {
    private final static int MAX_STATION = 9;
    private final static int MIN_STATION = 1;
    private final static int MAX_VOLUME = 10;
    private final static int MIN_VOLUME = 0;
    public int currentStation;
    public int volume;

    public void next() {
        if (currentStation < MAX_STATION)
            this.currentStation = currentStation + 1;
        if (currentStation == MAX_STATION)
            this.currentStation = 1;
    }

    public void prev() {
        if (currentStation > MIN_STATION)
            this.currentStation = currentStation - 1;
        if (currentStation == MIN_STATION)
            this.currentStation = 9;
    }

    public void increaseVolume() {
        if (volume < MAX_VOLUME)
            this.volume = volume + 1;
        if (volume == MAX_VOLUME)
            this.volume = volume;
    }

    public void decreaseVolume() {
        if (volume > MIN_VOLUME)
            this.volume = volume - 1;
        if (volume == MIN_VOLUME)
            this.volume = volume;
    }

    public void setStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

}



