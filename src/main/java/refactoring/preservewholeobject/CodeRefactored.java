package refactoring.preservewholeobject;

public class CodeRefactored {
    private DaysTempRange daysTempRange = new DaysTempRange();

    public void method() {
        // ...

        boolean canBeCalculated = canBeCalculated(daysTempRange);
    }

    private boolean canBeCalculated(DaysTempRange daysTempRange) {
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
