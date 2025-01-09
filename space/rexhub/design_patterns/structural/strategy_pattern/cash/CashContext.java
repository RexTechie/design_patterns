package space.rexhub.design_patterns.structural.strategy_pattern.cash;

/**
 * Description: TODO
 *
 * @author Rex
 * @date 2025-01-09
 */
public class CashContext {

    private CashSuper cs;

    public CashContext(String type) {
        switch (type){
            case "正常收费":
                this.cs = new CashNormal();
                break;
            case "满300返100":
                this.cs = new CashReturn("300", "100");
                break;
            case "打8折":
                this.cs = new CashRebate("0.8");
                break;
            default:
                break;
        }
    }

    public double getResult(double money) {
        return cs.acceptCash(money);
    }
}
