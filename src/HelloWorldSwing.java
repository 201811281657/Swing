import javax.swing.*;

/**
 * @author yw
 * @date 2019/5/9 16:22
 */
public class HelloWorldSwing {
    private static void createShowGui(){
        //创建一个漂亮的外观风格
        JFrame.setDefaultLookAndFeelDecorated(true);
        //创建设置窗口
        JFrame jFrame = new JFrame("HelloworldSwing");
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        //添加hello world标签
        JLabel lable = new JLabel("hello world");
        jFrame.getContentPane().add(lable);
        //显示窗口
        jFrame.pack();
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        //显示应用GUI
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createShowGui();
            }
        });
    }
}
