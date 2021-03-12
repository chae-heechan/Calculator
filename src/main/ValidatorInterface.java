package src.main;

public interface ValidatorInterface {
    boolean validate(String operation);

    boolean checkDigitOrOperator(String operation);

    boolean startWithOperator(String operation);

    boolean endWithOperator(String operation);

    boolean divideByZero(String operation);

    boolean moduloByZero(String operation);

    boolean inARow(String operation);

    boolean digitWithOperator(String operation);
}
