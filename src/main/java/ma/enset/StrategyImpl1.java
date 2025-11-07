package ma.enset;

import java.util.List;

public class StrategyImpl1 implements Strategy {
    @Override
    public void PrintList(List<String> list) {
        System.out.println("************ StrategyImpl1 **************");
        list.forEach(e -> {
            System.out.println("**" + e + "**");
        });
        System.out.println("************ End StrategyImpl1 **************");

    }
}
