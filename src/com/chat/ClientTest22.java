package com.chat;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientTest22  extends JFrame implements Runnable, ActionListener {

    JTextField tf = new JTextField();
    JTextArea  ta = new JTextArea();
    private static final long serialVrsionUID = 11112L;
    static String ip;
    Socket s;
    DataOutputStream w;
    DataInputStream r;
    int len;

    public ClientTest22(){
        super("Client Chatter");
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        tf.setBorder(new TitledBorder("메세지를 입력하세요!"));
        //tf.setSize();
        tf.addActionListener(this);

        c.add(tf, BorderLayout.SOUTH);
        c.add(new JScrollPane(ta), BorderLayout.CENTER);

        setLocation(200, 200);
        setSize(400,250);
        setVisible(true);

        try {
            s = new Socket(ip,8888);
            ta.append("The Server connented\n");

            w = new DataOutputStream(s.getOutputStream());
            r = new DataInputStream(s.getInputStream());

            Thread t = new Thread(this);
            t.start();
        } catch (Exception e) {e.printStackTrace(); }
    }

    @Override
    public void run() {
        while (true) {
            try {
                String tmp = r.readUTF();
                ta.append("msg: " + tmp + "\n");
                len = ta.getText().length();
                ta.setCaretPosition(len);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            w.writeUTF(tf.getText());
            ta.append("I: "+tf.getText()+"\n");
            w.flush();
        }catch (Exception ex){ex.printStackTrace(); }
        tf.setText("");
    }

    public static void main(String[] args) {
        if(args.length==0) ip="127.0.0.1"; else ip=args[0];
        ClientTest22 fm = new ClientTest22();
        fm.addWindowListener(
                new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                }
        );
    }

}