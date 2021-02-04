package elemente_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.event.*; 
import java.awt.*; 
import javax.swing.*; 
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*************/
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.AbstractTableModel;
import java.util.*; 






public class ListToJtable {
public static void main(String[] args) {
    List<Message> messags = new ArrayList<>();
    Message message = new Message("sender@gmail.com", "my subject", "hiiii");
    messags.add(message);
    Message message1 = new Message("sender1@gmail.com", "my subject1",
            "hiiii1");
    messags.add(message1);
    JTable t = new JTable();
    t.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][] {}, 
            new String[] { "Sender", "Subject", "Body" }));
    addToTable(messags, t);
    JPanel panel = new JPanel();
    JScrollPane scrollPane = new JScrollPane();
    scrollPane.setViewportView(t);
    panel.add(scrollPane);

    JFrame frame = new JFrame();
    frame.add(panel);
    frame.setSize(500, 500);
    frame.setVisible(true);
}

public static void addToTable(List<Message> messags, JTable jTable) {
    for (Message message : messags) {
        ((DefaultTableModel) jTable.getModel()).addRow(new Object[] {
                message.getSender(), message.getSubject(),
                message.getBody() });
    }
}

}


