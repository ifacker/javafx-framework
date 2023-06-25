package GUI;

import GUI.Menu.Proxy;
import javafx.scene.control.*;

public class GuiFx {

    // 菜单栏
    public MenuBar showMenuBar(){
        MenuBar menuBar = new MenuBar();
        Menu menu = new Menu("设置");
        MenuItem menuItem = new MenuItem("代理");
        // 代理选项点击事件
        menuItem.setOnAction(event -> {
            Proxy proxyPage = new Proxy();
            proxyPage.proxySetPage();
        });
        menu.getItems().add(menuItem);
        menuBar.getMenus().add(menu);
        return menuBar;
    }

    // 选项卡
    public TabPane showTablePen() {
        // 创建选项卡面板
        TabPane tabPane = new TabPane();

        // 创建第一个选项卡
        Tab tab1 = new Tab("选项卡1");
        tab1.setContent(new Label("这是第一个选项卡的内容"));
        tab1.setClosable(false);
        tabPane.getTabs().add(tab1); // 将选项卡添加到选项卡面板上

        // 创建第二个选项卡
        Tab tab2 = new Tab("选项卡2");
        tab2.setContent(new Label("这是第二个选项卡的内容"));
        tab2.setClosable(false);
        tabPane.getTabs().add(tab2); // 将选项卡添加到选项卡面板上

        return tabPane;
    }
}