import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.naming.spi.InitialContextFactoryBuilder;

public class audioProcess{
    
    private streamData ds; 
    private int[][] SampByChan;
    

    public static void main(String[] args) {
        audioProcess ap = new audioProcess();
        ap.Init("/Users/mathew/repos/take_it_slow/lib/media/sample_wav.wav");
        ap.SetSampByChan();
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
        sd.setByteArr();
        sd.setSongData();
        sd.setBitSize();

        this.ds = sd;


    }

    public void SetSampByChan(){
        // inits the array of arrays that will hold audio data by channel
        this.SampByChan = new int[this.ds.getAudioFile().getFormat().getChannels()][];

        // establishes data variable
        byte[] SampData = this.ds.getByteArr();

        

        for (int chn = 0; chn < this.ds.getAudioFile().getFormat().getChannels();){
            int i = 0;
            int[] chnsSamps = new int[SampData.length / this.ds.getAudioFile().getFormat().getChannels()];

            for (int sampi = chn; sampi < SampData.length;){
                int sampVal = (int) SampData[sampi];
                chnsSamps[i] = sampVal;

                sampi = sampi + this.ds.getAudioFile().getFormat().getChannels();
                i++;
                
            }
            SampByChan[chn] = chnsSamps;
            System.out.println(chn);
            chn++;
        }
        
    }

    public int[][] getSampByChan(){
        return this.SampByChan;
    }

   
}
