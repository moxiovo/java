package com.fengtaisec.d15_inner_class4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    // 扩展：搞清楚匿名内部类在开发中的真实使用场景
    // GUI编程
    // 创建窗口
    public static void main(String[] args) {
        JFrame win = new JFrame("登录界面");
        JPanel panel = new JPanel();
        win.add(panel);

        JButton btn = new JButton("登录");
        panel.add(btn);


        // 给按钮绑定单击事件监听器
//        给按钮绑定单击事件监听器btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(win, "登录一下");
//            }
//        });

        // 简化代码
        btn.addActionListener(e -> JOptionPane.showMessageDialog(win, "登录一下"));

        win.setSize(400, 400);
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        win.setVisible(true);
    }
}
