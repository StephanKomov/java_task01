package moudle;
import javafx.scene.paint.Color;
public interface Builder {
    void lineRectangle(int width, int height, Color color);
    void line(int width, double cen150terX);
    Indicator build();
    void setLabelText(String text);
}
