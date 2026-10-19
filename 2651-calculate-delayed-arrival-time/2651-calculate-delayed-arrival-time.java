class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {

        int result=0;
        int totaltime=arrivalTime+delayedTime;
        result=totaltime%24;

        return result;
        
    }
}