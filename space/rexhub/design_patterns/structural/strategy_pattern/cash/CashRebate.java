package space.rexhub.design_patterns.structural.strategy_pattern.cash;

/**
 * Description: 打折收费子类
 *
 * @author Rex
 * @date 2025-01-09
 */
public class CashRebate extends CashSuper{

    private double moneyRebate = 1d;

    public CashRebate(String moneyRebate) {
        this.moneyRebate = Double.parseDouble(moneyRebate);
    }

    /**
     * 打折收费
     *
     * @param money 原价
     * @return 折后价
     */
    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}

