/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
/**
 *
 * @author gabriel.girardi
 */
public class Calc {
    double num;
  
  double ans;
  
  int calculate;
  
  private JButton jButton1;
  
  private JButton jButton10;
  
  private JButton jButton11;
  
  private JButton jButton12;
  
  private JButton jButton13;
  
  private JButton jButton14;
  
  private JButton jButton15;
  
  private JButton jButton16;
  
  private JButton jButton17;
  
  private JButton jButton18;
  
  private JButton jButton2;
  
  private JButton jButton3;
  
  private JButton jButton4;
  
  private JButton jButton5;
  
  private JButton jButton6;
  
  private JButton jButton7;
  
  private JButton jButton8;
  
  private JButton jButton9;
  
  private JLabel jLabel1;
  
  private JMenu jMenu1;
  
  private JMenuBar jMenuBar1;
  
  private JMenuItem jMenuItem1;
  
  private JTextField jTextField1;
  
  public Calc() {
    initComponents();
  }
  
  public void OpArit() {
    switch (this.calculate) {
      case 1:
        this.ans = this.num + Double.parseDouble(this.jTextField1.getText());
        this.jTextField1.setText(Double.toString(this.ans));
        break;
      case 2:
        this.ans = this.num - Double.parseDouble(this.jTextField1.getText());
        this.jTextField1.setText(Double.toString(this.ans));
        break;
      case 3:
        this.ans = this.num * Double.parseDouble(this.jTextField1.getText());
        this.jTextField1.setText(Double.toString(this.ans));
        break;
      case 4:
        this.ans = this.num / Double.parseDouble(this.jTextField1.getText());
        this.jTextField1.setText(Double.toString(this.ans));
        break;
    } 
  }
  
