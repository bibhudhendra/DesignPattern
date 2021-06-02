package adapter;

import services.Calculate;

public class Adapter implements IAdapter{
    public Integer getArea(Integer x1, Integer y1, Integer x2, Integer y2) {
        Integer height = y2 - y1;
        Integer width = x2 - x1;

        Calculate calculate = new Calculate();
        return calculate.calculateRectangleArea(height, width);
    }
}
