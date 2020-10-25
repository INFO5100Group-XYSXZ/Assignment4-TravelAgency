/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Admin.Flight;

import Business.Flight.Airliner;
import Business.Flight.AirlinerDirectory;
import Business.Flight.FlightSchedule;
import Business.Flight.FlightScheduleCatalog;
import UserInterface.Admin.Airliner.AddAirlinerJPanel;
import java.awt.CardLayout;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zhaoxi
 */
public class FlightScheduleMgrJPanel extends javax.swing.JPanel {
    
    private JPanel rightJPanel;
    private AirlinerDirectory airlinerDir;
    private Airliner airliner;
    private FlightScheduleCatalog fsc;
    /**
     * Creates new form FlightManagementJPanel
     */
    public FlightScheduleMgrJPanel(JPanel rightJPanel, AirlinerDirectory airlinerDir, Airliner airliner, FlightScheduleCatalog fsc) {
        initComponents();
        this.rightJPanel = rightJPanel;
        this.airlinerDir = airlinerDir;
        this.airliner = airliner;
        this.fsc = fsc;
        populateTable();
        System.out.println(fsc.getFlightScheduleCatalog().size());
    }
    
        public void populateTable() {
        DefaultTableModel model = (DefaultTableModel)flightscheduleTable.getModel();
        model.setRowCount(0);
        for (Airliner airliner : airlinerDir.getAirlinerDirectory()) {
            for(FlightSchedule fs : airliner.getFlightScheduleCatalog().getFlightScheduleCatalog()){
            Object row[] = new Object[12];
            row[0] = fs;
            row[1] = fs.getAirliner();
            row[2] = fs.getAirplane();
            row[3] = fs.getFrom();
            row[4] = fs.getTo();
            row[5] = fs.getDepartureDate();
            row[6] = fs.getDepartureTime();
            row[7] = fs.getArrivalTime();
            row[8] = fs.getAirplane().getCapacity();
            row[9] = fs.getAirplane().getCapacity();
            row[10] = fs.getPrice();
            row[11] = fs.getStatus();
            
            model.addRow(row);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        flightscheduleTable = new javax.swing.JTable();
        btnAddFlight = new javax.swing.JButton();
        btnUpdateFlight = new javax.swing.JButton();
        btnRemoveFlight = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        flightscheduleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight No.", "Airliner", "Airplane", "From", "To", "Date", "Departure", "Arrival", "Capacity", "Remaining", "Price", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(flightscheduleTable);
        if (flightscheduleTable.getColumnModel().getColumnCount() > 0) {
            flightscheduleTable.getColumnModel().getColumn(0).setResizable(false);
            flightscheduleTable.getColumnModel().getColumn(0).setPreferredWidth(70);
            flightscheduleTable.getColumnModel().getColumn(1).setResizable(false);
            flightscheduleTable.getColumnModel().getColumn(1).setPreferredWidth(50);
            flightscheduleTable.getColumnModel().getColumn(2).setResizable(false);
            flightscheduleTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            flightscheduleTable.getColumnModel().getColumn(3).setResizable(false);
            flightscheduleTable.getColumnModel().getColumn(3).setPreferredWidth(50);
            flightscheduleTable.getColumnModel().getColumn(4).setResizable(false);
            flightscheduleTable.getColumnModel().getColumn(4).setPreferredWidth(50);
            flightscheduleTable.getColumnModel().getColumn(5).setResizable(false);
            flightscheduleTable.getColumnModel().getColumn(5).setPreferredWidth(80);
            flightscheduleTable.getColumnModel().getColumn(6).setResizable(false);
            flightscheduleTable.getColumnModel().getColumn(7).setResizable(false);
            flightscheduleTable.getColumnModel().getColumn(7).setPreferredWidth(130);
            flightscheduleTable.getColumnModel().getColumn(8).setResizable(false);
            flightscheduleTable.getColumnModel().getColumn(8).setPreferredWidth(50);
            flightscheduleTable.getColumnModel().getColumn(9).setResizable(false);
            flightscheduleTable.getColumnModel().getColumn(9).setPreferredWidth(70);
            flightscheduleTable.getColumnModel().getColumn(10).setResizable(false);
            flightscheduleTable.getColumnModel().getColumn(10).setPreferredWidth(50);
            flightscheduleTable.getColumnModel().getColumn(11).setResizable(false);
            flightscheduleTable.getColumnModel().getColumn(11).setPreferredWidth(50);
        }

        btnAddFlight.setText("Add");
        btnAddFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFlightActionPerformed(evt);
            }
        });

        btnUpdateFlight.setText("Update");
        btnUpdateFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateFlightActionPerformed(evt);
            }
        });

        btnRemoveFlight.setText("Remove");
        btnRemoveFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveFlightActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setText("Flight Schedule List");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateFlight)
                        .addGap(664, 664, 664)
                        .addComponent(btnRemoveFlight))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 932, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBack))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(348, 348, 348)
                .addComponent(jLabel17)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnBack)
                .addGap(3, 3, 3)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddFlight)
                    .addComponent(btnUpdateFlight)
                    .addComponent(btnRemoveFlight))
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateFlightActionPerformed
        // TODO add your handling code here:
        int row = flightscheduleTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        FlightSchedule fs = (FlightSchedule)flightscheduleTable.getValueAt(row, 0);
        UpdateFlightJPanel uf;
        try {
            uf = new UpdateFlightJPanel(rightJPanel,fs);
            CardLayout layout = (CardLayout)rightJPanel.getLayout();
            rightJPanel.add(uf);
            layout.next(rightJPanel);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnUpdateFlightActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)rightJPanel.getLayout();
        rightJPanel.remove(this);
        layout.previous(rightJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFlightActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)rightJPanel.getLayout();
        rightJPanel.add(new AddFlightJPanel(rightJPanel, airlinerDir, airliner, fsc));
        layout.next(rightJPanel);
    }//GEN-LAST:event_btnAddFlightActionPerformed

    private void btnRemoveFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveFlightActionPerformed
        // TODO add your handling code here:
        int row = flightscheduleTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to delete this flight?", "Warning", dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION){
                FlightSchedule fs = (FlightSchedule)flightscheduleTable.getValueAt(row, 0);
                airliner.getFlightScheduleCatalog().getFlightScheduleCatalog().remove(fs);
                populateTable();
            }
    }//GEN-LAST:event_btnRemoveFlightActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddFlight;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRemoveFlight;
    private javax.swing.JButton btnUpdateFlight;
    private javax.swing.JTable flightscheduleTable;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
