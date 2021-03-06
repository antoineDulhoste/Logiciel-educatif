/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logiciel_edu;

import java.io.File;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.util.Duration;
import static logiciel_edu.PageAccueil.HOVERED_BUTTON_STYLE;
import static logiciel_edu.PageAccueil.HOVERED_HOME_STYLE;
import static logiciel_edu.PageAccueil.IDLE_BUTTON_STYLE;
import static logiciel_edu.PageAccueil.IDLE_HOME_STYLE;

/**
 *
 * @author lucas
 */
public class PageCours extends Fenetre {
    
    private Text aide;
    private final Materials mat= new Materials();
    private final GridPane grid = new GridPane();
    private Timeline t, timeline, timeline2;
    private ImageView imageViewA,imageViewV,imageViewV1,imageViewV2,imageViewV3
            ,imageViewS2,imageViewS3,imageViewS4;
    //ImageViews
    private ImageView imageViewS =mat.createImage("./image/smoke.png", 45, 45, 65.0, 685, 480);
    private final ImageView imageViewR =mat.createImage("./image/route.jpg", 1200, 675, 0, 0, 0);
    
    public PageCours(){
        //Grid
        grid.setVgap(20);
        grid.setHgap(20);
        grid.setPadding(new Insets(5, 5, 5, 5));
        
        imageViewS.setOpacity(1);
        
        root.getChildren().setAll(imageViewR);
        root.getChildren().addAll(imageViewS,grid);
        this.setScene(scene);
    }
    
    public void clearAndSetBackground(ImageView imageViewR){
        grid.getChildren().clear();
        root.getChildren().setAll(imageViewR);
    }
    
