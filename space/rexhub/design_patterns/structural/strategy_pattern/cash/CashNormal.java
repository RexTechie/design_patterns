package space.rexhub.design_patterns.structural.strategy_pattern.cash;

/**
 * Description: 正常收费子类
 *
 * @author Rex
 * @date 2025-01-09
 */
public class CashNormal extends CashSuper{
    /**
     * 正常收费
     *
     * @param money 原价
     * @return 折后价
     */
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
