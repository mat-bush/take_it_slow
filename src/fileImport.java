import java.lang.reflect.Array;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import java.io.*;




public class fileImport{

    // intializes needed attributes
    private String path;
    private File inputFile;
    private AudioInputStream audioFile;

    // sets path of object's file
    public void setPath(String arg){
        this.path = arg;
        // System.out.println(this.path);
    }

    // creates file object attribute
    public void setInputFile(){
        this.inputFile = new File(this.path);
        // System.out.println(this.inputFile);
    }

    // creates audio stream attribute
    public void setAudioStream(){
        try{
            this.audioFile = AudioSystem.getAudioInputStream(this.inputFile);
            System.out.println("set audio stream");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public String getPath(){
        
        return this.path;
    }

    public File getInputFile(){
        return this.inputFile;
    }

    public AudioInputStream getAudioFile(){
        return this.audioFile;
    }



       
}
    

