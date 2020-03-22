package TreasureHandling;

public class Treasure {
    private int number;
    private int cost;

    public Treasure(int number, int cost) {
        this.number = number;
        this.cost = cost;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Treasure{" +
                "number=" + number +
                ", cost=" + cost +
                '}';
    }
}
