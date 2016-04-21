package org.myOrg.myProject.ModemGUI;

import java.awt.event.MouseEvent;
import java.util.Observable;
import javax.swing.table.TableColumn;

/*******************************************************************************
 * Contains the Event Log.  The Event Log is comprised of events from the modem.  
 * Each event has a severity, a category, a description, and a timestamp. 
 * 
 * The modem can hold up to 1000 events. This component may be allowed to hold 
 * more than that.
 ******************************************************************************/
public class EventLogDisplay extends javax.swing.JPanel {
    
    /** Creates new form EventLog */
    public EventLogDisplay() {
        initComponents();

        /***********************************************************************
         * Resize the Event Log Screen column widths
         **********************************************************************/
        TableColumn col = EventLogTable.getColumnModel().getColumn(0);
        col.setMinWidth (150);
        col = EventLogTable.getColumnModel().getColumn(1);
        col.setMinWidth (65);
        col = EventLogTable.getColumnModel().getColumn(2);
        col.setMinWidth (75);
        col = EventLogTable.getColumnModel().getColumn(3);
        col.setMinWidth (1890);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        EventLogTable.setAutoCreateRowSorter(true);
        EventLogTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Date", "Type", "Category", "Description"
            }
        ) {
            @SuppressWarnings("rawtypes")
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            @SuppressWarnings("rawtypes")
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        EventLogTable.setGridColor(new java.awt.Color(0, 0, 0));
        EventLogTable.setShowHorizontalLines(false);
        EventLogTable.setShowVerticalLines(false);
        jScrollPane1.setViewportView(EventLogTable);
        EventLogTable.setFillsViewportHeight (true);
        if (EventLogTable.getColumnModel().getColumnCount() > 0) {
            EventLogTable.getColumnModel().getColumn(0).setHeaderValue(org.openide.util.NbBundle.getMessage(EventLogDisplay.class, "EventLogDisplay.EventLogTable.columnModel.title0")); // NOI18N
            EventLogTable.getColumnModel().getColumn(1).setHeaderValue(org.openide.util.NbBundle.getMessage(EventLogDisplay.class, "EventLogDisplay.EventLogTable.columnModel.title1")); // NOI18N
            EventLogTable.getColumnModel().getColumn(2).setHeaderValue(org.openide.util.NbBundle.getMessage(EventLogDisplay.class, "EventLogDisplay.EventLogTable.columnModel.title2")); // NOI18N
            EventLogTable.getColumnModel().getColumn(3).setHeaderValue(org.openide.util.NbBundle.getMessage(EventLogDisplay.class, "EventLogDisplay.EventLogTable.columnModel.title3")); // NOI18N
        }
        // add Mouse Listener to Event Log Table
        EventLogTable.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int c = e.getButton();
                switch (c) {
                    // left mouse button
                    case MouseEvent.BUTTON1:
                    break;
                    // middle mouse button
                    case MouseEvent.BUTTON2:
                    break;
                    // right mouse button
                    case MouseEvent.BUTTON3:
                    break;
                }
            }
            @Override
            public void mousePressed(MouseEvent e) {
            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            @Override
            public void mouseEntered(MouseEvent e) {
            }
            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable EventLogTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    /***************************************************************************
     * 
     * @throws Exception
     **************************************************************************/
    private void refresh () {
    }
    
    /***************************************************************************
     * Updates class when notified of change
     * 
     * @param o
     * @param arg
     **************************************************************************/
    public void update(Observable o, Object arg) {
    }
}
