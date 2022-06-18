import java.lang.reflect.Array;

import javax.naming.spi.InitialContextFactoryBuilder;

public class audioProcess{
    
    private streamData ds; 
    private int[][] sampInt;
    public static void main(String[] args) {
        audioProcess ap = new audioProcess();
        ap.Init("/Users/mathew/repos/take_it_slow/lib/media/sample_wav.wav");
        ap.setSampInt();
    }


    public void Init(String arg) {
        fileImport fi = new fileImport();
        streamData sd = new streamData();
        
        fi.setPath(arg);
        fi.setInputFile();
        fi.setAudioStream();

        sd.setAudioFile(fi.getAudioFile());
        sd.setFrameLength();
        sd.setNumFrames();
        sd.setBytes();
        sd.setSongData();
        sd.setBitSize();

        this.ds = sd;


    }

    public void setSampInt(){
        this.sampInt = new int[ds.getAudioFile().getFormat().getChannels()][(int) ds.getAudioFile().getFrameLength()];

        System.out.println(this.sampInt);
        
    }

  
}
