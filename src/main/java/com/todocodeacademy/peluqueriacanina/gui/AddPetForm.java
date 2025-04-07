package com.todocodeacademy.peluqueriacanina.gui;

import java.awt.Component;
import java.awt.Container;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class AddPetForm extends javax.swing.JFrame {

    public AddPetForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupIsAllergic = new javax.swing.ButtonGroup();
        groupIsSpecialAttention = new javax.swing.ButtonGroup();
        mainContainerAddPet = new javax.swing.JPanel();
        formContainerAddPet = new javax.swing.JPanel();
        petNameLabel = new javax.swing.JLabel();
        petName = new javax.swing.JTextField();
        petRaceLabel = new javax.swing.JLabel();
        petRace = new javax.swing.JTextField();
        petColorLabel = new javax.swing.JLabel();
        petColor = new javax.swing.JTextField();
        isAllergicLabel = new javax.swing.JLabel();
        isSpecialAttentionLabel = new javax.swing.JLabel();
        ownerNameLabel = new javax.swing.JLabel();
        ownerName = new javax.swing.JTextField();
        ownerContactLabel = new javax.swing.JLabel();
        ownerContact = new javax.swing.JTextField();
        observationsLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        observations = new javax.swing.JTextArea();
        isAllergic = new javax.swing.JRadioButton();
        isNotAllergic = new javax.swing.JRadioButton();
        isSpecialAttention = new javax.swing.JRadioButton();
        isNotSpecialAttention = new javax.swing.JRadioButton();
        h1 = new javax.swing.JLabel();
        dogImage = new javax.swing.JLabel();
        addPetButton = new javax.swing.JButton();
        resetAddPetFormButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        petNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        petNameLabel.setText("Nombre");

        petName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        petName.setMinimumSize(new java.awt.Dimension(64, 26));
        petName.setPreferredSize(new java.awt.Dimension(64, 26));

        petRaceLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        petRaceLabel.setText("Raza");

        petRace.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        petRace.setPreferredSize(new java.awt.Dimension(64, 26));

        petColorLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        petColorLabel.setText("Color");

        petColor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        petColor.setPreferredSize(new java.awt.Dimension(64, 26));

        isAllergicLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        isAllergicLabel.setText("Alérgico");

        isSpecialAttentionLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        isSpecialAttentionLabel.setText("Atención especial");

        ownerNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ownerNameLabel.setText("Nombre del dueño");

        ownerName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        ownerName.setPreferredSize(new java.awt.Dimension(64, 26));

        ownerContactLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ownerContactLabel.setText("Contacto del dueño");

        ownerContact.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        ownerContact.setPreferredSize(new java.awt.Dimension(64, 26));

        observationsLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        observationsLabel.setText("Observaciones");

        observations.setColumns(20);
        observations.setRows(5);
        observations.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 0, true));
        jScrollPane1.setViewportView(observations);

        groupIsAllergic.add(isAllergic);
        isAllergic.setText("Sí");
        isAllergic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isAllergicActionPerformed(evt);
            }
        });

        groupIsAllergic.add(isNotAllergic);
        isNotAllergic.setSelected(true);
        isNotAllergic.setText("No");
        isNotAllergic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isNotAllergicActionPerformed(evt);
            }
        });

        groupIsSpecialAttention.add(isSpecialAttention);
        isSpecialAttention.setText("Sí");

        groupIsSpecialAttention.add(isNotSpecialAttention);
        isNotSpecialAttention.setSelected(true);
        isNotSpecialAttention.setText("No");

        javax.swing.GroupLayout formContainerAddPetLayout = new javax.swing.GroupLayout(formContainerAddPet);
        formContainerAddPet.setLayout(formContainerAddPetLayout);
        formContainerAddPetLayout.setHorizontalGroup(
            formContainerAddPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formContainerAddPetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formContainerAddPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formContainerAddPetLayout.createSequentialGroup()
                        .addComponent(petNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(petName, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formContainerAddPetLayout.createSequentialGroup()
                        .addComponent(petColorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(petColor, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formContainerAddPetLayout.createSequentialGroup()
                        .addComponent(ownerNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(ownerName, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formContainerAddPetLayout.createSequentialGroup()
                        .addComponent(petRaceLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(petRace, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formContainerAddPetLayout.createSequentialGroup()
                        .addGroup(formContainerAddPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ownerContactLabel)
                            .addComponent(isAllergicLabel)
                            .addComponent(isSpecialAttentionLabel))
                        .addGroup(formContainerAddPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formContainerAddPetLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(formContainerAddPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ownerContact, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1)))
                            .addGroup(formContainerAddPetLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(formContainerAddPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(formContainerAddPetLayout.createSequentialGroup()
                                        .addComponent(isSpecialAttention)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(isNotSpecialAttention))
                                    .addGroup(formContainerAddPetLayout.createSequentialGroup()
                                        .addComponent(isAllergic)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(isNotAllergic))))))
                    .addGroup(formContainerAddPetLayout.createSequentialGroup()
                        .addComponent(observationsLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        formContainerAddPetLayout.setVerticalGroup(
            formContainerAddPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formContainerAddPetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formContainerAddPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(petNameLabel)
                    .addComponent(petName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(formContainerAddPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(petRaceLabel)
                    .addComponent(petRace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formContainerAddPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(petColorLabel)
                    .addComponent(petColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formContainerAddPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isAllergicLabel)
                    .addComponent(isAllergic)
                    .addComponent(isNotAllergic))
                .addGap(18, 18, 18)
                .addGroup(formContainerAddPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isSpecialAttentionLabel)
                    .addComponent(isSpecialAttention)
                    .addComponent(isNotSpecialAttention))
                .addGap(30, 30, 30)
                .addGroup(formContainerAddPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ownerNameLabel)
                    .addComponent(ownerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formContainerAddPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ownerContactLabel)
                    .addComponent(ownerContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(formContainerAddPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formContainerAddPetLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(observationsLabel))
                    .addGroup(formContainerAddPetLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        h1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        h1.setText("Añadir mascota");

        dogImage.setIcon(new javax.swing.ImageIcon("C:\\Users\\c153b\\Downloads\\bp-lot-3-great-dane-wb-ws-1-removebg-preview.png")); // NOI18N

        addPetButton.setBackground(new java.awt.Color(0, 255, 51));
        addPetButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addPetButton.setForeground(new java.awt.Color(255, 255, 255));
        addPetButton.setText("Añadir");
        addPetButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        addPetButton.setBorderPainted(false);
        addPetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPetButtonActionPerformed(evt);
            }
        });

        resetAddPetFormButton.setBackground(new java.awt.Color(0, 204, 255));
        resetAddPetFormButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        resetAddPetFormButton.setForeground(new java.awt.Color(255, 255, 255));
        resetAddPetFormButton.setText("Restablecer");
        resetAddPetFormButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        resetAddPetFormButton.setBorderPainted(false);
        resetAddPetFormButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetAddPetFormButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainContainerAddPetLayout = new javax.swing.GroupLayout(mainContainerAddPet);
        mainContainerAddPet.setLayout(mainContainerAddPetLayout);
        mainContainerAddPetLayout.setHorizontalGroup(
            mainContainerAddPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainContainerAddPetLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(formContainerAddPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(mainContainerAddPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dogImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addPetButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetAddPetFormButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        mainContainerAddPetLayout.setVerticalGroup(
            mainContainerAddPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainContainerAddPetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainContainerAddPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainContainerAddPetLayout.createSequentialGroup()
                        .addComponent(h1)
                        .addGap(27, 27, 27)
                        .addComponent(addPetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resetAddPetFormButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dogImage))
                    .addComponent(formContainerAddPet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainContainerAddPet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainContainerAddPet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void isAllergicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isAllergicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isAllergicActionPerformed

    private void isNotAllergicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isNotAllergicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isNotAllergicActionPerformed

    private void addPetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPetButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addPetButtonActionPerformed

    private void resetAddPetFormButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetAddPetFormButtonActionPerformed
        for (Component component : formContainerAddPet.getComponents()) 
            if (component instanceof JTextField) 
                ((JTextField) component).setText("");
            else if (component instanceof JTextArea) 
                ((JTextArea) component).setText("");
            else if (component instanceof JRadioButton)
                ((JRadioButton) component).setSelected(true);
        
    }//GEN-LAST:event_resetAddPetFormButtonActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPetButton;
    private javax.swing.JLabel dogImage;
    private javax.swing.JPanel formContainerAddPet;
    private javax.swing.ButtonGroup groupIsAllergic;
    private javax.swing.ButtonGroup groupIsSpecialAttention;
    private javax.swing.JLabel h1;
    private javax.swing.JRadioButton isAllergic;
    private javax.swing.JLabel isAllergicLabel;
    private javax.swing.JRadioButton isNotAllergic;
    private javax.swing.JRadioButton isNotSpecialAttention;
    private javax.swing.JRadioButton isSpecialAttention;
    private javax.swing.JLabel isSpecialAttentionLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainContainerAddPet;
    private javax.swing.JTextArea observations;
    private javax.swing.JLabel observationsLabel;
    private javax.swing.JTextField ownerContact;
    private javax.swing.JLabel ownerContactLabel;
    private javax.swing.JTextField ownerName;
    private javax.swing.JLabel ownerNameLabel;
    private javax.swing.JTextField petColor;
    private javax.swing.JLabel petColorLabel;
    private javax.swing.JTextField petName;
    private javax.swing.JLabel petNameLabel;
    private javax.swing.JTextField petRace;
    private javax.swing.JLabel petRaceLabel;
    private javax.swing.JButton resetAddPetFormButton;
    // End of variables declaration//GEN-END:variables
}
