package src.main;

import java.util.Scanner;

public class Receiver implements ReceiverInterface {
    Scanner scanner = new Scanner(System.in);

    @Override
    public String receiveOperation() {
        return scanner.nextLine();
    }

    @Override
    public String[] splitOperation(String operation) {
        return new String[0];
    }
}
