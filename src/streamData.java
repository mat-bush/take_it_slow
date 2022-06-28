import javax.sound.sampled.AudioInputStream;

public class streamData {
    
    // inits used attributes
    private AudioInputStream audioFile; // audio stream
    private int frameLength;
    private int numFrames;
    private byte[] byteArr;
    private int songData;
    private int bitSize;

    public void setAudioFile(AudioInputStream arg){
        this.audioFile = arg;
    }

    public AudioInputStream getAudioFile(){
        return audioFile;
    }


    public void setFrameLength(){
        try {
            this.frameLength = (int) audioFile.getFrameLength();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getFrameLength(){
        return frameLength;
    }

    public void setNumFrames(){
        try {
            this.numFrames = (int) audioFile.getFormat().getFrameSize();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getNumFrames(){
        return numFrames;
    }

    public void setByteArr(){
        try {
            this.byteArr = new byte[this.frameLength * this.numFrames];
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public byte[] getByteArr(){
        return byteArr;
    }

    public void setSongData(){
        try {
            this.songData = audioFile.read(this.byteArr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getSongData(){
        return songData;
    }

    public void setBitSize(){
        try {
            this.bitSize = audioFile.getFormat().getSampleSizeInBits();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getBitSize(){
        return bitSize;
    }

    public void writeSamples(){

    }

}

    


   