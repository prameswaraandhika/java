/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andhikamvc.view;

import com.andhikamvc.controller.ControllerFood;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import lombok.Getter;

/**
 *
 * @author Andhika
 */
@Getter
public class FoodViews extends JFrame implements ActionListener, ListSelectionListener {

    private final ControllerFood controller;
    private JTextField foodName, foodPrice, foodStock;
    private JLabel labelFoodName, labelFoodPrice, labelFoodStock;
    private JButton save, edit, delete;
    private JTable table;
    private DefaultTableModel model;
    int row;

    public FoodViews() {
        controller = new ControllerFood(this);
        initGUI();
    }

    private void initGUI() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        setTitle("Aplikasi CRUD MVC");
        setSize(470, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setLocationRelativeTo(null);

        JPanel panelMain = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        labelFoodName = new JLabel("Food Name: ");
        labelFoodName.setPreferredSize(new Dimension(120, 30));
        panelMain.add(labelFoodName);
        foodName = new JTextField();
        foodName.setPreferredSize(new Dimension(250, 30));
        panelMain.add(foodName);

        labelFoodPrice = new JLabel("Price: ");
        labelFoodPrice.setPreferredSize(new Dimension(120, 30));
        panelMain.add(labelFoodPrice);
        foodPrice = new JTextField();
        foodPrice.setPreferredSize(new Dimension(250, 30));
        panelMain.add(foodPrice);

        labelFoodStock = new JLabel("Stock: ");
        labelFoodStock.setPreferredSize(new Dimension(120, 30));
        panelMain.add(labelFoodStock);
        foodStock = new JTextField();
        foodStock.setPreferredSize(new Dimension(250, 30));
        panelMain.add(foodStock);

        JPanel panelButton = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 20));

        save = new JButton("SAVE");
        save.setPreferredSize(new Dimension(120, 30));
        save.addActionListener(this);
        panelButton.add(save);
        edit = new JButton("EDIT");
        edit.setPreferredSize(new Dimension(120, 30));
        edit.addActionListener(this);
        panelButton.add(edit);
        delete = new JButton("DELETE");
        delete.setPreferredSize(new Dimension(120, 30));
        delete.addActionListener(this);
        panelButton.add(delete);

        model = (DefaultTableModel) new DefaultTableModel(0, 3);

        table = new JTable(model);
        table.getSelectionModel().addListSelectionListener(this);
        table.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
//                foodName.setText(table.getValueAt(row, 0).toString());
//                foodPrice.setText(table.getValueAt(row, 1).toString());
//                foodStock.setText(table.getValueAt(row, 2).toString());
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
        model.setColumnIdentifiers(new Object[]{"Name", "Price", "Stock"});
        JScrollPane scroll = new JScrollPane();
        scroll.setViewportView(table);
//        panelTable.add(scroll);

        panelMain.add(scroll);
        getContentPane().add(panelMain);
        getContentPane().add(panelButton, BorderLayout.SOUTH);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == save) {
            controller.saveData();
            foodName.setText("");
            foodPrice.setText("");
            foodStock.setText("");
        } else if (e.getSource() == delete) {
            foodName.setText("");
            foodPrice.setText("");
            foodStock.setText("");
            controller.deleteData(row);
        } else if (e.getSource() == edit) {
            controller.EditData(row);

        }

    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
//        if (e.getValueIsAdjusting()) {
        row = table.getSelectedRow();
//        error index out of bonds, doesnt understand till now
//        when i clicked row and clicked delete its gonna be error index out of bond
//        cause when we delete the rows,   
        foodName.setText(table.getValueAt(row, 0).toString());
        foodPrice.setText(table.getValueAt(row, 1).toString());
        foodStock.setText(table.getValueAt(row, 2).toString());
        System.out.println("A");
//        }
    }

}
