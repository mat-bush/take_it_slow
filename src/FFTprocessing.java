// What this is:
//  This is the class that processes the data coming from the out come of FFT



// plans for this aspect of the project:
//  How the process works:
//  1) data sent in the form of Array of Floats [t,[array of frequencies], [array of amplitudes]
//                                               [t + ∆ ] , [array of frequencies], [array of amplitudes]]
//  2) iterate through the array from step 1 and:
//      a) round frequencies in array
//         i) create method to round to desired accuracy: accomplished
//  3) create new array w/ time, Amplitude, and radian values
//  4) write to txt doc(s)
//  5) grep for each unique time and pull lines w/ each rad value and amplitude at a given and sum
// 




public class FFTprocessing {
// object that holds array from step one
    private float[][][][] FFTdata;


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


}
