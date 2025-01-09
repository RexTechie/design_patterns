package space.rexhub.design_patterns.structural.strategy_pattern.cash;

/**
 * Description: 返利收费子类
 *
 * @author Rex
 * @date 2025-01-09
 */
public class CashReturn extends CashSuper{

    private double moneyCondition = 0.0d;

    private double moneyReturn = 0.0d;

    public CashReturn(String moneyCondition, String moneyReturn) {
        this.moneyCondition = Double.parseDouble(moneyCondition);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }
    /**
     * 返利收费
     *
     * @param money 原价
     * @return 折后价
     */
    @Override
    public double acceptCash(double money) {
        double result = money;
        if (money >= moneyCondition) {
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        }
        return result;
    }
}

