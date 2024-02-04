package calculadora;

/**
 *
 * @author Xandy
 */

public class Calculadora extends javax.swing.JFrame {


    public Calculadora() {
        initComponents();
    }
    
    private double numero1;
    private double numero2;
    private int operacao;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Visor = new javax.swing.JTextField();
        jUm = new javax.swing.JButton();
        jTres = new javax.swing.JButton();
        jQuatro = new javax.swing.JButton();
        jCinco = new javax.swing.JButton();
        jDois = new javax.swing.JButton();
        jMenos = new javax.swing.JButton();
        jSete = new javax.swing.JButton();
        jSeis = new javax.swing.JButton();
        jOito = new javax.swing.JButton();
        jNove = new javax.swing.JButton();
        jMais = new javax.swing.JButton();
        jIgual = new javax.swing.JButton();
        jZero = new javax.swing.JButton();
        jVirgula = new javax.swing.JButton();
        jVezes = new javax.swing.JButton();
        jDividendo = new javax.swing.JButton();
        jLimparVisor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Visor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jUm.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jUm.setText("1");
        jUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUmActionPerformed(evt);
            }
        });

        jTres.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTres.setText("3");
        jTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTresActionPerformed(evt);
            }
        });

        jQuatro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jQuatro.setText("4");
        jQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jQuatroActionPerformed(evt);
            }
        });

        jCinco.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jCinco.setText("5");
        jCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCincoActionPerformed(evt);
            }
        });

        jDois.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jDois.setText("2");
        jDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDoisActionPerformed(evt);
            }
        });

        jMenos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenos.setText("-");
        jMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenosActionPerformed(evt);
            }
        });

        jSete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jSete.setText("7");
        jSete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSeteActionPerformed(evt);
            }
        });

        jSeis.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jSeis.setText("6");
        jSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSeisActionPerformed(evt);
            }
        });

        jOito.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jOito.setText("8");
        jOito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOitoActionPerformed(evt);
            }
        });

        jNove.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jNove.setText("9");
        jNove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNoveActionPerformed(evt);
            }
        });

        jMais.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMais.setText("+");
        jMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMaisActionPerformed(evt);
            }
        });

        jIgual.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jIgual.setText("=");
        jIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIgualActionPerformed(evt);
            }
        });

        jZero.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jZero.setText("0");
        jZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jZeroActionPerformed(evt);
            }
        });

        jVirgula.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jVirgula.setText(",");
        jVirgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVirgulaActionPerformed(evt);
            }
        });

        jVezes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jVezes.setText("*");
        jVezes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVezesActionPerformed(evt);
            }
        });

        jDividendo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jDividendo.setText("/");
        jDividendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDividendoActionPerformed(evt);
            }
        });

        jLimparVisor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLimparVisor.setText("CE");
        jLimparVisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLimparVisorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jVezes, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jZero, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jOito, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jNove, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDividendo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jMais, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jUm, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jDois, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(9, 9, 9)
                                    .addComponent(jTres, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jMenos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(Visor, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLimparVisor, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLimparVisor, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(Visor))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jUm, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTres, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDois, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMais, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSete, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jOito, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNove, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDividendo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jZero, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jVezes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUmActionPerformed
          Visor.setText(Visor.getText()+"1");
    }//GEN-LAST:event_jUmActionPerformed

    private void jZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jZeroActionPerformed
        Visor.setText(Visor.getText()+"0");
    }//GEN-LAST:event_jZeroActionPerformed

    private void jDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDoisActionPerformed
        Visor.setText(Visor.getText()+"2");
    }//GEN-LAST:event_jDoisActionPerformed

    private void jTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTresActionPerformed
        Visor.setText(Visor.getText()+"3");
    }//GEN-LAST:event_jTresActionPerformed

    private void jQuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jQuatroActionPerformed
        Visor.setText(Visor.getText()+"4");
    }//GEN-LAST:event_jQuatroActionPerformed

    private void jCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCincoActionPerformed
        Visor.setText(Visor.getText()+"5");
    }//GEN-LAST:event_jCincoActionPerformed

    private void jSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSeisActionPerformed
        Visor.setText(Visor.getText()+"6");
    }//GEN-LAST:event_jSeisActionPerformed

    private void jSeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSeteActionPerformed
        Visor.setText(Visor.getText()+"7");
    }//GEN-LAST:event_jSeteActionPerformed

    private void jOitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOitoActionPerformed
        Visor.setText(Visor.getText()+"8");
    }//GEN-LAST:event_jOitoActionPerformed

    private void jNoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNoveActionPerformed
        Visor.setText(Visor.getText()+"9");
    }//GEN-LAST:event_jNoveActionPerformed

    private void jLimparVisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimparVisorActionPerformed
        Visor.setText("");
    }//GEN-LAST:event_jLimparVisorActionPerformed

    private void jMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenosActionPerformed
       numero1 =  Double.parseDouble(Visor.getText());
       Visor.setText("");
       operacao = 2;
    }//GEN-LAST:event_jMenosActionPerformed

    private void jMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMaisActionPerformed
       numero1 =  Double.parseDouble(Visor.getText());
       Visor.setText("");
       operacao = 1;
    }//GEN-LAST:event_jMaisActionPerformed

    private void jIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIgualActionPerformed
       numero2 =  Double.parseDouble(Visor.getText());
       Visor.setText("");
       
       double resultado;
       
       if(operacao == 1){
           resultado = numero1 + numero2;
           Visor.setText(Visor.getText()+resultado);
       }
       else if(operacao == 2){
           resultado = numero1 - numero2;
           Visor.setText(Visor.getText()+resultado);
       }
       else if (operacao == 3){
           resultado = numero1 / numero2;
           Visor.setText(Visor.getText()+resultado);
       }
       else{
           resultado = numero1 * numero2;
           Visor.setText(Visor.getText()+resultado);
       }
    }//GEN-LAST:event_jIgualActionPerformed

    private void jDividendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDividendoActionPerformed
       numero1 =  Double.parseDouble(Visor.getText());
       Visor.setText("");
       operacao = 3;
    }//GEN-LAST:event_jDividendoActionPerformed

    private void jVezesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVezesActionPerformed
       numero1 =  Double.parseDouble(Visor.getText());
       Visor.setText("");
       operacao = 4;
    }//GEN-LAST:event_jVezesActionPerformed

    private void jVirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVirgulaActionPerformed
        Visor.setText(Visor.getText()+".");
    }//GEN-LAST:event_jVirgulaActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Visor;
    private javax.swing.JButton jCinco;
    private javax.swing.JButton jDividendo;
    private javax.swing.JButton jDois;
    private javax.swing.JButton jIgual;
    private javax.swing.JButton jLimparVisor;
    private javax.swing.JButton jMais;
    private javax.swing.JButton jMenos;
    private javax.swing.JButton jNove;
    private javax.swing.JButton jOito;
    private javax.swing.JButton jQuatro;
    private javax.swing.JButton jSeis;
    private javax.swing.JButton jSete;
    private javax.swing.JButton jTres;
    private javax.swing.JButton jUm;
    private javax.swing.JButton jVezes;
    private javax.swing.JButton jVirgula;
    private javax.swing.JButton jZero;
    // End of variables declaration//GEN-END:variables
}
