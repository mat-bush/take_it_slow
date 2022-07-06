import java.lang.reflect.Array;

public class sinewav{
    public static void main(String[] args) {
        
    }
    // converts a set of time frequency values to radian values at
    // given times for given frequencies
    public Float[][] timeToRad(Float[] times, Float[] freqs){
        Float[][] radVals = new Float[freqs.length][];
        Float[] invFreqs = new Float[freqs.length];

        
        // inits a radian column for each freq w/the time values
        for (int i = 0; i < freqs.length - 1; i++){
            invFreqs[i] = 1 / freqs[i];
            radVals[i] = new Float[times.length];

             // converts time to rads
            for (int j = 0; j < times.length - 1; j++){
                radVals[i][j] = invFreqs[i] * times[i];

            }
        }

        return radVals;
        
    }
} 