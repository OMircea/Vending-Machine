package vending.machine;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;


public class ProductsPController {
    Products apple= new Products("Apple",75,"-Full of Vitamin D","-","-",45);
    Products kiwi= new Products("Kiwi",35,"-","-","-",39);
    Products pear= new Products("Pear",10,"-Full of Vitamin C","-","-",17);
    Products avocado= new Products("Avocado",50,"-","-","-",18);
    Products banana= new Products("Banana",25,"-","-","-",13);
    Products Strawberry= new Products("Strawberry",20,"-","-","-",23);

    @FXML private Text name;
    @FXML private Text price;
    @FXML private Text desc;
    @FXML private Text stock;
    @FXML private ImageView photo;
    public Products sold;

    public void button1(ActionEvent event) {
        sold=apple;
        Image image = new Image("photo/apple.jpg");
        photo.setImage(image);
        name.setText("Name: " + apple.getName());
        price.setText("Price: " + apple.getPrice() + "$");
        desc.setText("Description:\n" + apple.getD1() + "\n" + apple.getD2() + "\n" + apple.getD3());
        stock.setText("In stock: " + apple.getStock() + " items");

    }

    public void button2(ActionEvent event) {
        sold=pear;
        Image image = new Image("photo/pear.jpg");
        photo.setImage(image);
        name.setText("Name: " +pear.getName());
        price.setText("Price: " + pear.getPrice() + "$");
        desc.setText("Description:\n" + pear.getD1() + "\n" + pear.getD2() + "\n" + pear.getD3());
        stock.setText("In stock: " + pear.getStock() + " items");

    }

    public void button3(ActionEvent event) {
        sold=banana;
        Image image = new Image("photo/banana.png");
        photo.setImage(image);
        name.setText("Name: " + banana.getName());
        price.setText("Price: " + banana.getPrice() + "$");
        desc.setText("Description:\n" + banana.getD1() + "\n" + banana.getD2() + "\n" + banana.getD3());
        stock.setText("In stock: " + banana.getStock() + " items");

    }

    public void button4(ActionEvent event) {
        sold=Strawberry;
        Image image = new Image("photo/strawberry.jpg");
        photo.setImage(image);
        name.setText("Name: " + Strawberry.getName());
        price.setText("Price: " + Strawberry.getPrice() + "$");
        desc.setText("Description:\n" + Strawberry.getD1() + "\n" + Strawberry.getD2() + "\n" + Strawberry.getD3());
        stock.setText("In stock: " + Strawberry.getStock() + " items");

    }

    public void button5(ActionEvent event) {
        sold=kiwi;
        Image image = new Image("photo/kiwi.jpg");
        photo.setImage(image);
        name.setText("Name: " + kiwi.getName());
        price.setText("Price: " + kiwi.getPrice() + "$");
        desc.setText("Description:\n" + kiwi.getD1() + "\n" + kiwi.getD2() + "\n" + kiwi.getD3());
        stock.setText("In stock: " + kiwi.getStock() + " items");

    }

    public void button6(ActionEvent event) {
        sold=avocado;
        Image image = new Image("photo/avocado.jpg");
        photo.setImage(image);
        name.setText("Name: " + avocado.getName());
        price.setText("Price: " + avocado.getPrice() + "$");
        desc.setText("Description:\n" + avocado.getD1() + "\n" + avocado.getD2() + "\n" + avocado.getD3());
        stock.setText("In stock: " + avocado.getStock() + " items");

    }

    public void backBtn(javafx.event.ActionEvent event) throws IOException {

        Parent view = FXMLLoader.load(getClass().getResource("startP.fxml"));
        Scene scene = new Scene(view);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void nextBtn(javafx.event.ActionEvent event) throws IOException {

        Products prod= new Products();
        prod.values(sold.getName(),sold.getPrice(),sold.getStock());


        Parent view = FXMLLoader.load(getClass().getResource("paymentP.fxml"));
        Scene scene = new Scene(view);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();


    }

    public void changeScreenToAdminLogin(javafx.event.ActionEvent event) throws IOException {

        Parent view = FXMLLoader.load(getClass().getResource("adminLog.fxml"));
        Scene scene = new Scene(view);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

}
