import java.awt.*;

public class MultipleBouceBall {

    public class MultipleBounceBall extends Application {
        @Override
        public void start(Stage primaryStage) {

            MultipleBallPane ballPane = new MultipleBallPane();
            ballPane.setStyle("-fx-border-color: yellow");

            Button btAdd = new Button("+");
            Button btSubtract = new Button("-");
            HBox hBox = new HBox(10);
            hBox.getChildren().addAll(btAdd, btSubtract);
            hBox.setAlignment(Pos.CENTER);

            btAdd.setOnAction(e -> ballPane.add());
            btSubtract.setOnAction(e -> ballPane.subtract());

            ballPane.setOnMousePressed(e -> ballPane.pause());
            ballPane.setOnMousReleased(e -> ballPane.play());

            ScrollBar sbSpeed = new Scrollbar();
            sbSpeed.setMax(20);
            sbSpeed.setValue(10);
            ballPane.rateProperty().bind(sbSpeed.valueProperty());

            BorderPane pane = new BorderPane();
            pane.setCenter(ballPane);
            pane.setTop(sbSpeed);
            pane.setBottom(hBox);

            Scene scene = new Scene(pane, 250, 150);
            primaryStage.setTitle("MultipleBounceBall");
            primaryStage.setScene(scene);
            primaryStage.show();
        }

        private class MultipleBallPane extends Pane {

            private Timeline animation;

            public MultipleBallPane() {

                animation = new Timeline(new Key)
            }
        }
    }
}