    public void changer(int sousPage){
        Button btnNext,btnHome;
        if(t != null)
            t.stop();
        if(timeline != null)
            timeline.stop();
        if(timeline2 != null)
            timeline2.stop();
        switch(sousPage){
            case 1 :
                imageViewS.setOpacity(0);
                imageViewA =mat.createImage("./image/red arrow.png", 100, 53, 320.0, 685, 440);
                imageViewV =mat.createImage("./image/voiture.png", 200, 200, 0, 500, 380);
                imageViewS =mat.createImage("./image/smoke.png", 45, 45, 65.0, 685, 480);
                aide = mat.createText("La voiture, pour avancer, produit de la fum??e, elle est identifiable\n"
                        + "ici car elle clignote. Cette fum??e est dangereuse pour notre sant??.",Color.GREEN);
                btnNext= createNextBtn("Prochaine page","./image/next.png",IDLE_BUTTON_STYLE,HOVERED_BUTTON_STYLE,2,this);
                btnHome= createNextBtn("Accueil","./image/home.png",IDLE_HOME_STYLE,HOVERED_HOME_STYLE,99,this);
                grid.add(btnNext, 43, 25,16,3);
                grid.add(btnHome, 2, 25,16,3);
                grid.add(aide,5,10, 50,2);
                timeline = new Timeline(new KeyFrame(
                                Duration.millis(500), 
                                event-> {
                                        if (imageViewS.getOpacity()==1) {
                                                imageViewS.setOpacity(0);	
                                        } else {
                                                imageViewS.setOpacity(1);
                                        }
                                }
                        ));
                timeline.setCycleCount(Animation.INDEFINITE);
                timeline.play();
                root.getChildren().add(imageViewV);
                root.getChildren().add(imageViewS);
                root.getChildren().add(imageViewA);
                break;
            case 2 :
                clearAndSetBackground(imageViewR);
                imageViewS.setOpacity(0);
                imageViewV =mat.createImage("./image/voiture.png", 200, 200, 0, 100, 380);
                imageViewV1 =mat.createImage("./image/scooter.png", 150, 150, 0, 400, 450);
                imageViewV2 =mat.createImage("./image/bike.png", 100, 100, 0, 700, 380);
                imageViewS =mat.createImage("./image/smoke.png", 45, 45, 65.0, 285, 480);
                aide = mat.createText("Voici plusieurs v??hicules. Tu trouveras la voiture,\n"
                        + "le scooter et le v??lo.",Color.GREEN);
                Text voiture = mat.createText("Voiture",Color.WHITESMOKE);
                Text scooter = mat.createText("Scooter",Color.WHITESMOKE);
                Text velo = mat.createText("V??lo",Color.WHITESMOKE);
                btnNext= createNextBtn("Prochaine page","./image/next.png",IDLE_BUTTON_STYLE,HOVERED_BUTTON_STYLE,3,this);
                btnHome= createNextBtn("Accueil","./image/home.png",IDLE_HOME_STYLE,HOVERED_HOME_STYLE,99,this);
                grid.add(btnNext, 43, 22,16,3);
                grid.add(btnHome, 2, 22,16,3);
                grid.add(aide,5,10, 50,2);
                grid.add(voiture,8,17, 6,1);
                grid.add(scooter,21,18, 6,1);
                grid.add(velo,36,16, 6,1);
                timeline = new Timeline(new KeyFrame(
                                Duration.millis(500), 
                                event-> {
                                        if (imageViewS.getOpacity()==1) {
                                                imageViewS.setOpacity(0);	
                                        } else {
                                                imageViewS.setOpacity(1);
                                        }
                                }
                        ));
                timeline.setCycleCount(Animation.INDEFINITE);
                timeline.play();
                root.getChildren().add(imageViewV);
                root.getChildren().add(imageViewV1);
                root.getChildren().add(imageViewV2);
                root.getChildren().add(imageViewS);
                root.getChildren().add(grid);
                break;
            case 3 :
                clearAndSetBackground(imageViewR);
                imageViewS.setOpacity(0);
                imageViewV =mat.createImage("./image/voiture.png", 200, 200, 0, 100, 380);
                imageViewV3 =mat.createImage("./image/voiture.png", 200, 200, 0, 500, 380);
                imageViewV1 =mat.createImage("./image/tree.png", 100, 100, 0, 500, 380);
                imageViewV2 =mat.createImage("./image/tree.png", 100, 100, 0, 800, 380);
                imageViewS =mat.createImage("./image/smokeco2.png", 45, 45, 0, 280, 465);
                imageViewS2 =mat.createImage("./image/smokeco2.png", 45, 45, 0, 680, 465);
                imageViewS3 =mat.createImage("./image/change.png", 70, 70, 0, 450, 380);
                imageViewS4 =mat.createImage("./image/change.png", 70, 70, 0, 750, 380);
                aide = mat.createText("Dans la nature, les arbres absorbent le CO2 qui est\n"
                        + "notamment produit par les voitures. Et en ??change\n"
                        + "les arbres produisent de l'oxyg??ne (??crit O??).",Color.GREEN);
                btnHome= createNextBtn("Accueil","./image/home.png",IDLE_HOME_STYLE,HOVERED_HOME_STYLE,99,this);
                grid.add(btnHome, 2, 25,16,3);
                grid.add(aide,5,10, 50,2);
                timeline = new Timeline(new KeyFrame(
                                Duration.millis(500), 
                                event-> {
                                        if (imageViewS.getOpacity()==1) {
                                                imageViewS.setOpacity(0);	
                                        } else {
                                                imageViewS.setOpacity(1);
                                        }
                                }
                        ));
                timeline.setCycleCount(Animation.INDEFINITE);
                timeline.play();
                timeline2 = new Timeline(new KeyFrame(
                                Duration.millis(500), 
                                event-> {
                                        if (imageViewS2.getOpacity()==1) {
                                                imageViewS2.setOpacity(0);	
                                        } else {
                                                imageViewS2.setOpacity(1);
                                        }
                                }
                        ));
                timeline2.setCycleCount(Animation.INDEFINITE);
                timeline2.play();
                root.getChildren().add(imageViewV);
                root.getChildren().add(imageViewV1);
                root.getChildren().add(imageViewV2);
                root.getChildren().add(imageViewV3);
                root.getChildren().add(imageViewS);
                root.getChildren().add(imageViewS2);
                root.getChildren().add(imageViewS3);
                root.getChildren().add(imageViewS4);
                root.getChildren().add(grid);
                break;
            case 99:
                pageCours.close();
                PageAccueil pageAccueil = new PageAccueil();
                break;
            default:
                aide = mat.createText("Page par d??fault",Color.GREEN);
                grid.add(aide, 15,50,50, 4);
                break;
        }
    }
    
    public Button createNextBtn(String name, String image, String btnStyle, String btnHoverStyle, int pageToCall,PageCours page){
        Button btn = new Button(name);
        Materials mat = new Materials();
        btn.setPrefWidth(300);
        btn.setStyle(btnStyle);
        btn.setOnMouseEntered(e -> btn.setStyle(btnHoverStyle));
        btn.setOnMouseExited(e -> btn.setStyle(btnStyle));
        btn.setOnMousePressed(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event){
                // do what you have to do
                page.changer(pageToCall);
            }
        });
        String imageURIRoue = new File(image).toURI().toString();
        ImageView imageView = new ImageView(imageURIRoue);
        imageView.setFitWidth(45); 
        imageView.setFitHeight(45);
        imageView.setLayoutX(685);
        imageView.setLayoutY(480);
        btn.setGraphic(imageView);
        
        return btn;
    }
}
