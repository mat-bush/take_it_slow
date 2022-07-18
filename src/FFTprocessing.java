// What this is:
//  This is the class that processes the data coming from the out come of FFT



// plans for this aspect of the project:
//  How the process works:
//  1) data sent in the form of Array of Floats [t,[array of frequencies], [array of amplitudes]
//                                               [t + ∆ ] , [array of frequencies], [array of amplitudes]]
//      a) create object for input w/ get and set methods: accomplished
//  2) iterate through the array from step 1 and
//      a) round frequencies in array: accomplished
//         i) create method to round to desired accuracy: accomplished
//        ii) create new array for rounded frequcines and times w/ get and set: accomplished
//      b) create new array w/ time, Amplitude, and radian values
//         i) create object for new array w/ get and set methods: accomplished
//  3) write to txt doc(s)
//  4) grep for each unique time and pull lines w/ each rad value and amplitude at a given and sum
// 




public class FFTprocessing {
// object that holds array from step one
    private float[][][] RawFFTdata; // 1a
    private float[][][] RoundFFTdata; // 2aii
    private float[][][] TAR; // (Time, Amplitude, Radian) 2bi

    // for step 1a
    public void setRawFFT(float[][][] arg){
        this.RawFFTdata = arg;
    }

    public float[][][] getRawFFT(){
        return this.RawFFTdata;
    }

    // for step 2aii
    public void setRoundFFT(float[][][] arg){
        this.RoundFFTdata = arg;
    }

    public float[][][] getRoundFFT(){
        return this.RoundFFTdata;
    }

    // rounding method for 2ai 
    public float[] roundToFloats(float[] floats, Double decPlaces){
        
        float[] roundedFloats = new float[floats.length];

        // test for decPlaces input
        if (decPlaces == 0){
            for(int i = 0; i < floats.length; i++){
                roundedFloats[i] = Math.round(floats[i]);
            }
        }
        else if (decPlaces > 0) {
            float scaleFactor = (float) Math.pow(10, decPlaces); 

            for(int i = 0; i < floats.length; i++){
                roundedFloats[i] = Math.round(floats[i] * scaleFactor) / scaleFactor;
            }            
        } else {
            System.out.println("Error: decPlaces arguement must be greater than zero");
        }

        return roundedFloats;
    }

    // does bulk of processing for FFT data (steps 2a, 2b, and 3)
    public void RoundsArray(){
        // iterates through RawFFT
        for (int i = 0; i < this.RawFFTdata[0].length; i++){
            this.RawFFTdata[1][i] = roundToFloats(this.RawFFTdata[1][i], 0.0);
        }
    }

    // for step 2aii
    public void setTAR(float[][][] arg){
        this.TAR = arg;
    }

    public float[][][] getTAR(){
        return this.TAR;
    }



}
