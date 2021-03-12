package src.main;

public class Validator implements ValidatorInterface {
    @Override
    public boolean validate(String operation) {
        return checkDigitOrOperator(operation)
                && startWithOperator(operation)
                && endWithOperator(operation)
                && divideByZero(operation)
                && moduloByZero(operation)
                && inARow(operation)
                && digitWithOperator(operation);
    }

    @Override
    public boolean checkDigitOrOperator(String operation) {
        return false;
    }

    @Override
    public boolean startWithOperator(String operation) {
        return false;
    }

    @Override
    public boolean endWithOperator(String operation) {
        return false;
    }

    @Override
    public boolean divideByZero(String operation) {
        return false;
    }

    @Override
    public boolean moduloByZero(String operation) {
        return false;
    }

    @Override
    public boolean inARow(String operation) {
        return false;
    }

    @Override
    public boolean digitWithOperator(String operation) {
        return false;
    }
}
