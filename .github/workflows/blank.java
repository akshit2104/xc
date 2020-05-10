# This is a basic workflow to help you get started with Actions

name: CI

# Controls when the action will run. Triggers the workflow on push or pull request
# events but only for the master branch
on:
  push:
    branches: [ master ]
  pull_request:
    branches: [ master ]

# A workflow run is made up of one or more jobs that can run sequentially or in parallel
jobs:
  # This workflow contains a single job called "build"
  build:
    # The type of runner that the job will run on
    runs-on: ubuntu-latest

    # Steps represent a sequence of tasks that will be executed as part of the job
    steps:
    # Checks-out your repository under $GITHUB_WORKSPACE, so your job can access it
    - uses: actions/checkout@v2

    # Runs a single command using the runners shell
    - name: Run a one-line script
      run: echo Hello, world!

    # Runs a set of commands using the runners shell
    - name: Run a multi-line script
      run: |
        echo Add other actions to build,
        echo test, and deploy your project.
import javax.swing.*;
import java.awt.event.*;
import java.net.*;
public class ipFinder extends JFrame implements ActionListener {
    JLabel l;
    JTextField tf;
    JButton b;
    ipFinder(){
    super("Ip finder in this section");
    l=new JLabel("Enter Address/URL");
    l.setBounds(50,70,150,20);
    tf= new JTextField();
    tf.setBounds(50,100,200,20);
    b= new JButton("Find Your IP");
    b.setBounds(50,150,100,20);
    b.addActionListener(this);
    add(l);
    add(tf);
    add(b);
    setSize(400,400);
    setLayout(null);
    setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
    String url= tf.getText();
    try{
        InetAddress ia= InetAddress.getByName(url);
        String ip= ia.getHostAddress();
        JOptionPane.showMessageDialog(this, ip);
    }
    catch(UnknownHostException e1){
    JOptionPane.showMessageDialog(this, e1.toString());
    }
    }
public static void main(String a[]){
new ipFinder();
}
}