  private void initComponents() {
    this.jButton1 = new JButton();
    this.jButton2 = new JButton();
    this.jButton3 = new JButton();
    this.jButton4 = new JButton();
    this.jButton5 = new JButton();
    this.jButton6 = new JButton();
    this.jButton7 = new JButton();
    this.jButton8 = new JButton();
    this.jButton9 = new JButton();
    this.jButton10 = new JButton();
    this.jButton11 = new JButton();
    this.jButton12 = new JButton();
    this.jButton13 = new JButton();
    this.jButton15 = new JButton();
    this.jButton16 = new JButton();
    this.jButton17 = new JButton();
    this.jButton14 = new JButton();
    this.jTextField1 = new JTextField();
    this.jButton18 = new JButton();
    this.jLabel1 = new JLabel();
    this.jMenuBar1 = new JMenuBar();
    this.jMenu1 = new JMenu();
    this.jMenuItem1 = new JMenuItem();
    setDefaultCloseOperation(3);
    setTitle("Calculadora");
    setBackground(new Color(240, 240, 120));
    setLocation(new Point(250, 250));
    setPreferredSize(new Dimension(300, 450));
    this.jButton1.setFont(new Font(", 0, 18));
    this.jButton1.setText("7");
    this.jButton1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            Calc.this.jButton1ActionPerformed(evt);
          }
        });
    this.jButton2.setFont(new Font(", 0, 18));
    this.jButton2.setText("8");
    this.jButton2.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            Calc.this.jButton2ActionPerformed(evt);
          }
        });
    this.jButton3.setFont(new Font(", 0, 18));
    this.jButton3.setText("9");
    this.jButton3.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            Calc.this.jButton3ActionPerformed(evt);
          }
        });
    this.jButton4.setFont(new Font(", 0, 18));
    this.jButton4.setText("4");
    this.jButton4.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            Calc.this.jButton4ActionPerformed(evt);
          }
        });
    this.jButton5.setFont(new Font(", 0, 18));
    this.jButton5.setText("5");
    this.jButton5.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            Calc.this.jButton5ActionPerformed(evt);
          }
        });
    this.jButton6.setFont(new Font(", 0, 18));
    this.jButton6.setText("6");
    this.jButton6.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            Calc.this.jButton6ActionPerformed(evt);
          }
        });
    this.jButton7.setFont(new Font(", 0, 18));
    this.jButton7.setText("1");
    this.jButton7.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            Calc.this.jButton7ActionPerformed(evt);
          }
        });
    this.jButton8.setFont(new Font(", 0, 18));
    this.jButton8.setText("2");
    this.jButton8.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            Calc.this.jButton8ActionPerformed(evt);
          }
        });
    this.jButton9.setFont(new Font(", 0, 18));
    this.jButton9.setText("3");
    this.jButton9.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            Calc.this.jButton9ActionPerformed(evt);
          }
        });
    this.jButton10.setFont(new Font(", 0, 18));
    this.jButton10.setText("+");
    this.jButton10.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            Calc.this.jButton10ActionPerformed(evt);
          }
        });
    this.jButton11.setFont(new Font(", 0, 18));
    this.jButton11.setText("-");
    this.jButton11.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            Calc.this.jButton11ActionPerformed(evt);
          }
        });
    this.jButton12.setFont(new Font(", 0, 18));
    this.jButton12.setText("*");
    this.jButton12.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            Calc.this.jButton12ActionPerformed(evt);
          }
        });
    this.jButton13.setFont(new Font(", 0, 18));
    this.jButton13.setText(".");
    this.jButton13.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            Calc.this.jButton13ActionPerformed(evt);
          }
        });
    this.jButton15.setFont(new Font(", 0, 18));
    this.jButton15.setText("0");
    this.jButton15.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            Calc.this.jButton15ActionPerformed(evt);
          }
        });
    this.jButton16.setFont(new Font(", 0, 18));
    this.jButton16.setText("/");
    this.jButton16.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            Calc.this.jButton16ActionPerformed(evt);
          }
        });
    this.jButton17.setFont(new Font(", 0, 18));
    this.jButton17.setText("=");
    this.jButton17.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            Calc.this.jButton17ActionPerformed(evt);
          }
        });
    this.jButton14.setFont(new Font(", 0, 18));
    this.jButton14.setText("C");
    this.jButton14.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            Calc.this.jButton14ActionPerformed(evt);
          }
        });
    this.jTextField1.setFont(new Font(", 0, 18));
    this.jTextField1.setHorizontalAlignment(4);
    this.jTextField1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            Calc.this.jTextField1ActionPerformed(evt);
          }
        });
    this.jButton18.setFont(new Font(", 0, 18));
    this.jButton18.setText("<");
    this.jButton18.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            Calc.this.jButton18ActionPerformed(evt);
          }
        });
    this.jLabel1.setFont(new Font(", 0, 14));
    this.jLabel1.setHorizontalAlignment(4);
    this.jMenu1.setText("Function");
    this.jMenuItem1.setText("Sair");
    this.jMenuItem1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            Calc.this.jMenuItem1ActionPerformed(evt);
          }
        });
    this.jMenu1.add(this.jMenuItem1);
    this.jMenuBar1.add(this.jMenu1);
    setJMenuBar(this.jMenuBar1);
    GroupLayout layout = new GroupLayout((Container) getContentPane());
    /*getContentPane().setLayout(layout*/
    layout.setHorizontalGroup(layout
        .createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
          .addGap(58, 58, 58)
          .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
            .addComponent(this.jLabel1, -2, 76, -2)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addComponent(this.jButton4, -2, 46, -2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(this.jButton5, -2, 46, -2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(this.jButton6, -2, 46, -2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(this.jButton12, -2, 46, -2))
              .addComponent(this.jTextField1, -2, 202, -2)
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                  .addComponent(this.jButton7, -2, 46, -2)
                  .addComponent(this.jButton15, -2, 46, -2))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                    .addComponent(this.jButton8, -2, 46, -2)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(this.jButton9, -2, 46, -2)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(this.jButton16, -2, 46, -2))
                  .addGroup(layout.createSequentialGroup()
                    .addComponent(this.jButton13, -2, 46, -2)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(this.jButton17, -2, 98, -2))))
              .addGroup(layout.createSequentialGroup()
                .addComponent(this.jButton1, -2, 46, -2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(this.jButton2, -2, 46, -2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(this.jButton3, -2, 46, -2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(this.jButton11, -2, 46, -2))
              .addGroup(layout.createSequentialGroup()
                .addComponent(this.jButton18, -2, 98, -2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(this.jButton14, -2, 46, -2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(this.jButton10, -2, 46, -2))))
          .addContainerGap(66, 32767)));
    layout.setVerticalGroup(layout
        .createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
          .addContainerGap()
          .addComponent(this.jLabel1, -2, 16, -2)
          .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
          .addComponent(this.jTextField1, -2, 51, -2)
          .addGap(38, 38, 38)
          .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
              .addComponent(this.jButton10, -2, 45, -2)
              .addComponent(this.jButton14, -2, 45, -2))
            .addGroup(layout.createSequentialGroup()
              .addComponent(this.jButton18, -2, 45, -2)
              .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
              .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(this.jButton1, -2, 45, -2)
                .addComponent(this.jButton2, -2, 45, -2)
                .addComponent(this.jButton3, -2, 45, -2)
                .addComponent(this.jButton11, -2, 45, -2))))
          .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
          .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(this.jButton12, -2, 45, -2)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
              .addComponent(this.jButton4, -2, 45, -2)
              .addComponent(this.jButton5, -2, 45, -2)
              .addComponent(this.jButton6, -2, 45, -2)))
          .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
          .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(this.jButton7, -2, 45, -2)
            .addComponent(this.jButton8, -2, 45, -2)
            .addComponent(this.jButton9, -2, 45, -2)
            .addComponent(this.jButton16, -2, 45, -2))
          .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
          .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(this.jButton15, -2, 45, -2)
            .addComponent(this.jButton13, -2, 45, -2)
            .addComponent(this.jButton17, -2, 45, -2))
          .addContainerGap(27, 32767)));
    pack();
  }
  
  private void jTextField1ActionPerformed(ActionEvent evt) {}
  
  private void jButton7ActionPerformed(ActionEvent evt) {
    this.jTextField1.setText(this.jTextField1.getText() + "1");
  }
  
  private void jButton8ActionPerformed(ActionEvent evt) {
    this.jTextField1.setText(this.jTextField1.getText() + "2");
  }
  
  private void jButton9ActionPerformed(ActionEvent evt) {
    this.jTextField1.setText(this.jTextField1.getText() + "3");
  }
  
  private void jButton15ActionPerformed(ActionEvent evt) {
    this.jTextField1.setText(this.jTextField1.getText() + "0");
  }
  
  private void jButton4ActionPerformed(ActionEvent evt) {
    this.jTextField1.setText(this.jTextField1.getText() + "4");
  }
  
  private void jButton5ActionPerformed(ActionEvent evt) {
    this.jTextField1.setText(this.jTextField1.getText() + "5");
  }
  
  private void jButton6ActionPerformed(ActionEvent evt) {
    this.jTextField1.setText(this.jTextField1.getText() + "6");
  }
  
  private void jButton1ActionPerformed(ActionEvent evt) {
    this.jTextField1.setText(this.jTextField1.getText() + "7");
  }
  
  private void jButton2ActionPerformed(ActionEvent evt) {
    this.jTextField1.setText(this.jTextField1.getText() + "8");
  }
  
  private void jButton3ActionPerformed(ActionEvent evt) {
    this.jTextField1.setText(this.jTextField1.getText() + "9");
  }
  
  private void jButton13ActionPerformed(ActionEvent evt) {
    this.jTextField1.setText(this.jTextField1.getText() + ".");
  }
  
  private void jButton10ActionPerformed(ActionEvent evt) {
    this.num = Double.parseDouble(this.jTextField1.getText());
    this.calculate = 1;
    this.jTextField1.setText("");
    this.jLabel1.setText("" + this.num + "+");
  }
  
  private void jButton11ActionPerformed(ActionEvent evt) {
    this.num = Double.parseDouble(this.jTextField1.getText());
    this.calculate = 2;
    this.jTextField1.setText("");
    this.jLabel1.setText("" + this.num + "-");
  }
  
  private void jButton12ActionPerformed(ActionEvent evt) {
    this.num = Double.parseDouble(this.jTextField1.getText());
    this.calculate = 3;
    this.jTextField1.setText("");
    this.jLabel1.setText("" + this.num + "*");
  }
  
  private void jButton16ActionPerformed(ActionEvent evt) {
    this.num = Double.parseDouble(this.jTextField1.getText());
    this.calculate = 4;
    this.jTextField1.setText("");
    this.jLabel1.setText("" + this.num + "/");
  }
  
  private void jButton14ActionPerformed(ActionEvent evt) {
    this.jTextField1.setText("");
  }
  
  private void jButton18ActionPerformed(ActionEvent evt) {
    int length = this.jTextField1.getText().length();
    int number = this.jTextField1.getText().length() - 1;
    if (length > 0) {
      StringBuilder back = new StringBuilder(this.jTextField1.getText());
      back.deleteCharAt(number);
      String store = back.toString();
      this.jTextField1.setText(store);
    } 
  }
  
  private void jButton17ActionPerformed(ActionEvent evt) {
    OpArit();
    this.jLabel1.setText("");
  }
  
  private void jMenuItem1ActionPerformed(ActionEvent evt) {
    System.exit(0);
  }
  
  public static void main(String[] args) {
    try {
      for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          UIManager.setLookAndFeel(info.getClassName());
          break;
        } 
      } 
    } catch (ClassNotFoundException ex) {
      Logger.getLogger(Calc.class.getName()).log(Level.SEVERE, (String)null, ex);
    } catch (InstantiationException ex) {
      Logger.getLogger(Calc.class.getName()).log(Level.SEVERE, (String)null, ex);
    } catch (IllegalAccessException ex) {
      Logger.getLogger(Calc.class.getName()).log(Level.SEVERE, (String)null, ex);
    } catch (UnsupportedLookAndFeelException ex) {
      Logger.getLogger(Calc.class.getName()).log(Level.SEVERE, (String)null, ex);
    } 
    EventQueue.invokeLater(new Runnable() {
          public void run() {
            (new Calc()).setVisible(true);
          }
        });
  }

    private void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void pack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object getContentPane() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setJMenuBar(JMenuBar jMenuBar1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setDefaultCloseOperation(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setTitle(String calculadora) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setBackground(Color color) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setLocation(Point point) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setPreferredSize(Dimension dimension) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}
