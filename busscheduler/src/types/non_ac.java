/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package types;
import static busscheduler.book_ticket.t;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author abhinav
 */
public class non_ac extends javax.swing.JFrame {
String busseats="";
String start,stop,d;
int z,y;
   static  ArrayList array,cb;
   
   
  void  change_color(){
       System.out.println("c");
       Iterator it=cb.iterator();
       System.out.println("c");
       while(it.hasNext())
       {
           int v=(Integer)it.next();
           if(v==1)
               b1.setBackground(Color.red);
           else if(v==2)
               b2.setBackground(Color.red);
           else  if(v==3)
               b3.setBackground(Color.red);
           else  if(v==4)
               b4.setBackground(Color.red);
           else  if(v==5)
               b5.setBackground(Color.red);
           else  if(v==6)
               b6.setBackground(Color.red);
           else  if(v==7)
               b7.setBackground(Color.red);
           else  if(v==8)
               b8.setBackground(Color.red);
           else  if(v==9)
               b9.setBackground(Color.red);
           else  if(v==10)
               b10.setBackground(Color.red);
           else  if(v==11)
               b11.setBackground(Color.red);
           else  if(v==12)
               b12.setBackground(Color.red);
           else  if(v==13)
               b13.setBackground(Color.red);
           else  if(v==14)
               b14.setBackground(Color.red);
           else  if(v==15)
               b15.setBackground(Color.red);
           else  if(v==16)
               b16.setBackground(Color.red);
           else  if(v==17)
               b17.setBackground(Color.red);
           else  if(v==18)
               b18.setBackground(Color.red);
           else  if(v==19)
               b19.setBackground(Color.red);
           else  if(v==20)
               b20.setBackground(Color.red);
           else  if(v==21)
               b21.setBackground(Color.red);
           else  if(v==22)
               b22.setBackground(Color.red);
           else  if(v==23)
               b23.setBackground(Color.red);
           else  if(v==24)
               b24.setBackground(Color.red);
           else  if(v==25)
               b25.setBackground(Color.red);
                    
       }
   }
    public non_ac(String q,int io,String w,int ip,String p) {
        try{
        start=q;
        stop=w;
        z=io+1;
        y=ip+1;
        array =new ArrayList<String>();
        for(int o=0;o<26;o++)
            array.add('b');
        cb=new ArrayList();
        db.dbconnect.con1=DriverManager.getConnection("jdbc:sqlite:/home/abhinav/NetBeansProjects/busscheduler/src/db/"+p+".db");
        db.dbconnect.st3=db.dbconnect.con1.createStatement();
        db.dbconnect.st1=db.dbconnect.con1.createStatement();
        
         ResultSet rs=db.dbconnect.st3.executeQuery("select * from non_ac");
         while(rs.next())
        {
            ArrayList vect=new ArrayList();
            vect.add(0,rs.getInt("seats"));
            vect.add(1,rs.getString("Sector_52"));
            vect.add(2,rs.getString("Sector_76"));
            vect.add(3,rs.getString("Sector_101"));
            vect.add(4,rs.getString("Sector_81"));
            vect.add(5,rs.getString("NSEZ"));
            vect.add(6,rs.getString("Sector_145"));
            vect.add(7,rs.getString("Knowledge_Park"));
            vect.add(8,rs.getString("Pari_Chowk"));
            vect.add(9,rs.getString("Alpha_1"));
            vect.add(10,rs.getString("Beta_1"));
            vect.add(11,rs.getString("Delta_1"));
            vect.add(12,rs.getString("Depot_Station"));
            
            for(int i=1;i<=12;i++)
            {
                if(((String)vect.get(i)).equals("a"))
                {  
                    cb.add((Integer)vect.get(0));
                    break;
                }
            }
        }
         
           
        initComponents();
        change_color();
        }catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        b1 = new javax.swing.JToggleButton();
        b2 = new javax.swing.JToggleButton();
        b3 = new javax.swing.JToggleButton();
        b4 = new javax.swing.JToggleButton();
        b5 = new javax.swing.JToggleButton();
        b6 = new javax.swing.JToggleButton();
        b7 = new javax.swing.JToggleButton();
        b8 = new javax.swing.JToggleButton();
        b9 = new javax.swing.JToggleButton();
        b10 = new javax.swing.JToggleButton();
        b11 = new javax.swing.JToggleButton();
        b12 = new javax.swing.JToggleButton();
        b13 = new javax.swing.JToggleButton();
        b14 = new javax.swing.JToggleButton();
        b18 = new javax.swing.JToggleButton();
        b19 = new javax.swing.JToggleButton();
        b20 = new javax.swing.JToggleButton();
        b21 = new javax.swing.JToggleButton();
        b22 = new javax.swing.JToggleButton();
        b23 = new javax.swing.JToggleButton();
        b24 = new javax.swing.JToggleButton();
        b25 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        b15 = new javax.swing.JToggleButton();
        b17 = new javax.swing.JToggleButton();
        b16 = new javax.swing.JToggleButton();
        submit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setText("non_ac");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setText("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        b10.setText("10");
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });

