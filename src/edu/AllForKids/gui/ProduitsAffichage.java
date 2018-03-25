/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.AllForKids.gui;

import edu.AllForKids.entities.Produits;
import java.awt.Color;
import java.awt.Rectangle;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.RowConstraints;

/**
 *
 * @author Narjes
 */
public class ProduitsAffichage extends ListCell<Produits>{
      private final GridPane gridPane = new GridPane(); 
    //private final ImageView brandIcon = new ImageView(); 
    //private final Label  = new Label(); 
     private final Rectangle colorRect = new Rectangle(10, 10);
    private final Label NomProduit = new Label(); 
    private final Label Prix = new Label(); 
    private final ImageView carIcon = new ImageView(); 
    private final AnchorPane content = new AnchorPane(); 
  
    public ProduitsAffichage() { 
        carIcon.setFitWidth(75); 
        carIcon.setPreserveRatio(true); 
        GridPane.setConstraints(carIcon, 0, 0, 1, 3); 
        GridPane.setValignment(carIcon, VPos.TOP); 
        // 
        NomProduit.setStyle("-fx-font-weight: bold; -fx-font-size: 1.5em;"); 
        GridPane.setConstraints(NomProduit, 1, 0); 
        // 
       // brandLabel.setStyle("-fx-font-size: 0.9em; -fx-font-style: italic; -fx-opacity: 0.5;"); 
       // GridPane.setConstraints(brandLabel, 2, 0); 
        // 
        //brandIcon.setFitWidth(22); 
       // brandIcon.setPreserveRatio(true); 
       // GridPane.setConstraints(brandIcon, 3, 0); 
       // GridPane.setValignment(brandIcon, VPos.CENTER); 
        // 
        
        
         Prix.setStyle("-fx-opacity: 0.75;"); 
         
       GridPane.setConstraints(Prix, 1, 1); 
        GridPane.setColumnSpan(Prix, Integer.MAX_VALUE); 
        //         
        gridPane.getColumnConstraints().add(new ColumnConstraints(Region.USE_COMPUTED_SIZE, Region.USE_COMPUTED_SIZE, Region.USE_COMPUTED_SIZE, Priority.NEVER, HPos.LEFT, true)); 
        gridPane.getColumnConstraints().add(new ColumnConstraints(Region.USE_COMPUTED_SIZE, Region.USE_COMPUTED_SIZE, Region.USE_COMPUTED_SIZE, Priority.ALWAYS, HPos.LEFT, true)); 
        gridPane.getColumnConstraints().add(new ColumnConstraints(Region.USE_COMPUTED_SIZE, Region.USE_COMPUTED_SIZE, Region.USE_COMPUTED_SIZE, Priority.NEVER, HPos.LEFT, true)); 
        gridPane.getColumnConstraints().add(new ColumnConstraints(Region.USE_COMPUTED_SIZE, Region.USE_COMPUTED_SIZE, Region.USE_COMPUTED_SIZE, Priority.NEVER, HPos.LEFT, true)); 
        gridPane.getRowConstraints().add(new RowConstraints(Region.USE_COMPUTED_SIZE, Region.USE_COMPUTED_SIZE, Region.USE_COMPUTED_SIZE, Priority.NEVER, VPos.CENTER, true)); 
        gridPane.getRowConstraints().add(new RowConstraints(Region.USE_COMPUTED_SIZE, Region.USE_COMPUTED_SIZE, Region.USE_COMPUTED_SIZE, Priority.NEVER, VPos.CENTER, true)); 
        gridPane.getRowConstraints().add(new RowConstraints(Region.USE_COMPUTED_SIZE, Region.USE_COMPUTED_SIZE, Region.USE_COMPUTED_SIZE, Priority.ALWAYS, VPos.CENTER, true)); 
        gridPane.setHgap(6); 
        gridPane.setVgap(6); 
        gridPane.getChildren().setAll(carIcon, NomProduit, Prix); 
        AnchorPane.setTopAnchor(gridPane, 0d); 
        AnchorPane.setLeftAnchor(gridPane, 0d); 
        AnchorPane.setBottomAnchor(gridPane, 0d); 
        AnchorPane.setRightAnchor(gridPane, 0d); 
        content.getChildren().add(gridPane); 
    } 
  
  
    @Override 
    protected void updateItem(Produits item, boolean empty) { 
        super.updateItem(item, empty); 
        setGraphic(null); 
        setText(null); 
        setContentDisplay(ContentDisplay.LEFT); 
        if (!empty && item != null) { 
            NomProduit.setText(item.getNom()); 
            String prix=""+item.getPrix()+"DT";
            Prix.setText(prix); 
            //brandIcon.setImage(item.getBrandImage()); 
           Image i=new Image(item.getImage());
            carIcon.setImage(i); 
            //descriptionLabel.setText(String.format(", %d places, %d portes", item.getSeats(), item.getDoors())); 
            //colorRect.setFill(item.getColor()); 
            setText(null); 
            setGraphic(content); 
            setContentDisplay(ContentDisplay.GRAPHIC_ONLY); 
        } 
    } 
    
}