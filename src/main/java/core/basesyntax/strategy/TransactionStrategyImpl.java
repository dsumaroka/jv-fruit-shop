package core.basesyntax.strategy;

public class TransactionStrategyImpl implements TransactionStrategy {
    @Override
    public int balanceUpdater(int balance, String quantity) {
        int result = balance + Integer.parseInt(quantity);
        if (result < 0) {
            throw new RuntimeException("Balance couldn't be less '0'.\n"
                    + " Invalid data received from input file: balance = " + quantity);
        }
        return result;
    }
}