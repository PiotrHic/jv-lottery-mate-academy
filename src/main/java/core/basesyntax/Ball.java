package core.basesyntax;

public class Ball {

    private Colors color;
    private int number;

    public Ball() {
    }

    public Ball(Colors color, int number) {
        this.color = color;
        this.number = number;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ball with the number: ").append(number).append(" and color: ").append(color);
        return sb.toString();
    }

}
