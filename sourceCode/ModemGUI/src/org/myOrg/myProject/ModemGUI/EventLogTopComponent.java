package org.myOrg.myProject.ModemGUI;

import org.openide.util.NbBundle;
import org.openide.windows.TopComponent;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;

/*******************************************************************************
 * Top Component used to hold the Event Log swing components.  It is expected 
 * that this top component be visible at all times. 
 * 
 * EventLogDisplay.java is the top level jPanel for the Event Log
 * @author Daniel Hals
 ******************************************************************************/
@ConvertAsProperties(dtd = "-//org.myOrg.myProject.ModemGUI//EventLog//EN",
autostore = false)
@TopComponent.Description(preferredID = "EventLogTopComponent",
persistenceType = TopComponent.PERSISTENCE_ALWAYS)
@TopComponent.Registration(mode = "output", openAtStartup = true)
@ActionID(category = "Window", id = "org.myOrg.myProject.ModemGUI.EventLogTopComponent")
@ActionReference(path = "Menu/Window" )
@TopComponent.OpenActionRegistration(displayName = "#CTL_EventLogAction",
preferredID = "EventLogTopComponent")
public final class EventLogTopComponent extends TopComponent {
    private org.myOrg.myProject.ModemGUI.EventLogDisplay eventLog1;
    
    public EventLogTopComponent() {
        
        initComponents();
        setName(NbBundle.getMessage(EventLogTopComponent.class, "CTL_EventLogTopComponent"));
        setToolTipText(NbBundle.getMessage(EventLogTopComponent.class, "HINT_EventLogTopComponent"));

        putClientProperty(TopComponent.PROP_CLOSING_DISABLED, Boolean.TRUE);
        putClientProperty(TopComponent.PROP_DRAGGING_DISABLED, Boolean.TRUE);
        putClientProperty(TopComponent.PROP_UNDOCKING_DISABLED, Boolean.TRUE);
        
        eventLog1 = new org.myOrg.myProject.ModemGUI.EventLogDisplay();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(eventLog1, javax.swing.GroupLayout.DEFAULT_SIZE, 1187, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(eventLog1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1187, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    @Override
    public void componentOpened() {
    }

    @Override
    public void componentClosed() {
    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
    }
}
