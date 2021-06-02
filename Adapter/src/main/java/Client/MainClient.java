package Client;

import adapter.Adapter;
import adapter.IAdapter;

public class MainClient {
    public Integer calculateArea(Integer x1, Integer y1, Integer x2, Integer y2) {
        IAdapter adapter = new Adapter();
        return adapter.getArea(x1, y1, x2, y2);
    }
}
