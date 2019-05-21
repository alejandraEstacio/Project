package application;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;

public class controller {
	
	private Circle body;
	private Polygon pico;
	private CubicCurve barriga;
	private Arc barriga2;
	private Line cola;
	private Line cola1;
	private Line cola2;
	private Arc ala;
	@FXML
	private Pane pane;
	
	@FXML
	 public void initialize() {
		
		body = new Circle(50,50,20);
		body.setFill(Color.BLACK);
		
		pico = new Polygon();
		
		pico.getPoints().addAll(new Double[] {
				
				60.0,30.0,
				73.0,30.0,
				68.0,40.0		
		});
		
		pico.setFill(Color.YELLOW);
		
		barriga = new CubicCurve(68,40, 62, 50, 56, 60, 50, 70 );
		barriga.setFill(Color.GREEN);
		
		
		barriga2 = new Arc(53,53,15,15,45,-180);
		barriga2.setFill(Color.WHITE);
		
		
		pane.getChildren().add(body);
		pane.getChildren().add(pico);
		pane.getChildren().add(barriga2);
		pane.getChildren().add(barriga);
	 }
}