        b11.setText("11");
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });

        b12.setText("12");
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });

        b13.setText("13");
        b13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b13ActionPerformed(evt);
            }
        });

        b14.setText("14");
        b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b14ActionPerformed(evt);
            }
        });

        b18.setText("18");
        b18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b18ActionPerformed(evt);
            }
        });

        b19.setText("19");
        b19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b19ActionPerformed(evt);
            }
        });

        b20.setText("20");
        b20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b20ActionPerformed(evt);
            }
        });

        b21.setText("21");
        b21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b21ActionPerformed(evt);
            }
        });

        b22.setText("22");
        b22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b22ActionPerformed(evt);
            }
        });

        b23.setText("23");
        b23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b23ActionPerformed(evt);
            }
        });

        b24.setText("24");
        b24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b24ActionPerformed(evt);
            }
        });

        b25.setText("25");
        b25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b25ActionPerformed(evt);
            }
        });

        jLabel1.setText("front");

        b15.setText("15");
        b15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b15ActionPerformed(evt);
            }
        });

        b17.setText("17");
        b17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b17ActionPerformed(evt);
            }
        });

        b16.setText("16");
        b16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(b13)
                                .addGap(18, 18, 18)
                                .addComponent(b14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b15))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(b16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b17)
                                .addGap(86, 86, 86)
                                .addComponent(b18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b19)
                                .addGap(18, 18, 18)
                                .addComponent(b20, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(b21)
                                .addGap(18, 18, 18)
                                .addComponent(b22)
                                .addGap(84, 84, 84)
                                .addComponent(b23, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(b2)
                                    .addGap(94, 94, 94)
                                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(b4)
                                    .addGap(18, 18, 18)
                                    .addComponent(b5))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(b7)
                                    .addGap(94, 94, 94)
                                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(b9)
                                    .addGap(18, 18, 18)
                                    .addComponent(b10))))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b21)
                    .addComponent(b22)
                    .addComponent(b23)
                    .addComponent(b24)
                    .addComponent(b25))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b19)
                    .addComponent(b20)
                    .addComponent(b18)
                    .addComponent(b17)
                    .addComponent(b16))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b11)
                    .addComponent(b12)
                    .addComponent(b14)
                    .addComponent(b13)
                    .addComponent(b15))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b7)
                    .addComponent(b6)
                    .addComponent(b8)
                    .addComponent(b9)
                    .addComponent(b10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b2)
                    .addComponent(b1)
                    .addComponent(b3)
                    .addComponent(b4)
                    .addComponent(b5))
                .addGap(18, 18, 18)
                .addComponent(jLabel1))
        );

        submit.setText("submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(submit)
                        .addGap(257, 257, 257))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(submit)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
try{
if(b4.isSelected()&&!b4.getBackground().equals(Color.red))
            array.set(4,'a');
        else
       array.set(4,'b');
}catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_b4ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
try{
if(b9.isSelected()&&!b9.getBackground().equals(Color.red))
            array.set(9,'a');
        else
       array.set(9,'b');
}catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_b9ActionPerformed

    private void b14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b14ActionPerformed
try{
if(b14.isSelected()&&!(b14.getBackground().equals(Color.red)))
            array.set(14,'a');
        else
       array.set(14,'b');
}catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_b14ActionPerformed

    private void b18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b18ActionPerformed
try{
if(b18.isSelected()&&!b18.getBackground().equals(Color.red))
            array.set(18,'a');
        else
       array.set(18,'b');
}catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_b18ActionPerformed

    private void b24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b24ActionPerformed
try{
if(b24.isSelected()&&!b24.getBackground().equals(Color.red))
            array.set(24,'a');
        else
       array.set(24,'b');
}catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_b24ActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        try{  for(int i=0;i<26;i++)
        {  
             if((array.get(i)).equals('a'))
            { busseats+=i+",";
             db.dbconnect.st1.executeUpdate("update non_ac set "+ start+"='a' ,"+stop+"='a' where seats="+i+"");
            }
        }
       
        busseats=busseats.substring(0, busseats.length()-1);
      busscheduler.book_ticket.t=busseats;
        dispose();
      }catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_submitActionPerformed

    private void b25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b25ActionPerformed
try{
if(b25.isSelected()&&!b25.getBackground().equals(Color.red))
            array.set(25,'a');
        else
       array.set(25,'b');
}catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_b25ActionPerformed

    private void b23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b23ActionPerformed
