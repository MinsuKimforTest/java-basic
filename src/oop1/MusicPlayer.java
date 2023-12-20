package oop1;

public class MusicPlayer {
    
    int volume;
    boolean isOn;

    void on() {
        isOn = true;
    }

    void off() {
        isOn = false;
    }

    void volumeUp() {
        volume++;
    }

    void volumeDown() {
        volume--;
    }

    void showStatus() {
        if (isOn) {
            System.out.println("음악 플레이어 On, 볼륨 : " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
