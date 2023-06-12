package main;

import GUI.GraphSandboxUI;

/**
 * This is a main function of the project.
 * @author stoicneutron
 */
public class Main extends javax.swing.JPanel {
    
    public static void main(String args[]) {
        
        /* DO NOT CHANGE! - Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GraphSandboxUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraphSandboxUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraphSandboxUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraphSandboxUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        GraphSandboxUI UI = new GraphSandboxUI();
        
        /* DO NOT CHANGE! - Create and display the GUI */
        java.awt.EventQueue.invokeLater(new Runnable() {
           
            @Override
            public void run() {
                UI.setVisible(true);
                
            }
        });
    }  
}
