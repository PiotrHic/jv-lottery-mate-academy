package core.basesyntax;

public class Ball {

    Colors color;
    int number;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ball with the number: ").append(number).append(" and color: ").append(color);
        return sb.toString();
    }
}
