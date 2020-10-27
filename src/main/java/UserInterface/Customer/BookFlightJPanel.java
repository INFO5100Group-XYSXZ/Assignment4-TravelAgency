/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Customer;

import Business.Flight.Airliner;
import Business.Flight.AirlinerDirectory;
import Business.Flight.FlightSchedule;
import Business.User.Account;
import Business.User.PassengerDirectory;
import java.awt.CardLayout;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zhaoxi
 */
public class BookFlightJPanel extends javax.swing.JPanel {

    private JPanel rightJPanel;
    private Account account;
    private AirlinerDirectory airlinerDir;
    private PassengerDirectory passengerDir;
    /**
     * Creates new form BookFlightJPanel
     */
    public BookFlightJPanel(JPanel rightJPanel, Account account, AirlinerDirectory airlinerDir) {
        initComponents();
        this.rightJPanel = rightJPanel;
        this.account = account;
        this.airlinerDir = airlinerDir;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBookFlight = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        flightScheduleTable = new javax.swing.JTable();

        btnBookFlight.setText("Book");
        btnBookFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookFlightActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setText("Book Flight");

        flightScheduleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight No.", "Airliner", "Airplane", "From", "To", "Date", "Departure", "Arrival", "Remaining", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(flightScheduleTable);
        if (flightScheduleTable.getColumnModel().getColumnCount() > 0) {
            flightScheduleTable.getColumnModel().getColumn(0).setResizable(false);
            flightScheduleTable.getColumnModel().getColumn(0).setPreferredWidth(70);
            flightScheduleTable.getColumnModel().getColumn(1).setResizable(false);
            flightScheduleTable.getColumnModel().getColumn(1).setPreferredWidth(50);
            flightScheduleTable.getColumnModel().getColumn(2).setResizable(false);
            flightScheduleTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            flightScheduleTable.getColumnModel().getColumn(3).setResizable(false);
            flightScheduleTable.getColumnModel().getColumn(3).setPreferredWidth(50);
            flightScheduleTable.getColumnModel().getColumn(4).setResizable(false);
            flightScheduleTable.getColumnModel().getColumn(4).setPreferredWidth(50);
            flightScheduleTable.getColumnModel().getColumn(5).setResizable(false);
            flightScheduleTable.getColumnModel().getColumn(5).setPreferredWidth(100);
            flightScheduleTable.getColumnModel().getColumn(6).setResizable(false);
            flightScheduleTable.getColumnModel().getColumn(6).setPreferredWidth(70);
            flightScheduleTable.getColumnModel().getColumn(7).setResizable(false);
            flightScheduleTable.getColumnModel().getColumn(7).setPreferredWidth(130);
            flightScheduleTable.getColumnModel().getColumn(8).setResizable(false);
            flightScheduleTable.getColumnModel().getColumn(8).setPreferredWidth(70);
            flightScheduleTable.getColumnModel().getColumn(9).setResizable(false);
            flightScheduleTable.getColumnModel().getColumn(9).setPreferredWidth(50);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addComponent(jLabel17))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(btnBookFlight)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnBack)
                .addGap(14, 14, 14)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBookFlight)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel)flightScheduleTable.getModel();
        model.setRowCount(0);
        DecimalFormat df = new DecimalFormat("#.00"); 
        for (Airliner airliner : airlinerDir.getAirlinerDirectory()) {
            for(FlightSchedule fs : airliner.getFlightScheduleCatalog().getFlightScheduleCatalog()){
            Object row[] = new Object[10];
            row[0] = fs;
            row[1] = fs.getAirliner();
            row[2] = fs.getAirplane();
            row[3] = fs.getFrom();
            row[4] = fs.getTo();
            row[5] = fs.getDepartureDate();
            row[6] = fs.getDepartureTime();
            row[7] = fs.getArrivalTime();
            row[8] = fs.getSeatList().getSeatList().size();
            row[9] = df.format(fs.getPrice());
            
            model.addRow(row);
            }
        }
    }
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)rightJPanel.getLayout();
        rightJPanel.remove(this);
        layout.previous(rightJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnBookFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookFlightActionPerformed
       int row = flightScheduleTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        FlightSchedule selectedFlight = (FlightSchedule)flightScheduleTable.getValueAt(row, 0);
        OrderConfirmJPanel ocjp = new OrderConfirmJPanel(rightJPanel,selectedFlight,account);
        rightJPanel.add("OrderConfirmJPanel", ocjp);
        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.next(rightJPanel);
    }//GEN-LAST:event_btnBookFlightActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBookFlight;
    private javax.swing.JTable flightScheduleTable;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
