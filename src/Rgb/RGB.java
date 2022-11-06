package Rgb;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.plaf.ColorUIResource;

public class RGB extends javax.swing.JFrame {

    int red = 0, green = 0, blue = 0;

    public RGB() {
        initComponents();
        this.setTitle("RGB PabloSoft");
        Image img = Toolkit.getDefaultToolkit().createImage(getClass().getResource("/img/logo.jpg"));
        this.setIconImage(img);
        lblogo.setIcon(new ImageIcon(img.getScaledInstance(lblogo.getWidth(), lblogo.getHeight(), Image.SCALE_SMOOTH)));
        this.setLocationRelativeTo(null);
        generarColor();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblogo = new javax.swing.JLabel();
        sldBlue = new javax.swing.JSlider();
        lblColor = new javax.swing.JLabel();
        Red = new javax.swing.JLabel();
        lblRed = new javax.swing.JLabel();
        Green = new javax.swing.JLabel();
        lblGreen = new javax.swing.JLabel();
        Blue = new javax.swing.JLabel();
        lblBlue = new javax.swing.JLabel();
        sldRed = new javax.swing.JSlider();
        sldGreen = new javax.swing.JSlider();
        lblRgb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.SystemColor.inactiveCaption);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Logo.jpg"))); // NOI18N
        jPanel1.add(lblogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 0, 197, 72));

        sldBlue.setMajorTickSpacing(1);
        sldBlue.setMaximum(255);
        sldBlue.setToolTipText("");
        sldBlue.setValue(0);
        sldBlue.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldBlueStateChanged(evt);
            }
        });
        jPanel1.add(sldBlue, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 372, -1));

        lblColor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 360, 160));

        Red.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        Red.setText("Red");
        jPanel1.add(Red, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        lblRed.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        lblRed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRed.setText("128");
        lblRed.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblRed.setMaximumSize(new java.awt.Dimension(10, 10));
        lblRed.setMinimumSize(new java.awt.Dimension(10, 10));
        lblRed.setName(""); // NOI18N
        lblRed.setPreferredSize(new java.awt.Dimension(10, 10));
        lblRed.setRequestFocusEnabled(false);
        jPanel1.add(lblRed, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 40, 20));

        Green.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        Green.setText("Green");
        jPanel1.add(Green, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        lblGreen.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        lblGreen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGreen.setText("128");
        lblGreen.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblGreen.setMaximumSize(new java.awt.Dimension(10, 10));
        lblGreen.setMinimumSize(new java.awt.Dimension(10, 10));
        lblGreen.setPreferredSize(new java.awt.Dimension(10, 10));
        jPanel1.add(lblGreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 40, 20));

        Blue.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        Blue.setText("Blue");
        jPanel1.add(Blue, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        lblBlue.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        lblBlue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBlue.setText("128");
        lblBlue.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblBlue, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 40, 20));

        sldRed.setMajorTickSpacing(1);
        sldRed.setMaximum(255);
        sldRed.setToolTipText("");
        sldRed.setValue(0);
        sldRed.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldRedStateChanged(evt);
            }
        });
        jPanel1.add(sldRed, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 372, -1));

        sldGreen.setMajorTickSpacing(1);
        sldGreen.setMaximum(255);
        sldGreen.setToolTipText("");
        sldGreen.setValue(0);
        sldGreen.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldGreenStateChanged(evt);
            }
        });
        jPanel1.add(sldGreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 372, -1));

        lblRgb.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        lblRgb.setText("RGB");
        lblRgb.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblRgb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 380, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sldRedStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldRedStateChanged
        // TODO add your handling code here:
        red = sldRed.getValue();
        lblRed.setText("" + red);
        generarColor();
    }//GEN-LAST:event_sldRedStateChanged

    private void sldGreenStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldGreenStateChanged
        // TODO add your handling code here:
        green = sldGreen.getValue();
        lblGreen.setText("" + green);
        generarColor();
    }//GEN-LAST:event_sldGreenStateChanged

    private void sldBlueStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldBlueStateChanged
        // TODO add your handling code here:
        blue = sldBlue.getValue();
        lblBlue.setText("" + blue);
        generarColor();
    }//GEN-LAST:event_sldBlueStateChanged

    public void generarColor(){
        Color color= new Color(red, green, blue);
        lblColor.setOpaque(true);
        lblColor.setBackground(color);
        lblRgb.setText("RGB ("+red+" ,"+green+" ,"+blue+")");
    }
    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RGB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Blue;
    private javax.swing.JLabel Green;
    private javax.swing.JLabel Red;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBlue;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblGreen;
    private javax.swing.JLabel lblRed;
    private javax.swing.JLabel lblRgb;
    private javax.swing.JLabel lblogo;
    private javax.swing.JSlider sldBlue;
    private javax.swing.JSlider sldGreen;
    private javax.swing.JSlider sldRed;
    // End of variables declaration//GEN-END:variables
}
