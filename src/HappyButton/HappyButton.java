package HappyButton;

// Import necessary library.
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

// Inherit the main class from Application.
public class HappyButton extends Application {

    @Override
    public void start(Stage stage) {

        // Create new button with an argument that sets a custom text.
        ToggleButton button = new ToggleButton("Click me \uD83D\uDE01!");

        // Create new label with an argument that sets a blank text.
        Label label = new Label("");

        // Set font size of the button.
        button.setFont(new Font(20));

        // Set font size of the label.
        label.setFont(new Font(20));

        // Add functionality to the ToggleButton using setOnAction() method.
        // Note: use Toggle-type button if it's right for you.
        /*
        Steps:
        1. choose the ToggleButton.
        2. use setOnAction method.
        3. set a random name for the event (examples: e, (e), (event)).
        Note: since you understand how toggle buttons work, you already know they have two conditions (selected and unselected).
        by the looks of both (selected and unselected), you'll know the difference.
        4. use If/Else-Statements to execute preferred actions when conditions are met.
        (example: if the button is in selected state, do this. otherwise, do that).
        5. end the lambda expression.
         */
        button.setOnAction( e -> { // lambda expression
            if (button.isSelected()) {
                button.setText("Nice!");
                label.setText("now, re-click it \uD83D\uDE09");
            }
            else {
                button.setText("Click me \uD83D\uDE01!");
                label.setText("");
            }
        });

        // Create new FlowPane with arguments that set horizontal and vertical gaps.
        FlowPane pane = new FlowPane(10, 10);

        // Add components to the FlowPane using getChildren() and addAll() methods.
        // Note: FlowPane acts as a container which contains buttons, labels or any preferred object.
        pane.getChildren().addAll(button, label);

        // Centralize the position of the FlowPane using setAlignment() method.
        pane.setAlignment(Pos.CENTER);

        // Create new Scene with arguments that adds the FlowPane and sets the width and height.
        Scene scene = new Scene(pane,285, 75);

        // Set title of the stage using setTitle() method.
        stage.setTitle("Happy Button");

        // Set a scene of the stage using setScene() method and select the scene.
        stage.setScene(scene);

        // Show the stage using show() method.
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
