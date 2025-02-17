class Solution {
    public int largestAltitude(int[] gain) {
        // prefix sum 
        int currentAltitude  = 0;
        int highestPoint = currentAltitude;

        for(int altitudeGain:gain){
                 currentAltitude += altitudeGain;
      // Update the highest altitude.
      highestPoint = Math.max(highestPoint, currentAltitude);
    }

    return highestPoint;
    }
}