package moudle;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
class BIndicator implements Builder {
    Indicator indicator = new Indicator();
    private String labelText = "";
    @Override
    public void lineRectangle(int width, int height, Color color) {
        Rectangle rect = new Rectangle();
        Pane pane = new Pane();
        rect.setWidth(width);
        rect.setHeight(height);
        rect.setFill(color);
        rect.setStroke(Color.BLACK);
        pane.getChildren().add(rect);
        indicator.add(pane);
    }

    @Override
    public void line(int width, double centerX) {
        Rectangle line = new Rectangle();
        Pane pane = new Pane();
        line.setWidth(width);
        line.setHeight(100);
        line.setX((centerX - width / 2)-375);
        line.setFill(Color.BLACK);
        pane.getChildren().add(line);
        indicator.add(pane);
    }
    // @Override
    // public void setLabelText(String text) {
    //  labelText = text;
    //}
    @Override
    public void setLabelText(String text){
        Pane pane = new Pane();
        Text labelTextNode = new Text(labelText);
        labelTextNode.setFill(Color.BLACK);
        labelTextNode.setStyle("-fx-font-size: 15;");
        labelTextNode.setX((600 - labelTextNode.getBoundsInLocal().getWidth()) / 2);
        labelTextNode.setY(120);
        pane.getChildren().add(labelTextNode);
        indicator.add(pane);
    }

    @Override
    public Indicator build() {
        return indicator;
    }

}