package com.weightmonitor.weightmonitor;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class RoomController {

    @FXML
    private ProgressBar progressBar1,progressBar2,progressBar3,progressBar4,progressBar5,progressBar6;

    @FXML
    private Label progressLabel1, progressLabel2, progressLabel3, progressLabel4, progressLabel5, progressLabel6;

    @FXML
    private Circle statusCircle1, statusCircle2, statusCircle3, statusCircle4, statusCircle5, statusCircle6;


    @FXML
    private void handleIncreaseProgress1() {
        // Get the current progress
        double currentProgress = progressBar1.getProgress();

        // Increase the progress by a fixed amount, for example, 0.1 (10%)
        double newProgress = currentProgress + 0.1;

        // Ensure progress doesn't go beyond 100%
        if (newProgress > 1.0) {
            newProgress = 1.0;
        }

        // Update progress bar
        progressBar1.setProgress(newProgress);

        // Update the label with the current percentage
        int progressPercent = (int) (newProgress * 100);
        progressLabel1.setText(progressPercent + "%");

        if (newProgress >= 0.9) {
            statusCircle1.setFill(Color.web("#FB0305"));// red
        } else if (newProgress >= 0.7) {
            statusCircle1.setFill(Color.web("#F5C506"));// yellow
        } else {
            statusCircle1.setFill(Color.web("#00ff2e")); // original green
        }

        // Check if progress has reached or exceeded 70%
        if (newProgress >= 0.7) {
            // Show a warning alert
            Alert alert = new Alert(Alert.AlertType.WARNING, "Warning: Tank is about to overflow.", ButtonType.OK);
            alert.setTitle("Warning");
            alert.showAndWait();
        }

        if (newProgress == 1.0) {
            // Show a warning alert
            Alert alert = new Alert(Alert.AlertType.WARNING, "Warning: Tank is Already full.", ButtonType.OK);
            alert.setTitle("Warning");
            alert.showAndWait();
        }
    }

    // Reset progress bar to 0
    @FXML
    private void resetProgressBar1() {
        progressBar1.setProgress(0.0);
        progressLabel1.setText("0%");
        statusCircle1.setFill(Color.web("#00ff2e")); // reset to green

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Clear");
        alert.setHeaderText("Room 1 cleared");
        alert.showAndWait();
    }

    @FXML
    private void handleAlert1(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Alert");
        alert.setHeaderText("Room 1 alert sent to workers.");
        alert.showAndWait();
    }




    @FXML
    private void handleIncreaseProgress2() {
        // Get the current progress
        double currentProgress = progressBar2.getProgress();

        // Increase the progress by a fixed amount, for example, 0.1 (10%)
        double newProgress = currentProgress + 0.1;

        // Ensure progress doesn't go beyond 100%
        if (newProgress > 1.0) {
            newProgress = 1.0;
        }

        // Update progress bar
        progressBar2.setProgress(newProgress);

        if (newProgress >= 0.9) {
            statusCircle2.setFill(Color.web("#FB0305"));// red
        } else if (newProgress >= 0.7) {
            statusCircle2.setFill(Color.web("#F5C506"));// yellow
        } else {
            statusCircle2.setFill(Color.web("#00ff2e")); // original green
        }

        // Update the label with the current percentage
        int progressPercent = (int) (newProgress * 100);
        progressLabel2.setText(progressPercent + "%");

        // Check if progress has reached or exceeded 70%
        if (newProgress >= 0.7 ) {
            // Show a warning alert
            Alert alert = new Alert(Alert.AlertType.WARNING, "Warning: Tank is about to overflow.", ButtonType.OK);
            alert.setTitle("Warning");
            alert.showAndWait();
        }

        if (newProgress == 1.0) {
            // Show a warning alert
            Alert alert = new Alert(Alert.AlertType.WARNING, "Warning: Tank is Already full.", ButtonType.OK);
            alert.setTitle("Warning");
            alert.showAndWait();
        }

    }
    @FXML
    // Reset progress bar to 0
    private void resetProgressBar2() {

        progressBar2.setProgress(0.0);
        progressLabel2.setText("0%");
        statusCircle2.setFill(Color.web("#00ff2e")); // reset to green

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Clear");
        alert.setHeaderText("Room 2 cleared");
        alert.showAndWait();
    }

    @FXML
    private void handleAlert2(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Alert");
        alert.setHeaderText("Room 2 alert sent to workers.");
        alert.showAndWait();
    }




    @FXML
    private void handleIncreaseProgress3() {
        // Get the current progress
        double currentProgress = progressBar3.getProgress();

        // Increase the progress by a fixed amount, for example, 0.1 (10%)
        double newProgress = currentProgress + 0.1;

        // Ensure progress doesn't go beyond 100%
        if (newProgress > 1.0) {
            newProgress = 1.0;
        }

        // Update progress bar
        progressBar3.setProgress(newProgress);

        if (newProgress >= 0.9) {
            statusCircle3.setFill(Color.web("#FB0305"));// red
        } else if (newProgress >= 0.7) {
            statusCircle3.setFill(Color.web("#F5C506"));// yellow
        } else {
            statusCircle3.setFill(Color.web("#00ff2e")); // original green
        }

        // Update the label with the current percentage
        int progressPercent = (int) (newProgress * 100);
        progressLabel3.setText(progressPercent + "%");

        // Check if progress has reached or exceeded 70%
        if (newProgress >= 0.7) {
            // Show a warning alert
            Alert alert = new Alert(Alert.AlertType.WARNING, "Warning: Tank is about to overflow.", ButtonType.OK);
            alert.setTitle("Warning");
            alert.showAndWait();
        }

        if (newProgress == 1.0) {
            // Show a warning alert
            Alert alert = new Alert(Alert.AlertType.WARNING, "Warning: Tank is Already full.", ButtonType.OK);
            alert.setTitle("Warning");
            alert.showAndWait();
        }

    }
    @FXML
    // Reset progress bar to 0
    private void resetProgressBar3() {
        progressBar3.setProgress(0.0);
        progressLabel3.setText("0%");
        statusCircle3.setFill(Color.web("#00ff2e")); // reset to green

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Clear");
        alert.setHeaderText("Room 3 cleared");
        alert.showAndWait();

    }
    @FXML
    private void handleAlert3(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Alert");
        alert.setHeaderText("Room 3 alert sent to workers.");
        alert.showAndWait();
     }




    @FXML
    private void handleIncreaseProgress4() {
        // Get the current progress
        double currentProgress = progressBar4.getProgress();

        // Increase the progress by a fixed amount, for example, 0.1 (10%)
        double newProgress = currentProgress + 0.1;

        // Ensure progress doesn't go beyond 100%
        if (newProgress > 1.0) {
            newProgress = 1.0;
        }

        // Update progress bar
        progressBar4.setProgress(newProgress);

        if (newProgress >= 0.9) {
            statusCircle4.setFill(Color.web("#FB0305"));// red
        } else if (newProgress >= 0.7) {
            statusCircle4.setFill(Color.web("#F5C506"));// yellow
        } else {
            statusCircle4.setFill(Color.web("#00ff2e")); // original green
        }

        // Update the label with the current percentage
        int progressPercent = (int) (newProgress * 100);
        progressLabel4.setText(progressPercent + "%");

        // Check if progress has reached or exceeded 70%
        if (newProgress >= 0.7 ) {
            // Show a warning alert
            Alert alert = new Alert(Alert.AlertType.WARNING, "Warning: Tank is about to overflow.", ButtonType.OK);
            alert.setTitle("Warning");
            alert.showAndWait();
        }
        if (newProgress == 1.0) {
            // Show a warning alert
            Alert alert = new Alert(Alert.AlertType.WARNING, "Warning: Tank is Already full.", ButtonType.OK);
            alert.setTitle("Warning");
            alert.showAndWait();
        }

    }
    @FXML
    // Reset progress bar to 0
    private void resetProgressBar4() {
        progressBar4.setProgress(0.0);
        progressLabel4.setText("0%");
        statusCircle4.setFill(Color.web("#00ff2e")); // reset to green

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Clear");
        alert.setHeaderText("Room 4 cleared");
        alert.showAndWait();
    }
    @FXML
    private void handleAlert4(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Alert");
        alert.setHeaderText("Room 4 alert sent to workers.");
        alert.showAndWait();
    }




    @FXML
    private void handleIncreaseProgress5() {
        // Get the current progress
        double currentProgress = progressBar5.getProgress();

        // Increase the progress by a fixed amount, for example, 0.1 (10%)
        double newProgress = currentProgress + 0.1;

        // Ensure progress doesn't go beyond 100%
        if (newProgress > 1.0) {
            newProgress = 1.0;
        }

        // Update progress bar
        progressBar5.setProgress(newProgress);

        if (newProgress >= 0.9) {
            statusCircle5.setFill(Color.web("#FB0305"));// red
        } else if (newProgress >= 0.7) {
            statusCircle5.setFill(Color.web("#F5C506"));// yellow
        } else {
            statusCircle5.setFill(Color.web("#00ff2e")); // original green
        }

        // Update the label with the current percentage
        int progressPercent = (int) (newProgress * 100);
        progressLabel5.setText(progressPercent + "%");

        // Check if progress has reached or exceeded 70%
        if (newProgress >= 0.7) {
            // Show a warning alert
            Alert alert = new Alert(Alert.AlertType.WARNING, "Warning: Tank is about to overflow.", ButtonType.OK);
            alert.setTitle("Warning");
            alert.showAndWait();
        }

        if (newProgress == 1.0) {
            // Show a warning alert
            Alert alert = new Alert(Alert.AlertType.WARNING, "Warning: Tank is Already full.", ButtonType.OK);
            alert.setTitle("Warning");
            alert.showAndWait();
        }

    }
    @FXML
    // Reset progress bar to 0
    private void resetProgressBar5() {
        progressBar5.setProgress(0.0);
        progressLabel5.setText("0%");
        statusCircle5.setFill(Color.web("#00ff2e")); // reset to green

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Clear");
        alert.setHeaderText("Room 5 cleared");
        alert.showAndWait();
    }
    @FXML
    private void handleAlert5(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Alert");
        alert.setHeaderText("Room 5 alert sent to workers.");
        alert.showAndWait();
    }




    @FXML
    private void handleIncreaseProgress6() {
        // Get the current progress
        double currentProgress = progressBar6.getProgress();

        // Increase the progress by a fixed amount, for example, 0.1 (10%)
        double newProgress = currentProgress + 0.1;

        // Ensure progress doesn't go beyond 100%
        if (newProgress > 1.0) {
            newProgress = 1.0;
        }

        // Update progress bar
        progressBar6.setProgress(newProgress);

        if (newProgress >= 0.9) {
            statusCircle6.setFill(Color.web("#FB0305"));// red
        } else if (newProgress >= 0.7) {
            statusCircle6.setFill(Color.web("#F5C506"));// yellow
        } else {
            statusCircle6.setFill(Color.web("#00ff2e")); // original green
        }

        // Update the label with the current percentage
        int progressPercent = (int) (newProgress * 100);
        progressLabel6.setText(progressPercent + "%");

        // Check if progress has reached or exceeded 70%
        if (newProgress >= 0.7 ) {
            // Show a warning alert
            Alert alert = new Alert(Alert.AlertType.WARNING, "Warning: Tank is about to overflow.", ButtonType.OK);
            alert.setTitle("Warning");
            alert.showAndWait();
        }

        if (newProgress == 1.0) {
            // Show a warning alert
            Alert alert = new Alert(Alert.AlertType.WARNING, "Warning: Tank is Already full.", ButtonType.OK);
            alert.setTitle("Warning");
            alert.showAndWait();
        }

    }
    @FXML
    // Reset progress bar to 0
    private void resetProgressBar6() {
        progressBar6.setProgress(0.0);
        progressLabel6.setText("0%");
        statusCircle6.setFill(Color.web("#00ff2e")); // reset to green

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Clear");
        alert.setHeaderText("Room 6 cleared");
        alert.showAndWait();
    }
    @FXML
    private void handleAlert6(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Alert");
        alert.setHeaderText("Room 6 alert sent to workers.");
        alert.showAndWait();
    }






    @FXML
    private void clickedHelp() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Help");
        alert.setHeaderText("How to use this application?");
        alert.setContentText("This is a simple JavaFX application to monitor room weights.\n\n"
                + "1. Click 'Add' to increase progress.\n"
                + "2. Click 'Clear' to reset progress.\n"
                + "3. If progress reaches 80%, a warning will appear.\n"
                + "4. Click 'Exit' to close the application.");
        alert.showAndWait();
    }

    @FXML
    private void clickedResetAll(){

        progressBar6.setProgress(0.0);
        progressLabel6.setText("0%");
        statusCircle6.setFill(Color.web("#00ff2e")); // reset to green

        progressBar5.setProgress(0.0);
        progressLabel5.setText("0%");
        statusCircle5.setFill(Color.web("#00ff2e")); // reset to green

        progressBar4.setProgress(0.0);
        progressLabel4.setText("0%");
        statusCircle4.setFill(Color.web("#00ff2e")); // reset to green

        progressBar3.setProgress(0.0);
        progressLabel3.setText("0%");
        statusCircle3.setFill(Color.web("#00ff2e")); // reset to green

        progressBar2.setProgress(0.0);
        progressLabel2.setText("0%");
        statusCircle2.setFill(Color.web("#00ff2e")); // reset to green

        progressBar1.setProgress(0.0);
        progressLabel1.setText("0%");
        statusCircle1.setFill(Color.web("#00ff2e")); // reset to green




    }

    @FXML
    private void clickedExit() {
        ButtonType yes = new ButtonType("Yes");
        ButtonType no = new ButtonType("No");

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to exit?", yes, no);
        alert.setTitle("Exit Confirmation");

        alert.showAndWait().ifPresent(response -> {
            if (response == yes) {
                Platform.exit();
            }
        });
    }
}
