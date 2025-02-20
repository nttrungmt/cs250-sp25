package lab06;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.DefaultTableModel;

public class ContactManagementForm extends JFrame {
	private static final long serialVersionUID = 1L;

  	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactManagementForm frame = new ContactManagementForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ContactManagementForm() {
  }

  //this method loads the selected contact to the input panel
	private void btnModify_Clicked() {
  }

  //this method adds new contact to the table or updates existing one
	private void btnOk_Clicked() {
  }
  
	//cancel the add new / update contact
	private void btnCancel_Clicked() {
  }
	
	//this method shows the input panel for adding new contact
	private void btnAdd_Clicked() {
  }
	
	//this method deletes selected contacts on the table
	private void btnDelete_Clicked() {
  }
}
  
