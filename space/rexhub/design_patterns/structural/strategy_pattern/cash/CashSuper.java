package space.rexhub.design_patterns.structural.strategy_pattern.cash;

/**
 * Description: 现金收费抽象类
 *
 * @author Rex
 * @date 2025-01-09
 */
public abstract class CashSuper{

    /**
     * 现金收取超类的抽象方法
     * @param money 原价
     * @return 折后价
     */
    public abstract double acceptCash(double money);
}
