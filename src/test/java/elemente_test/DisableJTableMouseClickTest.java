/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elemente_test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
public final class DisableJTableMouseClickTest extends JFrame {
   private JTable table;
   private JScrollPane scrollPane;
   public DisableJTableMouseClickTest() {
      setTitle("DisableJTableMouseClick Test");
      String[] columnNames = {"Country", "Rank"};
      Object[][] data = {{"England", "1"}, {"India", "2"}, {"New Zealand", "3"}, {"Australia", "4"},       {"South Africa","5"}, {"Pakistan","6"}};
      table = new JTable(data, columnNames) {
         public boolean editCellAt(int row, int column, java.util.EventObject e) {
            return false;
         }
      };
      //table.setRowSelectionAllowed(false);
      scrollPane= new JScrollPane(table);
      add(scrollPane);
      setSize(400, 275);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setVisible(true);
   }
   public static void main(String[] args) {
      new DisableJTableMouseClickTest();
   }
}