import java.lang.reflect.Array;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;

import java.io.*;




public class importFile {


    public static void selectFile(String arg){

        String fileName = "/Users/mathew/repos/take_it_slow/lib/media/" + arg;
        File   input = new File(fileName);
	
       	try {
            // establishes input file as audio stream
            AudioInputStream audiofile = AudioSystem.getAudioInputStream(input);

            // number of bytes
            int frameLength = (int) audiofile.getFrameLength();

            // number of frames
            int numFrames = (int) audiofile.getFormat().getFrameSize();

            // creates byte array
            byte[] bytes = new byte[frameLength * numFrames];

            // reads data to array
            int songData = 0;
            songData = audiofile.read(bytes);

            
            int bitSize = audiofile.getFormat().getSampleSizeInBits();
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
            

    }


    public static void main(String[] args) {
        selectFile("sample_wav.wav");
        
    }
}
