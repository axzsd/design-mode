package com.wl.structure.composite;

import com.wl.structure.composite.framework.concrete.Button;
import com.wl.structure.composite.framework.concrete.Panel;
import com.wl.structure.composite.framework.concrete.Text;
import com.wl.structure.composite.framework.concrete.Window;

public class Main {
    public static void main(String [] args) {
        Button button1, button2, button3;
        Text text1, text2, text3;
        Panel panel1, panel2;
        Window window = new Window("主窗口");

        text1 = new Text("登录用户");
        button1 = new Button("提交");
        button2 = new Button("清空");
        button3 = new Button("注册");

        panel1 = new Panel("登录面板");
        panel1.add(text1);
        panel1.add(button1);
        panel1.add(button2);

        panel2 = new Panel("注册面板");
        text2 = new Text("输入注册邮箱");
        panel2.add(text2);
        panel2.add(button3);

        text3 = new Text("wl test c");

        window.add(text3);
        window.add(panel1);
        window.add(panel2);
        window.show();
        window.action();
    }
}
