package ma.enset;

import java.util.List;

public class Context {
    Strategy strategy;

    public Context() {}

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void applyStrategy(List<String> list) {
        this.strategy.PrintList(list);
    }
}
