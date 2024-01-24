
package irfansenel;

import java.awt.BorderLayout;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author isene
 */
public class NewJFrame extends javax.swing.JFrame {
Distributor distributor = new Distributor();   
  
    public NewJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")                      
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(102, 255, 204));
        jLabel1.setFont(new java.awt.Font("Perpetua", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Distributor App");
        jLabel1.setToolTipText("");

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setText("Add Subscription");
        jButton1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 153, 255));
        jButton2.setText("Add Journal");
        jButton2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 153, 255));
        jButton3.setText("Add Individual Subscriber");
        jButton3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 153, 255));
        jButton4.setText("Add Corporational Subscriber");
        jButton4.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(51, 153, 255));
        jButton5.setText("List All Sending Orders");
        jButton5.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(51, 153, 255));
        jButton6.setText("List Sending Orders");
        jButton6.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(51, 153, 255));
        jButton7.setText("List Subscriptions by Name");
        jButton7.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(51, 153, 255));
        jButton8.setText("List Subscriptions by ISSN Number");
        jButton8.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 0, 51));
        jButton9.setText("Report");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(255, 0, 51));
        jButton11.setText("Save");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(255, 0, 51));
        jButton12.setText("Pay");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(255, 0, 51));
        jButton13.setText("Load");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(247, 247, 247)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(247, 247, 247)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(jButton12)
                    .addComponent(jButton11)
                    .addComponent(jButton13))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
     
        String input1 = JOptionPane.showInputDialog(this, "ISSN of the journal:");
    	String input2 = JOptionPane.showInputDialog(this, "Name of the subscriber:");
    	String input4 = JOptionPane.showInputDialog(this, "Enter the date infos, Subscription start month:");
    	String input5 = JOptionPane.showInputDialog(this, "Enter the date infos, Subscription start year:");
    	String input6 = JOptionPane.showInputDialog(this, "Enter the num of copies");
    	if (input1 != null && input2 != null  && input4 != null && input5 != null && input6 != null){
        Integer copies = Integer.parseInt(input6);
    	Integer value4 = Integer.parseInt(input4);
    	Integer value5 = Integer.parseInt(input5);
    	Journal jour1 = distributor.searchJournal(input1);
    	Subscriber sub1 = distributor.searchSubscriber(input2);
    	DateInfo date = new DateInfo(value4,value5);
    	PaymentInfo payment = new PaymentInfo(0);
        Subscription subscription = new Subscription(date,payment,copies,jour1,sub1);
    	if(distributor.addSubscription(jour1.getIssn(), sub1, subscription))
    		 JOptionPane.showMessageDialog(this, "Subscription successfully added!", "Success", JOptionPane.INFORMATION_MESSAGE);
           } else {
                System.out.println("Değer girilmedi veya iptal edildi.");
           }
    }                                        

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
      
    	String input1 = JOptionPane.showInputDialog(this, "Enter the subscriber name:");
    	if(input1 != null) {
    		String message = "";
    		message = distributor.listSubs(input1);
    		JOptionPane.showMessageDialog(this, message, "List Result", JOptionPane.INFORMATION_MESSAGE);
    	}
    }                                        

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
      
    	String input1 = JOptionPane.showInputDialog(this, "Enter the ISSN of the journal:");
    	if(input1 != null) {
    		String message = "";
    		message = distributor.listSubscriptions(input1);
    		JOptionPane.showMessageDialog(this, message, "List Result", JOptionPane.INFORMATION_MESSAGE);
    	}
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
        String input1 = JOptionPane.showInputDialog(this, "Name of the journal:");
    	String input2 = JOptionPane.showInputDialog(this, "ISSN of the journal:");
    	String input3 = JOptionPane.showInputDialog(this, "Frequency of the journal:");
    	String input4 = JOptionPane.showInputDialog(this, "issuePrice of the journal:");
    	
        if (input1 != null && input2 != null && input3 != null && input4 != null) {
        int value3 = Integer.parseInt(input3);
    	Double value4 = Double.parseDouble(input4);
        Journal journal = new Journal(input1,input2,value3,value4);
        if(distributor.addJournal(journal))
        JOptionPane.showMessageDialog(this, journal.toString(), "New Journal Created", JOptionPane.INFORMATION_MESSAGE);
        } else {
            System.out.println("Değer girilmedi veya iptal edildi.");
        }
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String input1 = JOptionPane.showInputDialog(this, "Name of the sub:");
    	String input2 = JOptionPane.showInputDialog(this, "Address of the sub:");
    	String input3 = JOptionPane.showInputDialog(this, "Credit card number of the sub:");
    	String input4 = JOptionPane.showInputDialog(this, "Expire month of the card:");
    	String input5 = JOptionPane.showInputDialog(this, "Expire year of the card:");
    	String input6 = JOptionPane.showInputDialog(this, "CCV number of the card:");
    	
    	if (input1 != null && input2 != null && input3 != null && input4 != null && input5 != null && input6 != null){
            int value4 = Integer.parseInt(input4);
    	    int value5 = Integer.parseInt(input5);
    	    int value6 = Integer.parseInt(input6); 
    	    Subscriber sub = new Individual(input1,input2,input3,value4,value5,value6);
            if(distributor.addSubscriber(sub))
            JOptionPane.showMessageDialog(this, sub.toString(), "New Subscriber Added", JOptionPane.INFORMATION_MESSAGE);
            } else {
                System.out.println("Değer girilmedi veya iptal edildi.");
           }
        
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String input1 = JOptionPane.showInputDialog(this, "Name of the corp.sub:");
    	String input2 = JOptionPane.showInputDialog(this, "Address of the sub:");
    	String input3 = JOptionPane.showInputDialog(this, "Bank code of the sub:");
    	String input4 = JOptionPane.showInputDialog(this, "Bank name of the sub:");
    	String input5 = JOptionPane.showInputDialog(this, "Issue day of the sub:");
    	String input6 = JOptionPane.showInputDialog(this, "Issue month of the sub:");
    	String input7 = JOptionPane.showInputDialog(this, "Issue year of the sub:");
    	String input8 = JOptionPane.showInputDialog(this, "Account number of the sub:");
    	
    	if (input1 != null && input2 != null && input3 != null && input4 != null && input5 != null && input6 != null && input7 != null && input8 != null){
           Integer value3 = Integer.parseInt(input3);
    	   Integer value5 = Integer.parseInt(input5);
    	   Integer value6 = Integer.parseInt(input6);
    	   Integer value7 = Integer.parseInt(input7);
    	   Integer value8 = Integer.parseInt(input8);
    	   Subscriber corp = new Corporation(input1,input2,value3,input4,value5,value6,value7,value8);
           if(distributor.addSubscriber(corp))
           JOptionPane.showMessageDialog(this, corp.toString(), "New Subscriber Added", JOptionPane.INFORMATION_MESSAGE);} else {
                System.out.println("Değer girilmedi veya iptal edildi.");
           }
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	String choice = JOptionPane.showInputDialog(this, "Do you want to list all sending orders(1) or all orders that has incomplete payments(2): 1 ya da 2 girin.");
    	String input1 = JOptionPane.showInputDialog(this, "Month:");
    	String input2 = JOptionPane.showInputDialog(this, "Year:");
    	if(input1 != null && input2 != null && choice != null) {
    		Integer value1 = Integer.parseInt(input1);
    		Integer value2 = Integer.parseInt(input2);
            Integer choiceVal = Integer.parseInt(choice);
            String message = "";
            if(choiceVal == 1) {
                message = distributor.listAllSendingOrders(value1, value2);
            } else if(choiceVal == 2) {
                message = distributor.listIncompletePayments(value1, value2);
            }
            
           
            JOptionPane.showMessageDialog(this, message, "List Result", JOptionPane.INFORMATION_MESSAGE);
    	}
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	String input1 = JOptionPane.showInputDialog(this, "ISSN of the journal");
    	String input2 = JOptionPane.showInputDialog(this, "Month:");
    	String input3 = JOptionPane.showInputDialog(this, "Year:");
    	if(input1 != null && input2 != null && input3 != null) {
    		Integer value2 = Integer.parseInt(input2);
    		Integer value3 = Integer.parseInt(input3);
    		String message = "";
    		message = distributor.listSendingOrders(input1, value2, value3);
    		 JOptionPane.showMessageDialog(this, message, "List Result", JOptionPane.INFORMATION_MESSAGE);
    	}
    }                                        

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {                                          
    	String input1 = JOptionPane.showInputDialog(this, "Enter the issn number of the journal");
    	String input2 = JOptionPane.showInputDialog(this, "Enter the name of the subscriber");
        String input3 = JOptionPane.showInputDialog(this, "How much money you want to add:");
        if(input3 != null) {
            Double value3 = Double.parseDouble(input3);
            Journal j1 = distributor.searchJournal(input1);
            Subscriber sub1 = distributor.searchSubscriber(input2);
            for(Subscription subs : j1.subscriptions) {
            	if(subs.getSubscriber().getName() == sub1.getName()) {
            		subs.getPayment().increasePayment(value3);
            	}
            }
        	JOptionPane.showMessageDialog(this, "Payment Succesfull. ","Payment Info", JOptionPane.INFORMATION_MESSAGE);}

    }                                         

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // REPORT
    	String input1 = JOptionPane.showInputDialog(this, "Month:");
    	String input2 = JOptionPane.showInputDialog(this, "Year:");
    	if(input1 != null && input2 != null) {
    		Integer value1 = Integer.parseInt(input1);
    		Integer value2= Integer.parseInt(input2);
    		ReportRunnable reportTask = new ReportRunnable(value1, value2, distributor);
            Thread reportThread = new Thread(reportTask);
            reportThread.start();

            try {
                reportThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
}
    public class ReportRunnable implements Runnable {
        
        private int month;
        private int year;
        private Distributor distributor; 

        public ReportRunnable(int month, int year, Distributor distributor) {
            this.month = month;
            this.year = year;
            this.distributor = distributor;
        }
        @Override
        public void run() {
        	String message = "journalName journalISSN subscriberName subscriberAddress totalPayment startingDate\n";
            message += distributor.report(month,year); 
            String[] lines = message.split("\n");
            String[] columnNames = lines[0].split("\\s+");

            String[][] data = new String[lines.length - 1 + 10][columnNames.length + 10];
            for (int i = 1; i < lines.length; i++) {
                String[] parts = lines[i].split("\\s+");
                for (int j = 0; j < parts.length; j++) {
                    data[i - 1][j] = parts[j];
                }
            }
            DefaultTableModel model = new DefaultTableModel(data, columnNames);
            JTable table = new JTable(model);

            JFrame frame = new JFrame("Report");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            JScrollPane scrollPane = new JScrollPane(table);
            frame.add(scrollPane, BorderLayout.CENTER);
            frame.pack();
            //frame.setLocationRelativeTo(this);
            frame.setVisible(true);  
        }
    }
            
                                        

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // SAVE
    	String filename = "data";
    	distributor.saveState(filename);
    	JOptionPane.showMessageDialog(this, "States Saved!","INFO", JOptionPane.INFORMATION_MESSAGE);
    }                                        

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // LOAD
    	String filename = "data";
    	distributor.loadState(filename);
    	JOptionPane.showMessageDialog(this, "States Loaded!","INFO", JOptionPane.INFORMATION_MESSAGE);
    }                                         

   
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration                   
}
