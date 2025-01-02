package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        // 플레이어 켜기
        musicPlayer.on();

        musicPlayer.volumeUp();

        musicPlayer.volumeUp();

        musicPlayer.volumeMinus();

        musicPlayer.showStatus();

        musicPlayer.off();
    }
}
