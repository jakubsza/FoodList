package usedPackage;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;  
import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jakub
 */
public class FirstFrame extends javax.swing.JFrame {

    
    ArrayList<Food> foods;
    SecondFrame sf;
            
            
    /**
     * Creates new form FirstFrame
     */
    
    public FirstFrame() {
    	genereteFoods();
        initComponents();
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
    	

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        doTable();
        
    jTable1.setColumnSelectionAllowed(true);
    jScrollPane1.setViewportView(jTable1);
    jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    if (jTable1.getColumnModel().getColumnCount() > 0) {
        jTable1.getColumnModel().getColumn(0).setResizable(false);
        jTable1.getColumnModel().getColumn(1).setResizable(false);
        jTable1.getColumnModel().getColumn(2).setResizable(false);
    }

    jButton1.setText("Remove selected row");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });

    jButton2.setText("Edit selected row");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton2ActionPerformed(evt);
        }
    });

    jButton3.setText("Add new food");
    jButton3.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton3ActionPerformed(evt);
        }
    });
    
    jButton4.setText("Refresh");
    jButton4.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton4ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane1)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(jButton1)
                    .addGap(85, 85, 85)
                    .addComponent(jButton2))
                .addGroup(layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(jButton3)
                    .addGap(142, 142, 142)
                    .addComponent(jButton4)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton1)
                .addComponent(jButton2))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jButton3)
            .addComponent(jButton4))
            .addGap(18, 18, 18)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(105, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        try{
            int rowNumer = jTable1.getSelectedRow();
            model.removeRow(rowNumer);
            foods.remove(rowNumer);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
    	try{
	    	int rowNumer = jTable1.getSelectedRow();
	        Food foodHelp = foods.get(rowNumer);
	        sf = new SecondFrame(foodHelp);
	        foods.get(rowNumer).setId(sf.getFood().getId());
	        foods.get(rowNumer).setName(sf.getFood().getName());
	        foods.get(rowNumer).setScientificName(sf.getFood().getScientificName());
	        foods.get(rowNumer).setTags(sf.getFood().getTags());
	        
    	}
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
      
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        sf = new SecondFrame();
        foods.add(sf.getFood());
            }  
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {     
    	doTable();
    	repaint();
    }  

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(FirstFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration                   
    
    public void doTable(){
    	Object[][] help = new Object[foods.size()][3];
        for(int i=0; i<foods.size();i++){
            help[i][0]=foods.get(i).getId();
            help[i][1]=foods.get(i).getName();
            help[i][2]=foods.get(i).getScientificName();
        }
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                help
            ,
            new String [] {
                "ID", "Name", "Scientific Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
    }
    
    public void genereteFoods(){
    	foods = new ArrayList<>();
        Boolean[] tab = new Boolean[6];
        
        for(int i=0;i<6;i++)
        	if((int)(Math.random()*2)==1)
        	tab[i]=true;
        	else
        	tab[i]=false;
        
        foods.add(new Food("1","foodName1","foodScientificName1",tab));
        
        for(int i=0;i<6;i++)
        	if((int)(Math.random()*2)==1)
        	tab[i]=true;
        	else
        	tab[i]=false;
        
        foods.add(new Food("2","foodName2","foodScientificName2",tab));
        
        for(int i=0;i<6;i++)
        	if((int)(Math.random()*2)==1)
        	tab[i]=true;
        	else
        	tab[i]=false;
        
        foods.add(new Food("3","foodName3","foodScientificName3",tab));
    }
}
