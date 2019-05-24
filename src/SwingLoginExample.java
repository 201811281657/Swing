import Student.Student;

import javax.swing.*;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author yw
 * @date 2019/5/9 16:38
 */
public class SwingLoginExample {//List ,Set ,Collection,Map这写都是接口,而HashMap<>这个是实现类

    public static void main(String[] args) {
        //创建Jframe实例
        JFrame jFrame = new JFrame("Login Example");
        //set the width and hight of frame
        jFrame.setSize(350,200);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /**
         * 创建面板，类似于html中的div，我们可以创建画板并在Jframe中指定的位置，面板中我们可以添加文字字段，按钮以及其他组件
         */
        JPanel panel = new JPanel();
        //添加画板
        jFrame.add(panel);
        //调用用户定义的方法并添加组件到面板
        placeComponents(panel);
        //设置界面可见
        jFrame.setVisible(true);

    }

    private static void placeComponents(JPanel panel) {
        //布局部分这里不多介绍，这里设置布局为null;
        panel.setLayout(null);
        //创建JLable
        JLabel userLable = new JLabel("User:");
        /**
         * 这个方法定义了组件位置
         * setBounds(x,y,width,hight)
         * x,y指定在左上角的新位置，有width，hight指定新的大小
         */
        //创建文本域用于用户输入
        JTextField userText = new JTextField(20);
        userLable.setBounds(100,20,165,25);
        panel.add(userText);
        //输入密码的文本域
        JLabel passwordLable = new JLabel("passworld:");
        passwordLable.setBounds(10,50,80,25);
        panel.add(passwordLable);
        /**
         * 这个类似于输入的文本域
         * 但是输入的信息以点号代替，用于包含密码的安全性
         */
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);
        //创建登录按钮
        JButton loginButton = new JButton("login");
        loginButton.setBounds(10,80,80,25);
        panel.add(loginButton);
    }
}
