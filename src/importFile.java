import java.lang.reflect.Array;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;

import java.io.*;




public class importFile {


    public static void selectFile(String arg){

        String fileName = "/Users/mathew/repos/slow_down/Take_it_slow/lib/media/" + arg;
        File   input = new File(fileName);

        try{
            AudioInputStream audiofile = AudioSystem.getAudioInputStream(input);
            audiofile.get
        } catch (Exception e) {

        }

        
    }


    public static void main(String[] args) {
        selectFile("sample_wav.wav");

    }
}
