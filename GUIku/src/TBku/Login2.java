package TBku;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Login2 extends JFrame implements ActionListener {

    public JLabel usnama, password;
    public JTextField tusnama;
    public JPasswordField ppas;
    public JButton login, exit;
    
    
    
    public Login2() {
        usnama = new JLabel("User Name");
        usnama.setLocation(20, 30);
        usnama.setSize(usnama.getPreferredSize());
        tusnama = new JTextField(20);
        tusnama.setLocation(150, 30);
        tusnama.setSize(tusnama.getPreferredSize());

        password = new JLabel("Password");
        password.setLocation(20, 60);
        password.setSize(password.getPreferredSize());
        ppas = new JPasswordField(20);
        ppas.setEchoChar('*');
        ppas.setLocation(150, 60);
        ppas.setSize(ppas.getPreferredSize());
        login = new JButton("Login");
        login.setLocation(250, 90);
        login.addActionListener(this);
        login.setSize(login.getPreferredSize());
        exit = new JButton("Exit");
        exit.setLocation(320, 90);
        exit.addActionListener(this);
        exit.setSize(exit.getPreferredSize());

    }

    public void show() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame f = new JFrame("Silahkan Login");
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.getContentPane().add(usnama);
        f.getContentPane().add(tusnama);
        f.getContentPane().add(password);
        f.getContentPane().add(ppas);
        f.getContentPane().add(login);
        f.getContentPane().add(exit);

        f.setBounds(0, 0, 410, 200);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Login2 tampil = new Login2();
                tampil.show();
            }
        });
    }

    private String user ="", passs  ="";

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exit) {
            JOptionPane.showMessageDialog(null, "Yakin Mau Keluar?");
            JOptionPane.showMessageDialog(null, "Beneran Yakin?");
            JOptionPane.showMessageDialog(null, "Serius Ta Mau Keluar Beneran?");
            JOptionPane.showMessageDialog(null, "Ya sudah Sampai Jumpa Lagi");
            System.exit(ABORT);
        }
        if (e.getSource() == login) {
            user = tusnama.getText();
            passs = ppas.getText();
            if(user.equals("Bayu")&& passs.equals("12345678")){
                JOptionPane.showMessageDialog(null, "Sukses");
                //Login2 masuk = new Login2();
                //masuk.show();
                GUItbfix a = new GUItbfix();
            }else {
                JOptionPane.showMessageDialog(null, "Username and password Tidak Valid");
                usnama.setText("");
                ppas.setText("");
                usnama.requestFocus(true);
            }
        }
    }
}
