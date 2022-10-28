package org.inkhad;

import javax.sound.sampled.*;
import java.io.IOException;
import java.io.InputStream;

public class PlaySound {
    public static void main(String[] args) {
        try {
            Clip bgm = AudioSystem.getClip();
            InputStream is = PlaySound.class.getClassLoader().getResourceAsStream("sound/bgm.wav");
            AudioInputStream ais = AudioSystem.getAudioInputStream(is);
            bgm.open(ais);
            //bgm.start();
            bgm.loop(Clip.LOOP_CONTINUOUSLY);
            while (1 ==1){

            }
        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
