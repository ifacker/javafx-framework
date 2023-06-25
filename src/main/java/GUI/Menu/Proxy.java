package GUI.Menu;

import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Proxy {
    // 代理设置页面
    public void proxySetPage(){
        Stage proxyStage = new Stage();
        VBox proxyRoot = new VBox();
        proxyRoot.setSpacing(10);
        proxyRoot.setAlignment(Pos.CENTER);

        // 创建单选按钮，选择是否启用
        RadioButton radioButtonOn = new RadioButton("启用");
        RadioButton radioButtonOff = new RadioButton("禁用");
        // 默认禁用
        radioButtonOff.setSelected(true);

        // 将单选按钮添加进组中
        ToggleGroup toggleGroup = new ToggleGroup();
        radioButtonOn.setToggleGroup(toggleGroup);
        radioButtonOff.setToggleGroup(toggleGroup);

        // 创建一个专属于单选按钮的子容器,并将单选按钮添加进子容器中
        HBox hBoxRadio = new HBox();
        hBoxRadio.setSpacing(10);
        hBoxRadio.setAlignment(Pos.CENTER);
        hBoxRadio.getChildren().addAll(radioButtonOn, radioButtonOff);

        // 将子容器添加进根容器中
        proxyRoot.getChildren().add(hBoxRadio);


        // 设置 类型、IP、端口、用户名、密码
        GridPane gridPane = new GridPane();
        // 设置内边距
        gridPane.setPadding(new Insets(10));
        // 设置水平间距
        gridPane.setHgap(10);
        // 设置垂直间距
        gridPane.setVgap(10);
        gridPane.setAlignment(Pos.CENTER);

        // 类型
        Label labelType = new Label("类型：");
        //下拉菜单选择类型
        ComboBox<String> comboBoxType = new ComboBox<>();
        comboBoxType.setItems(FXCollections.observableArrayList(
                "http", "socks5"
        ));
        // 设置默认值为 http
        comboBoxType.setValue("http");

        // IP地址
        Label labelIP = new Label("IP地址：");
        // 设置文本框来输入内容
        TextField textFieldIP = new TextField();

        // 端口
        Label labelPort = new Label("端口：");
        TextField textFieldPort = new TextField();

        // 用户名
        Label labelUsername = new Label("用户名：");
        TextField textFieldUsername = new TextField();

        // 密码
        Label labelPassword = new Label("密码：");
        TextField textFieldPassword = new TextField();

        gridPane.add(labelType, 0, 0);
        gridPane.add(comboBoxType, 1, 0);
        gridPane.add(labelIP, 0, 1);
        gridPane.add(textFieldIP, 1, 1);
        gridPane.add(labelPort, 0, 2);
        gridPane.add(textFieldPort, 1, 2);
        gridPane.add(labelUsername, 0, 3);
        gridPane.add(textFieldUsername, 1, 3);
        gridPane.add(labelPassword, 0, 4);
        gridPane.add(textFieldPassword, 1, 4);

        // 将子容器添加进根容器
        proxyRoot.getChildren().add(gridPane);


        // 保存与取消
        HBox hBoxBotton = new HBox();
        hBoxBotton.setAlignment(Pos.CENTER);
        hBoxBotton.setSpacing(10);

        // 创建保存按钮和取消按钮
        Button buttonSave = new Button("保存");
        Button buttonCancel = new Button("取消");

        hBoxBotton.getChildren().addAll(buttonSave, buttonCancel);

        // 将子容器添加进根容器
        proxyRoot.getChildren().add(hBoxBotton);

        Scene proxyScene = new Scene(proxyRoot, 250, 300);
        proxyStage.setScene(proxyScene);
        proxyStage.setTitle("代理");
        proxyStage.show();
    }
}
