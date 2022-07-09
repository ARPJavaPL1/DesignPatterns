package refactoring.preservewholeobject;

public class Code {

    private DaysTempRange daysTempRange = new DaysTempRange();

    public void method() {
        int low = daysTempRange.getLow();
        int high = daysTempRange.getHigh();
        double avg = daysTempRange.getAvg();
        // ...

        boolean canBeCalculated = canBeCalculated(low, high, avg);
    }

    private boolean canBeCalculated(int low, int high, double avg) {
        return true;
    }

    private class DaysTempRange {

        private int low;
        private int high;
        private double avg;
        // ...

        public int getLow() {
            return low;
        }

        public int getHigh() {
            return high;
        }

        public double getAvg() {
            return avg;
        }
    }
}
