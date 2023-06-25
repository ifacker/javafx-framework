import GUI.GuiFx;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // 创建主容器
        BorderPane root = new BorderPane();

        // 创建gui对象
        GuiFx guiFx = new GuiFx();

        // 添加菜单栏到主面板最上方
        root.setTop(guiFx.showMenuBar());

        // 将选项卡面板添加到主容器的中心位置
        root.setCenter(guiFx.showTablePen());

        // 创建场景并将主容器添加到场景中
        Scene scene = new Scene(root, 400, 300);

        // 设置舞台的标题和场景，并显示舞台
        primaryStage.setTitle("javafx framework");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}