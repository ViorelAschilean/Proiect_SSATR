/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
/**
 *
 * @author Asus
 */
public class Message {

String sender;
String subject;
String body;
public Message(String a1,String a2,String a3){
    sender = a1;
    subject = a2;
    body = a3;
}
public String getSender() {
    return sender;
}
public void setSender(String sender) {
    this.sender = sender;
}
public String getSubject() {
    return subject;
}
public void setSubject(String subject) {
    this.subject = subject;
}
public String getBody() {
    return body;
}
public void setBody(String body) {
    this.body = body;
}

}
