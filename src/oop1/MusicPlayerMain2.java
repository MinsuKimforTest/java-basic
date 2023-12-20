package oop1;

public class MusicPlayerMain2 {

    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();
        //음악 켜기
        on(data);
        System.out.println("음악 플레이어를 시작합니다.");
        //볼륨 증가
        volumeUp(data);
        //볼륨증가
        volumeUp(data);
        //볼륨감소
        volumeDown(data);
        //음악 플레이어 상태
        showStatus(data);
        //음악 플레이어 끄기
        off(data);
    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
    }

    static void showStatus(MusicPlayerData data) {
        if (data.isOn) {
            System.out.println("음악 플레이어 On, 볼륨 : " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
