package refactoring.replacemethodwithmethodobject;

import refactoring.extractmethod.Code;

public class CodeRefactored {

    // ...

    public double calculate() {
        return new Calculator(this).calculate();
    }

    private class Calculator {
        private double primaryBasePrice;
        private double secondaryBasePrice;
        private double temporaryBasePrice;

        private CodeRefactored codeRefactored;

        public Calculator(CodeRefactored codeRefactored) {
            this.codeRefactored = codeRefactored;
        }

        public double calculate() {
            // ...

            // perform long computation

            return 0.4f * 1;
        }
    }
}
