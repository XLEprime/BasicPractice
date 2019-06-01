package com.example.basicpractice;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AgeCalculator extends JFrame implements ActionListener {
    JTextField text1, text2;
    public static String str = "";

    public static void main(String[] args) {
        new AgeCalculator();
    }

    public AgeCalculator() {
        JFrame mywindow = new JFrame();
        mywindow.setTitle("年龄计算1.0版");
        mywindow.setSize(400, 70);
        mywindow.setLocation(350, 300);
        mywindow.setResizable(false);
        mywindow.setLayout(new FlowLayout());
        JLabel lab = new JLabel("生日 ：");
        mywindow.add(lab);
        text1 = new JTextField("", 10);
        text2 = new JTextField("", 10);
        mywindow.add(text1);
        JButton btn = new JButton("计算");
        mywindow.add(btn);
        btn.addActionListener(this);
        mywindow.add(text2);
        text2.setEditable(false);
        mywindow.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        boolean f = true;
        str = text1.getText();
        StringTokenizer st = new StringTokenizer(str, " ");
        int myYear, myMonth, myDay;
        try {
            myYear = Integer.parseInt(st.nextToken());
            myMonth = Integer.parseInt(st.nextToken());
            myDay = Integer.parseInt(st.nextToken());
            if (myMonth > 12 || myMonth < 1) {
                f = false;
                text2.setText("日期错误");
            }
            if (myDay > 31 || myDay < 1) {
                f = false;
                text2.setText("日期错误");
            }
            if (myYear < 0) {
                f = false;
                text2.setText("日期错误");
            }
            if (f) {
                getAge(myYear, myMonth, myDay);
            }

        } catch (Exception e1) {
            text2.setText("日期格式错误");
        }

    }

    // 年龄计算函数
    public void getAge(int year, int month, int day) {
        boolean b = true;
        Calendar cal = Calendar.getInstance();
        int yearNow = cal.get(Calendar.YEAR);
        int monthNow = cal.get(Calendar.MONTH) + 1;
        int dayNow = cal.get(Calendar.DAY_OF_MONTH);
        int years, months = 0, days = 0;
        if (dayNow < day) {
            dayNow = dayNow + 30;
            monthNow = monthNow - 1;
        }
        if (monthNow < month) {
            monthNow = monthNow + 12;
            yearNow = yearNow - 1;
        }
        if (yearNow < year) {
            b = false;
            text2.setText("你还没有出生哟");
        }
        if (b) {
            years = yearNow - year;
            months = monthNow - month;
            days = dayNow - day;
            String result = years + "岁零" + months + "个月" + days + "天";
            text2.setText(result);
        }
    }

}