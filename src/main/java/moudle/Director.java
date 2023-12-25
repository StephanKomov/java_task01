package moudle;
import javafx.scene.paint.Color;
public class Director {
    private final BIndicator builder = new BIndicator();

    public Indicator construct(Color color, double centerX, String labelText) {
        builder.lineRectangle(600, 100, color);
        builder.line(5, centerX);
        builder.setLabelText(labelText);
        return builder.build();
    }

}
