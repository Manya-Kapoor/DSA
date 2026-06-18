class Solution {
    public double angleClock(int hour, int minutes) {
        double hr = 30 * (hour % 12) + 0.5 * minutes;
        double min = 6 * minutes;

        double diff = Math.abs(hr - min);

        return Math.min(diff, 360 - diff);
    }
}