try{
if(b23.isSelected()&&!b23.getBackground().equals(Color.red))
            array.set(23,'a');
        else
       array.set(23,'b');
}catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_b23ActionPerformed

    private void b22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b22ActionPerformed
        try{
if(b22.isSelected()&&!b22.getBackground().equals(Color.red))
            array.set(22,'a');
        else
       array.set(22,'b');
}catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_b22ActionPerformed

    private void b21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b21ActionPerformed
       try{
if(b21.isSelected()&&!b21.getBackground().equals(Color.red))
            array.set(21,'a');
        else
       array.set(21,'b');
}catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_b21ActionPerformed

    private void b20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b20ActionPerformed
        try{
if(b20.isSelected()&&!b20.getBackground().equals(Color.red))
            array.set(20,'a');
        else
       array.set(20,'b');
}catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_b20ActionPerformed

    private void b19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b19ActionPerformed
      try{
if(b19.isSelected()&&!b19.getBackground().equals(Color.red))
            array.set(19,'a');
        else
       array.set(19,'b');
}catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_b19ActionPerformed

    private void b17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b17ActionPerformed
try{
if(b17.isSelected()&&!b17.getBackground().equals(Color.red))
            array.set(17,'a');
        else
       array.set(17,'b');
}catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_b17ActionPerformed

    private void b16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b16ActionPerformed
try{
if(b16.isSelected()&&!b16.getBackground().equals(Color.red))
            array.set(16,'a');
        else
       array.set(16,'b');
}catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_b16ActionPerformed

    private void b15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b15ActionPerformed
try{
if(b15.isSelected()&&!b15.getBackground().equals(Color.red))
            array.set(15,'a');
        else
       array.set(15,'b');
}catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_b15ActionPerformed

    private void b13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b13ActionPerformed
        try{
if(b13.isSelected()&&!b13.getBackground().equals(Color.red))
            array.set(13,'a');
        else
       array.set(13,'b');
}catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_b13ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
       try{
if(b12.isSelected()&&!b12.getBackground().equals(Color.red))
            array.set(12,'a');
        else
       array.set(12,'b');
}catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_b12ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
try{
if(b11.isSelected()&&!b11.getBackground().equals(Color.red))
            array.set(11,'a');
        else
       array.set(11,'b');
}catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_b11ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
try{
if(b10.isSelected()&&!b10.getBackground().equals(Color.red))
            array.set(10,'a');
        else
       array.set(10,'b');
}catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_b10ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
try{
if(b8.isSelected()&&!b8.getBackground().equals(Color.red))
            array.set(8,'a');
        else
       array.set(8,'b');
}catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_b8ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
try{
if(b7.isSelected()&&!b7.getBackground().equals(Color.red))
            array.set(7,'a');
        else
       array.set(7,'b');
}catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_b7ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
try{
if(b6.isSelected()&&!b6.getBackground().equals(Color.red))
            array.set(6,'a');
        else
       array.set(6,'b');
}catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_b6ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
try{
if(b5.isSelected()&&!b5.getBackground().equals(Color.red))
            array.set(5,'a');
        else
       array.set(5,'b');
}catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_b5ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
try{
if(b3.isSelected()&&!b3.getBackground().equals(Color.red))
            array.set(3,'a');
        else
       array.set(3,'b');
}catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_b3ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
try{
if(b2.isSelected()&&!b2.getBackground().equals(Color.red))
            array.set(2,'a');
        else
       array.set(2,'b');
}catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_b2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
try{
if(b1.isSelected()&&!b1.getBackground().equals(Color.red))
            array.set(1,'a');
        else
       array.set(1,'b');
}catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_b1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton b1;
    private javax.swing.JToggleButton b10;
    private javax.swing.JToggleButton b11;
    private javax.swing.JToggleButton b12;
    private javax.swing.JToggleButton b13;
    private javax.swing.JToggleButton b14;
    private javax.swing.JToggleButton b15;
    private javax.swing.JToggleButton b16;
    private javax.swing.JToggleButton b17;
    private javax.swing.JToggleButton b18;
    private javax.swing.JToggleButton b19;
    private javax.swing.JToggleButton b2;
    private javax.swing.JToggleButton b20;
    private javax.swing.JToggleButton b21;
    private javax.swing.JToggleButton b22;
    private javax.swing.JToggleButton b23;
    private javax.swing.JToggleButton b24;
    private javax.swing.JToggleButton b25;
    private javax.swing.JToggleButton b3;
    private javax.swing.JToggleButton b4;
    private javax.swing.JToggleButton b5;
    private javax.swing.JToggleButton b6;
    private javax.swing.JToggleButton b7;
    private javax.swing.JToggleButton b8;
    private javax.swing.JToggleButton b9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}