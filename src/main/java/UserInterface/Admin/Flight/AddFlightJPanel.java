/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Admin.Flight;

import Business.Flight.Airliner;
import Business.Flight.AirlinerDirectory;
import Business.Flight.Airplane;
import Business.Flight.FlightSchedule;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author zhaoxi
 */
public class AddFlightJPanel extends javax.swing.JPanel {

    private JPanel rightJPanel;
    private AirlinerDirectory airlinerDir;
    private Airliner airliner;
    
    
    /**
     * Creates new form AddFlightJPanel
     */
    public AddFlightJPanel(JPanel rightJPanel, AirlinerDirectory airlinerDir, Airliner airliner) {
        initComponents();
        this.rightJPanel = rightJPanel;
        this.airlinerDir = airlinerDir;
        this.airliner = airliner;
        
        txtCapacity.setText("150");
        initialize();
    }
    
    public void initialize(){
        airlinerComboBox.removeAllItems();
        airlinerComboBox.addItem("Select Airliner");
        for (Airliner airliner: airlinerDir.getAirlinerDirectory()){
            airlinerComboBox.addItem(airliner);
        }
    
        airlinerComboBox.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(final ActionEvent e) {
               Airliner airliner = (Airliner) airlinerComboBox.getSelectedItem();
               airplaneComboBox.removeAllItems();
               
               for (int i = 0; i < airliner.getFleet().getFleet().size(); i++) {
                   Airplane airplane = airliner.getFleet().getFleet().get(i);
                   airplaneComboBox.addItem(airplane);
               }
           }
       });
    }
    
    public String dateToString(Date date){
        SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
        String dateToString = format.format(date);
        return dateToString;
    }
    
    private boolean inputNumberCorrect(String s){
        Pattern p = Pattern.compile("^[0-9]+$");
        Matcher m = p.matcher(s);
        boolean input = m.matches();
        return input;
    }
    private boolean inputStringCorrect(String s){
        Pattern p = Pattern.compile("^[a-zA-Z]+$");
        Matcher m = p.matcher(s);
        boolean input = m.matches();
        return input;
    }
    private boolean inputPriceCorrect(String s){
        Pattern p = Pattern.compile("^[0-9]+[.]*[0-9]+$");
        Matcher m = p.matcher(s);
        boolean input = m.matches();
        return input;
    }
    public boolean flightNumUnique(){
        boolean unique = true;
        for(int i = 0; i < airlinerDir.getAirlinerDirectory().size(); i++){
            for (int j = 0; j < airlinerDir.getAirlinerDirectory().get(i)
                    .getFlightScheduleCatalog().getFlightScheduleCatalog().size(); j++) {
                if (txtFlightNum.getText().equals(airlinerDir.getAirlinerDirectory().get(i)
                    .getFlightScheduleCatalog().getFlightScheduleCatalog().get(j).getFlightNumber())) {
                    unique = false;
                    break;
                }
            }
        }
        return unique;
    }
    
    public boolean inputfieldValid(){
        boolean inputfieldValid = true;
        
        if (txtFlightNum.getText().equals("") || !inputNumberCorrect(txtFlightNum.getText())) {
            inputfieldValid = false;
        }
        if (!flightNumUnique()) {
            inputfieldValid = false;
        }
        if (txtFrom.getText().equals("") || !inputStringCorrect(txtFrom.getText())) {
            inputfieldValid = false;
        }
        if (txtTo.getText().equals("") || !inputStringCorrect(txtTo.getText())) {
            inputfieldValid = false;
        }
        if (txtPrice.getText().equals("") || !inputPriceCorrect(txtPrice.getText())) {
            inputfieldValid = false;
        }
        if (txtFrom.getText().equals(txtTo.getText())) {
            inputfieldValid = false;
        }
        
        return inputfieldValid;
    }
    
    public boolean DateInput() throws ParseException{
        boolean DateInput = false;
        
        String departureDate = dateToString(departureDateChooser.getDate());
        String departureHour = String.valueOf(departureHourComboBox.getSelectedItem());
        String departureMin = String.valueOf(departureMinComboBox.getSelectedItem());
        
        String arrivalDate = dateToString(arrivalDateChooser.getDate());
        String arrivalHour = String.valueOf(arrivalHourComboBox.getSelectedItem());
        String ariivalMin = String.valueOf(arrivalMinComboBox.getSelectedItem());
                
        int dateDiff = departureDate.compareTo(arrivalDate);
        int hourDiff = departureHour.compareTo(arrivalHour);
        int minDiff = departureMin.compareTo(ariivalMin);
        
        if (dateDiff < 0) {
            DateInput = true;
        }
        if (dateDiff == 0) {
            if (hourDiff < 0) {
                DateInput = true;
            }
            if (hourDiff == 0) {
                if (minDiff < 0) {
                    DateInput = true;
                }
            }
        }
        return DateInput;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel9 = new javax.swing.JLabel();
        txtFlightNum = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFrom = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        airlinerComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        airplaneComboBox = new javax.swing.JComboBox();
        btnSave = new javax.swing.JButton();
        txtCapacity = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        statusComboBox = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        departureDateChooser = new com.toedter.calendar.JDateChooser();
        departureHourComboBox = new javax.swing.JComboBox<>();
        departureMinComboBox = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        arrivalHourComboBox = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        arrivalMinComboBox = new javax.swing.JComboBox<>();
        arrivalDateChooser = new com.toedter.calendar.JDateChooser();

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Capacity");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("To");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Flight No.");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("From");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Airliner");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Arrival Time");

        airlinerComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Airplane");

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtCapacity.setEnabled(false);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Departure Time");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Price");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Status");

        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Delay", "Cancel", "Full" }));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setText("Add New Flight");

        departureDateChooser.setDateFormatString("MM-dd-yyyy");

        departureHourComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        departureMinComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText(":");

        arrivalHourComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText(":");

        arrivalMinComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        arrivalDateChooser.setDateFormatString("MM-dd-yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(airlinerComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFlightNum)
                            .addComponent(airplaneComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(departureHourComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(departureMinComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(departureDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(arrivalHourComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(arrivalMinComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(arrivalDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(394, 394, 394)
                        .addComponent(btnSave))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(jLabel17)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnBack)
                .addGap(11, 11, 11)
                .addComponent(jLabel17)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(departureDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(departureHourComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(departureMinComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(arrivalMinComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(arrivalHourComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtFlightNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(airlinerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(airplaneComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(arrivalDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5)))))
                        .addGap(62, 62, 62)))
                .addComponent(btnSave)
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        rightJPanel.remove(this);
        Component [] componentArray = rightJPanel.getComponents();
        Component c = componentArray[componentArray.length-1];
        FlightScheduleMgrJPanel fsm = (FlightScheduleMgrJPanel) c;
        fsm.populateTable();
        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.previous(rightJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        if (!inputfieldValid()) {
             JOptionPane.showMessageDialog(null, "Invalid input!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            try {
                if (DateInput()) {
                    Airliner airliner = (Airliner)airlinerComboBox.getSelectedItem();
                    FlightSchedule fs = airliner.getFlightScheduleCatalog().addFlight();
                    fs.setAirliner(airliner);
                    Airplane airplane = (Airplane)airplaneComboBox.getSelectedItem();
                    fs.setAirplane(airplane);
                    
                    fs.setFlightNumber(txtFlightNum.getText());
                    fs.setFrom(txtFrom.getText());
                    fs.setTo(txtTo.getText());
                    
                    fs.setDepartureDate(dateToString(departureDateChooser.getDate()));
                    fs.setDepartureHour(departureHourComboBox.getSelectedItem().toString());
                    fs.setDepartureMin(departureMinComboBox.getSelectedItem().toString());
                    fs.setDepartureTime(fs.getDepartureHour() + ":" + fs.getDepartureMin());
                    
                    
                    fs.setArrivalDate(dateToString(arrivalDateChooser.getDate()));
                    fs.setArrivalHour(arrivalHourComboBox.getSelectedItem().toString());
                    fs.setArrivalMin(arrivalMinComboBox.getSelectedItem().toString());
                    fs.setArrivalTime(fs.getArrivalHour() + ":" + fs.getArrivalMin());
                    
                    fs.setStatus(statusComboBox.getSelectedItem().toString());
                    fs.setPrice(Double.parseDouble(txtPrice.getText()));
                    
                    JOptionPane.showMessageDialog(null, "Flight added successfully!");
                    
                    txtFlightNum.setText("");
                    txtFrom.setText("");
                    txtTo.setText("");
                    
                    departureDateChooser.setDate(null);
                    departureHourComboBox.setSelectedItem("00");
                    departureMinComboBox.setSelectedItem("00");
                    
                    arrivalDateChooser.setDate(null);
                    arrivalHourComboBox.setSelectedItem("00");
                    arrivalMinComboBox.setSelectedItem("00");
                    
                    txtPrice.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid time!", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox airlinerComboBox;
    private javax.swing.JComboBox airplaneComboBox;
    private com.toedter.calendar.JDateChooser arrivalDateChooser;
    private javax.swing.JComboBox<String> arrivalHourComboBox;
    private javax.swing.JComboBox<String> arrivalMinComboBox;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser departureDateChooser;
    private javax.swing.JComboBox<String> departureHourComboBox;
    private javax.swing.JComboBox<String> departureMinComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> statusComboBox;
    private javax.swing.JTextField txtCapacity;
    private javax.swing.JTextField txtFlightNum;
    private javax.swing.JTextField txtFrom;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtTo;
    // End of variables declaration//GEN-END:variables
}
