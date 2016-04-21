package org.myOrg.myProject.ModemGUI;

import java.awt.Dimension;
import java.awt.Toolkit;
import org.openide.modules.ModuleInstall;
import org.openide.util.Exceptions;
import org.openide.windows.WindowManager;
import javax.swing.JOptionPane;

// For maximized screen

/***************************************************************************
 * Performs tasks that must be run once during every startup 
 **************************************************************************/
public class Installer extends ModuleInstall {   
    @Override
    public void restored() {

        // Allow the thread sufficient time to initialize MainWindow in order to 
        // prevent NullPointerException when accessing the WindowManager
        try{ 
            Thread.sleep(500);
        } catch (Exception ex){
            Exceptions.printStackTrace(ex);
        }
        
       // Start the project in fullscreen mode       
        WindowManager.getDefault().invokeWhenUIReady(new Runnable() {

            @Override
            public void run() {
                
                try {
                    // in order to remove the title bar, the UI must be disposed
                    // of first before setUndecorated(true) so that it won't
                    // throw an IllegalStateException caused by lack of permission
                    // accessing the UI thread.          
                    WindowManager.getDefault().getMainWindow().setVisible(false);
                    WindowManager.getDefault().getMainWindow().dispose();
                    WindowManager.getDefault().getMainWindow().setUndecorated(true);
                    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                    WindowManager.getDefault().getMainWindow().setSize(dim);
                    WindowManager.getDefault().getMainWindow().setVisible(true);

                }catch (NullPointerException ex) {
                    String message = "Unable to open in Full Screen. Select View/Full Screen from the menu bar above to manually enter Full Screen Mode.";
                    String title   = "Full Screen Error";
                    JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
                }catch (Exception ex) {
                    String message = "Unable to open in Full Screen. Select View/Full Screen from the menu bar above to manually enter Full Screen Mode.";
                    String title   = "Full Screen Error";
                    JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
                }
            }
        }); 
    }
}
