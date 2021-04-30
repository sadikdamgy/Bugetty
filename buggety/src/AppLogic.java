public class AppLogic {
    private boolean onBudget;
    private double moneyIn;
    private double moneyOut;
    private double gift;
    private double unforeseenExpense;
    private String message;

    public boolean isOnBudget() {
        return onBudget;
    }

    public void setOnBudget(boolean onBudget) {
        this.onBudget = onBudget;
    }

    public double getMoneyIn() {
        return moneyIn;
    }

    public void setMoneyIn(double moneyIn) {
        this.moneyIn = moneyIn;
    }

    public double getMoneyOut() {
        return moneyOut;
    }

    public void setMoneyOut(double moneyOut) {
        this.moneyOut = moneyOut;
    }

    public double getGift() {
        return gift;
    }

    public void setGift(double gift) {
        this.gift = gift;
    }

    public double getUnforeseenExpense() {
        return unforeseenExpense;
    }

    public void setUnforeseenExpense(double unforeseenExpense) {
        this.unforeseenExpense = unforeseenExpense;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
