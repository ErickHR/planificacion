/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * BoothAlgorithmMain.java
 *
 * Created on 14 nov. 2012, 16:35:24
 */

package GUI;

import boothalgorithm.Booth;
import java.awt.Color;

/**
 *
 * @author imad
 */
public class BoothAlgorithmMain extends javax.swing.JFrame {

    /** Creates new form BoothAlgorithmMain */
    public BoothAlgorithmMain() {
        initComponents();
        this.setTitle("Algoritmo Booth");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Booth Algorithm");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(500, 200));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 200));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 200));

        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("A:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("B:");

        jButton1.setText("CALCULAR");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jButton1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jTextField2)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jTextField1)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel1)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel2))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(66, 66, 66)
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jLabel2)
                .add(4, 4, 4)
                .add(jTextField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(364, Short.MAX_VALUE))
        );

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Algoritmo de Booth");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel5)
                    .add(jLabel6))
                .add(328, 328, 328))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(39, 39, 39)
                        .add(jLabel6)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 23, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jLabel5)
                        .add(18, 18, 18)))
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 542, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 600, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // variables
        int q=0,i,j, a, b, temp;
        int[] A={0,0,0,0,0,0,0,0},C={0,0,0,0,0,0,0,1},C1={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
        int s=0,z=0;
        int[] Q=new int[8]; 
        int[] M=new int[8];
        int[] temp1=new int [8];
        int[] ans=new int[16];
        int y,x=0, c=0, v, w;
        
        jTextArea1.setForeground(Color.black);
        jTextArea1.setText("");
        
        if(jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty()) {
            jTextArea1.setForeground(Color.red);
            jTextArea1.append("\nError! Inserta el multiplicador y multiplicando!");
        }
        else {
        a = Integer.parseInt(this.jTextField1.getText());
        b = Integer.parseInt(this.jTextField2.getText());
        if(Booth.verify(a).compareTo("true") != 0 || Booth.verify(b).compareTo("true") != 0) {
            jTextArea1.setForeground(Color.red);
            if(Booth.verify(a).compareTo("true") != 0)
                jTextArea1.append(Booth.verify(a));
            else
                jTextArea1.append(Booth.verify(b));
        }
        else {

        Booth.binary(a,M);
        Booth.binary(b,Q);
       
        jTextArea1.append("\nEl binario de "+a+" es : ");
        for(i=0;i< 8;i++)
            jTextArea1.append(Integer.toString(M[i]));
        
        jTextArea1.append("\nEl binario de "+b+" es : ");
        for(i=0;i< 8;i++)
        jTextArea1.append(Integer.toString(Q[i]));
        
        //if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
        jTextArea1.append("\n\n---------------------------------------------------\n");
        
            
        //if( jComboBox1.getSelectedItem().toString().compareTo("Booth's algorithm") == 0) {  // Booth
        
        //if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
        //jTextArea1.append(" Operacion\t\t A\t Q\t Q'\t M");  // begining computation
        
        //if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
        jTextArea1.append("\n\n\t\t          A\t      Q\tQ+");
        jTextArea1.append("\nINICIO\t\t");
        for(i=0;i< 8;i++)
            //if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
            jTextArea1.append(Integer.toString(A[i]));
        
        //if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
        jTextArea1.append("\t");
        
        for(i=0;i< 8;i++)
            //if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
            jTextArea1.append(Integer.toString(Q[i])); 
        
        if(true) { // debug mode
        jTextArea1.append("\t");
        jTextArea1.append(q+"\t");
        }
        
        //for(i=0;i< 8;i++)
            //if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
            //jTextArea1.append(Integer.toString(M[i]));
        
        for(j=0;j< 8;j++) { // compute
            
            if((Q[7]==0)&&(q==1)) {
                //if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                jTextArea1.append("\n A=A+M \t\t");
                Booth.add(A,M);
                
                for(i=0;i< 8;i++)
                    //if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                    jTextArea1.append(Integer.toString(A[i]));
                
                //if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                jTextArea1.append("\t");
                
                for(i=0;i< 8;i++)
                    //if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                    jTextArea1.append(Integer.toString(Q[i]));

                //if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                jTextArea1.append("\t"+q+"\t");

                //for(i=0;i< 8;i++)
                    //if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                    //jTextArea1.append(Integer.toString(M[i]));
            }

            if((Q[7]==1)&&(q==0)) { // second condition
                //if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                jTextArea1.append("\n A=A-M \t\t");

                for(i=0;i< 8;i++)
                    temp1[i] = 1-M[i];

                Booth.add(temp1,C);
                Booth.add(A,temp1);

                for(i=0;i< 8;i++)
                    //if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                    jTextArea1.append(Integer.toString(A[i]));

                //if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                jTextArea1.append("\t");
                
                for(i=0;i< 8;i++)
                    //if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                    jTextArea1.append(Integer.toString(Q[i]));
                
                //if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                jTextArea1.append("\t"+q+"\t");
                
                //for(i=0;i< 8;i++)
                    //if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                    //jTextArea1.append(Integer.toString(M[i]));
            }

            //if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
            jTextArea1.append("\n --> \t\t");

            y = A[7];
            q = Q[7];

            Booth.rshift(A[0],A);
            Booth.rshift(y,Q);

            for(i=0;i< 8;i++)
                //if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                jTextArea1.append(Integer.toString(A[i]));

            //if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
            jTextArea1.append("\t");

            for(i=0;i< 8;i++)
                //if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                jTextArea1.append(Integer.toString(Q[i]));

           if(true) { // debug mode
           jTextArea1.append("\t");
           jTextArea1.append(q+"\t");
           }
           
           //for(i=0;i< 8;i++)
               //if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
               //jTextArea1.append(Integer.toString(M[i]));

        }
        
        
        
        
        jTextArea1.append("\n\n---------------------------------------------------\n");
        jTextArea1.append("\nRESULTADO EN BINARIO : ");
        
        for(i=0;i< 8;i++)
            ans[i]=A[i];
        
        for(i=0;i< 8;i++)
            ans[i+8]=Q[i];
        
        if(((a< 0)&&(b>0))||((a>0)&&(b< 0))) {
            
            for(i=0;i< 16;i++)
                ans[i]=1-ans[i];
            
            for(i=15;i>=0;i--) {
                x = ans[i];
                ans[i]=c^x^C1[i];
                
                if(((c==1)&&(x==1))||((x==1)&&(C1[i]==1))||((C1[i]==1)&&(c==1)))
                    c=1;
                
                else
                    c=0;
            }

        }
        
        for(i=0;i< 16;i++)
            jTextArea1.append(Integer.toString(ans[i]));
        
        for(i=15;i>=0;i--) { //  conversion to decimal
            s = s + ((int)Math.pow(2,z) * ans[i]);
            z = z+1;
        }

        if(((a< 0)&&(b>0))||((a>0)&&(b< 0)))
            jTextArea1.append("\nRESULTALO EN DECIMAL :- "+s+"\n");
        else
            jTextArea1.append("\nRESULTALO EN DECIMAL : "+s+"\n");
        
        }
        }
               
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BoothAlgorithmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}
