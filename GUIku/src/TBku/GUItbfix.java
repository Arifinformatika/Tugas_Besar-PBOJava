/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TBku;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;



public class GUItbfix extends JFrame implements ActionListener {
    Analysis g = new Analysis(); 
    
    //Inventaris l = new Inventaris();
	
	private JTabbedPane tabpane;
    JLabel label,label1,label2,label3,label4,label5,label6,label7;
    
    JTextField txtisi,txtisi1,txtisi2,txtisi3,txtisi4 = new JTextField();
    JTextField isitxt, isitxt1, isitxt2, isitxt3,isitxt4,isitxt5,isitxt6,isitxt7,isitxt8,isitxt9,isitxt10,
    isitxt11,isitxt12,isitxt13,isitxt14,isitxt15,isitxt16,isitxt17,isitxt18,isitxt19,isitxt20 = new JTextField();
    JTextField txtis,txtis1,txtis2,txtis3,txtis4,txtis5,txtis6,txtis7 = new JTextField();
    JTextField txt20 = new JTextField();
    JTextField txt21 = new JTextField();
    JTextField txt22 = new JTextField();
    JTextField txt23 = new JTextField();
    JTextField txt24 = new JTextField();
    JTextField txt25 = new JTextField();
    JTextField txt26 = new JTextField();
    JTextField txt27 = new JTextField();
    JTextField txt28 = new JTextField();
    JTextField txt30 = new JTextField();
    JTextField txt29 = new JTextField();
    JTextField txt31 = new JTextField();
    
    JPanel panel,panel1,panel2,panel3,panel4,panel5,panel6,panel7;
     ButtonGroup g1 = new ButtonGroup();
     ButtonGroup g2 = new ButtonGroup();
     ButtonGroup g3 = new ButtonGroup();
     ButtonGroup g4 = new ButtonGroup();
     ButtonGroup g5 = new ButtonGroup();
     ButtonGroup g6 = new ButtonGroup();
     ButtonGroup g7 = new ButtonGroup();
     ButtonGroup g8 = new ButtonGroup();
     ButtonGroup g9 = new ButtonGroup();
     ButtonGroup g10 = new ButtonGroup();
     ButtonGroup g11 = new ButtonGroup();
     ButtonGroup g12 = new ButtonGroup();
     ButtonGroup g13 = new ButtonGroup();
     ButtonGroup g14 = new ButtonGroup();
     ButtonGroup g15 = new ButtonGroup();
     ButtonGroup g16 = new ButtonGroup();
     ButtonGroup g17 = new ButtonGroup();
     ButtonGroup g18 = new ButtonGroup();
     ButtonGroup g19 = new ButtonGroup();
     ButtonGroup g20 = new ButtonGroup();
     ButtonGroup g21 = new ButtonGroup();
     ButtonGroup g22 = new ButtonGroup();
     ButtonGroup g23 = new ButtonGroup();
     ButtonGroup g24 = new ButtonGroup();
     ButtonGroup g25 = new ButtonGroup();
     ButtonGroup g26 = new ButtonGroup();
     ButtonGroup g27 = new ButtonGroup();
    
    JButton button,simpan;
    JButton next7,next,next2,next3,next4,next5,next6;
    
    public GUItbfix(){
        System.out.println("Sistem Kelayakan Kelas");
        tabpane = new JTabbedPane();
        //panel1.setBackground(Color.darkGray);
        label1 = new JLabel("Identitas");
        panel1 = new JPanel();
        panel1.setBorder(new EmptyBorder(8, 8, 8, 8));
		panel1.setLayout(null);
		JTextField idtxt,idtxt1,idtxt2,idtxt3;
		
        JLabel lblnama = new JLabel("Nama Ruangan	:	");
		lblnama.setBounds(40, 50, 150, 52);
		panel1.add(lblnama);
		
		JLabel lblLokasi = new JLabel("Lokasi Ruangan	: ");
		lblLokasi.setBounds(40, 80, 100, 52);
		panel1.add(lblLokasi);
		
		JLabel lblFakultas = new JLabel("Fakultas 	: ");
		lblFakultas.setBounds(40, 110, 70, 52);
		panel1.add(lblFakultas);
		
		JLabel lblProdi = new JLabel("Program study : ");
		lblProdi.setBounds(40, 140, 100, 52);
		panel1.add(lblProdi);
		
		txtisi= new JTextField();
		txtisi.setBounds(165, 65, 120, 25);
		txtisi.setColumns(10);
		panel1.add(txtisi);
		
		txtisi1 = new JTextField();
		txtisi1.setBounds(165, 95, 120, 25);
		txtisi1.setColumns(10);
		panel1.add(txtisi1);
		
		txtisi2 = new JTextField();
		txtisi2.setBounds(165, 125, 120, 25);
		txtisi2.setColumns(10);
		panel1.add(txtisi2);
		
		txtisi3 = new JTextField();
		txtisi3.setBounds(165, 155, 120, 25);
		txtisi3.setColumns(10);
		panel1.add(txtisi3);
		
		
                final JButton next1 = new JButton("Next");
                next1.setBounds(500, 350,120, 25);
                next1.addActionListener(new java.awt.event.ActionListener() {

            
            public void actionPerformed(ActionEvent e) {
            	
               next1.setText("Silahkan klik tab berikutnya");
              
            }
        });
                panel1.add(next1);
		
        tabpane.addTab("Identitas",null,panel1,"Identitas");
        panel1.add(label1,SwingConstants.NORTH);
        tabpane.addTab("Kondisi ",Kondisi());
        tabpane.addTab("Kondisi & Posisi Sarana ", tab2());
        tabpane.addTab("Lingkungan", Lingkungan());
        tabpane.addTab("Kebersihan", Kebersihan());
        tabpane.addTab("Kenyamanan", Kenyamanan());
        tabpane.addTab("Keamanan", Keamanan());
        getContentPane().add(tabpane);
        setSize(700, 500);
        setLocationRelativeTo(null);
        setVisible(true);
        
        
    }
    public static void main(String[] args) {
    	GUItbfix play = new GUItbfix();
        play.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public Component Kondisi(){
        JLabel lbltab4 = new JLabel("Kondisi");
    	JPanel panel8 = new JPanel();
    	panel8.setBorder(new EmptyBorder(5,5,5,5));
    	panel8.setLayout(null);
    	JLabel panjang, lebar, jmlhkursi, jmlhpintu, jmlhjendela;
    	
    	panjang = new JLabel("Panjang Ruangan");
    	panjang.setBounds(40, 40, 150, 60);
    	panel8.add(panjang);
    	
    	isitxt = new JTextField();
    	isitxt.setBounds(200, 50, 75, 27);
    	panel8.add(isitxt);
    	
    	lebar = new JLabel("Lebar Ruangan ");
    	lebar.setBounds(40, 75, 150, 60);
    	panel8.add(lebar);
    	
        jmlhkursi = new JLabel("Jumlah Kursi diruangan ");
    	jmlhkursi.setBounds(40, 110, 200, 60);
    	panel8.add(jmlhkursi);
        
    	jmlhpintu = new JLabel("Jumlah Pintu diruangan ");
    	jmlhpintu.setBounds(40, 145, 200, 60);
    	panel8.add(jmlhpintu);
    	
    	jmlhjendela = new JLabel("Jumlah Jendela diruangan ");
    	jmlhjendela.setBounds(40, 175, 200, 60);
    	panel8.add(jmlhjendela);
    	
    	isitxt1 = new JTextField();
    	isitxt1.setBounds(200, 90, 75, 27);
    	panel8.add(isitxt1);
    	
    	isitxt2 = new JTextField();
    	isitxt2.setBounds(200, 125, 75, 27);
    	panel8.add(isitxt2);
    	
    	isitxt3 = new JTextField();
    	isitxt3.setBounds(200, 160, 75, 27);
    	panel8.add(isitxt3);
    	
        isitxt4 = new JTextField();
    	isitxt4.setBounds(200, 195, 75, 27);
    	panel8.add(isitxt4);
        
    	lbltab4.setBounds(225, 0, 80, 67);
    	panel8.add(lbltab4);
        final JButton next2 = new JButton("Next");
                next2.setBounds(500, 350,120, 25);
                panel8.add(next2);
                next2.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              Inventaris test = new Inventaris();
              test.KondisiKelas(isitxt, isitxt1, isitxt2, isitxt3,isitxt4);
                next2.setText("Silahkan klik tab berikutnya");
            }
        });
        
        
        return panel8;
    }
    
    public Component tab2(){
    	label2 = new JLabel("Panel Ke Tiga");
        panel2 = new JPanel();
        panel2.setBorder(new EmptyBorder(8, 8, 8, 8));
        panel2.setLayout(null);
        panel2.setBackground(Color.GREEN);
        JLabel jmlhsteker, KondisiSteker, posisisteker, jmlhKbelLCD, kondisiKbelLCD, posisikblLCD, jmlhlampu, kondisilampu, posisilampu, jmlhkipas, kondisikipas, posisikipas, jmlhAC, kondisiAC, posisiAC, ssid, banwidht, jmlhCCTV, kondisiCCTV, posisiCCTV;
        
        jmlhsteker = new JLabel("Jumlah Stop Kontak :");
        jmlhsteker.setBounds(40, 50, 200, 58);
        panel2.add(jmlhsteker);
        
        txtis = new JTextField();
        txtis.setBounds(220, 70, 75, 20);
        panel2.add(txtis);
        
        KondisiSteker = new JLabel("Kondisi Stop Kontak :");
        KondisiSteker.setBounds(40, 80, 200, 58);
        panel2.add(KondisiSteker);
        JRadioButton radio1 = new JRadioButton("baik semua");
        radio1.setBounds(220, 100, 100, 20);
        panel2.add(radio1);
        JRadioButton radio2 = new JRadioButton("baik sebagian");
        radio2.setBounds(330, 100, 115, 20);
        panel2.add(radio2);
        JRadioButton radio3 = new JRadioButton("rusak");
        radio3.setBounds(460, 100, 125, 20);
        panel2.add(radio3);
        g1.add(radio1);
        g1.add(radio2);
        g1.add(radio3);
        
        posisisteker = new JLabel("Posisi Stop Kontak :");
        posisisteker.setBounds(40, 110, 200, 58);
        panel2.add(posisisteker);
        JRadioButton radio4 = new JRadioButton("dekat dosen");
        radio4.setBounds(220, 130, 100, 20);
        panel2.add(radio4);
        JRadioButton radio5 = new JRadioButton("di samping");
        radio5.setBounds(330, 130, 115, 20);
        panel2.add(radio5);
        JRadioButton radio6 = new JRadioButton("di belakang");
        radio6.setBounds(460, 130, 125, 20);
        panel2.add(radio6);
        g17.add(radio4);
        g17.add(radio5);
        g17.add(radio6);
        
        jmlhKbelLCD = new JLabel("Jumlah Kabel LCD :");
        jmlhKbelLCD.setBounds(40, 140, 200, 58);
        panel2.add(jmlhKbelLCD);
        txtis1 = new JTextField();
        txtis1.setBounds(220, 160, 80, 20);
        panel2.add(txtis1);
        
        kondisiKbelLCD = new JLabel("Kondisi Kabel LCD :");
        kondisiKbelLCD.setBounds(40, 170, 200, 58);
        panel2.add(kondisiKbelLCD);
        JRadioButton radio7 = new JRadioButton("baik");
        radio7.setBounds(220, 190, 100, 20);
        panel2.add(radio7);
        JRadioButton radio8 = new JRadioButton("baik sebagian");
        radio8.setBounds(330, 190, 115, 20);
        panel2.add(radio8);
        JRadioButton radio9 = new JRadioButton("rusak");
        radio9.setBounds(460, 190, 125, 20);
        panel2.add(radio9);
        g18.add(radio7);
        g18.add(radio8);
        g18.add(radio9);
        
        posisikblLCD = new JLabel("Posisi Kabel LCD :");
        posisikblLCD.setBounds(40, 200, 200, 58);
        panel2.add(posisikblLCD);
        JRadioButton radio10 = new JRadioButton("dekat dosen");
        radio10.setBounds(220, 220, 100, 20);
        panel2.add(radio10);
        JRadioButton radio11 = new JRadioButton("di samping");
        radio11.setBounds(330, 220, 115, 20);
        panel2.add(radio11);
        JRadioButton radio12 = new JRadioButton("di belakang");
        radio12.setBounds(460, 220, 125, 20);
        panel2.add(radio12);
        g19.add(radio10);
        g19.add(radio11);
        g19.add(radio12);
        
        
        jmlhlampu = new JLabel("Jumlah Lampu diruangan :");
        jmlhlampu.setBounds(40, 230, 200, 58);
        panel2.add(jmlhlampu);
        txtis2 = new JTextField();
        txtis2.setBounds(220, 250, 80, 20);
        panel2.add(txtis2);
        kondisilampu = new JLabel("Kondisi Lampu diruangan :");
        kondisilampu.setBounds(40, 260, 200, 58);
        panel2.add(kondisilampu);
        JRadioButton radio13 = new JRadioButton("baik");
        radio13.setBounds(220, 280, 100, 20);
        panel2.add(radio13);
        JRadioButton radio14 = new JRadioButton("baik sebagian");
        radio14.setBounds(330, 280, 115, 20);
        panel2.add(radio14);
        JRadioButton radio15 = new JRadioButton("rusak");
        radio15.setBounds(460, 280, 125, 20);
        panel2.add(radio15);
        g20.add(radio13);
        g20.add(radio14);
        g20.add(radio15);
        
        posisilampu = new JLabel("Posisi Lampu diruangan :");
        posisilampu.setBounds(40, 290, 200, 58);
        panel2.add(posisilampu);
        JRadioButton radio16 = new JRadioButton("atap");
        radio16.setBounds(220, 310, 100, 20);
        panel2.add(radio16);
        JRadioButton radio17 = new JRadioButton("dinding");
        radio17.setBounds(330, 310, 115, 20);
        panel2.add(radio17);
        g21.add(radio16);
        g21.add(radio17);
        
        jmlhkipas = new JLabel("Jumlah Kipas Angin :");
        jmlhkipas.setBounds(40, 320, 200, 58);
        panel2.add(jmlhkipas);
        txtis3 = new JTextField();
        txtis3.setBounds(220, 340, 80, 20);
        panel2.add(txtis3);
        kondisikipas = new JLabel("Kondisi Kipas Angin :");
        kondisikipas.setBounds(40, 350, 200, 58);
        panel2.add(kondisikipas);
        JRadioButton radio19 = new JRadioButton("Di Atap");
        radio19.setBounds(220, 370, 100, 20);
        panel2.add(radio19);
        JRadioButton radio20 = new JRadioButton("Di dinding");
        radio20.setBounds(330, 370, 115, 20);
        panel2.add(radio20);
        
        g22.add(radio19);
        g22.add(radio20);
        
        
        posisikipas = new JLabel("Posisi Kipas Angin :");
        posisikipas.setBounds(40, 380, 200, 58);
        panel2.add(posisikipas);
        JRadioButton radio22 = new JRadioButton("depan");
        radio22.setBounds(220, 400, 100, 20);
        panel2.add(radio22);
        JRadioButton radio23 = new JRadioButton("di samping");
        radio23.setBounds(330, 400, 115, 20);
        panel2.add(radio23);
        JRadioButton radio24 = new JRadioButton("di belakang");
        radio24.setBounds(460, 400, 125, 20);
        panel2.add(radio24);
        g23.add(radio22);
        g23.add(radio23);
        g23.add(radio24);
        
        jmlhAC = new JLabel("Jumlah AC diruangan :");
        jmlhAC.setBounds(40, 410, 200, 58);
        panel2.add(jmlhAC);
        txtis4 = new JTextField();
        txtis4.setBounds(220, 430, 80, 23);
        panel2.add(txtis4);
        
        kondisiAC = new JLabel("Kondisi AC diruangan :");
        kondisiAC.setBounds(40, 440, 200, 58);
        panel2.add(kondisiAC);
        JRadioButton radio25 = new JRadioButton("baik");
        radio25.setBounds(220, 460, 100, 20);
        panel2.add(radio25);
        JRadioButton radio26 = new JRadioButton("baik sebagian");
        radio26.setBounds(330, 460, 115, 20);
        panel2.add(radio26);
        JRadioButton radio27 = new JRadioButton("rusak");
        radio27.setBounds(460, 460, 125, 20);
        panel2.add(radio27);
        g24.add(radio25);
        g24.add(radio26);
        g24.add(radio27);
        
        posisiAC = new JLabel("Posisi AC diruangan :");
        posisiAC.setBounds(40, 470, 200, 58);
        panel2.add(posisiAC);
        JRadioButton radio28 = new JRadioButton("di samping");
        radio28.setBounds(220, 490, 100, 20);
        panel2.add(radio28);
        JRadioButton radio29 = new JRadioButton("di belakang");
        radio29.setBounds(330, 490, 100, 20);
        panel2.add(radio29);
        g25.add(radio28);
        g25.add(radio29);
        
        ssid = new JLabel("Masukkan SSID :");
        ssid.setBounds(40, 500, 200, 58);
        panel2.add(ssid);
        txtis5 = new JTextField();
        txtis5.setBounds(220, 520, 80, 22);
        panel2.add(txtis5);
        
        banwidht = new JLabel("Kecepatan Banwidth :");
        banwidht.setBounds(40, 530, 200, 58);
        panel2.add(banwidht);
        
        txtis6 = new JTextField();
        txtis6.setBounds(220, 550, 80, 22);
        panel2.add(txtis6);
        
        jmlhCCTV = new JLabel("Jumlah CCTV diruangan :");
        jmlhCCTV.setBounds(40, 560, 200, 58);
        panel2.add(jmlhCCTV);
        
        txtis7 = new JTextField();
        txtis7.setBounds(220, 580, 80, 22);
        panel2.add(txtis7);
        
        kondisiCCTV = new JLabel("Kondisi CCTV diruangan :");
        kondisiCCTV.setBounds(40, 590, 200, 58);
        panel2.add(kondisiCCTV);
        JRadioButton radio30 = new JRadioButton("baik");
        radio30.setBounds(220, 610, 100, 20);
        panel2.add(radio30);
        JRadioButton radio31 = new JRadioButton("baik sebagian");
        radio31.setBounds(330, 610, 115, 20);
        panel2.add(radio31);
        JRadioButton radio32 = new JRadioButton("rusak");
        radio32.setBounds(460, 610, 125, 20);
        panel2.add(radio32);
        g26.add(radio30);
        g26.add(radio31);
        g26.add(radio32);
        
        posisiCCTV = new JLabel("Posisi CCTV diruangan :");
        posisiCCTV.setBounds(40, 620, 200, 58);
        panel2.add(posisiCCTV);
        JRadioButton radio33 = new JRadioButton("di depan");
        radio33.setBounds(220, 640, 100, 20);
        panel2.add(radio33);
        JRadioButton radio34 = new JRadioButton("di belakang");
        radio34.setBounds(330, 640, 100, 20);
        panel2.add(radio34);
        g27.add(radio33);
        g27.add(radio34);
        
        
        
        label2.setBounds(200, 10, 80, 66);
        panel2.add(label2);
        final JButton next3 = new JButton("Next");
                next3.setBounds(600, 600,120, 25);
                panel2.add(next3);
                next3.addActionListener(new java.awt.event.ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                 Inventaris sarana = new Inventaris();
                 
                 next3.setText("Silahkan klik tab berikutnya");
                 panel2.add(txt20);
                 txt20.setVisible(false);
                 if(radio1.isSelected()){
                 	txt20.setText(radio1.getText());
                 	
                 }
                 else if(radio2.isSelected()){
                 	txt20.setText(radio2.getText());
                 }
                 else if(radio3.isSelected()){
                	txt20.setText(radio3.getText());
                 }
                 
                 panel2.add(txt21);
                 txt21.setVisible(false);
                 if(radio4.isSelected()){
                 	txt21.setText(radio4.getText());
                 }
                 else if(radio5.isSelected()){
                 	txt21.setText(radio5.getText());
                 }
                 else if (radio6.isSelected()){
                	 txt21.setText(radio6.getText());
                 }
                 g.AnalisaKelistrikan(Integer.parseInt(txtis.getText()),Integer.parseInt(txt20.getText()) ,Integer.parseInt( txt21.getText()));
                 
                 panel2.add(txt22);
                 txt22.setVisible(false);
                 if(radio7.isSelected()){
                 	txt22.setText(radio7.getText());
                 }
                 else if(radio8.isSelected()){
                 	txt22.setText(radio8.getText());
                 }
                 else if (radio9.isSelected()){
                	 txt22.setText(radio9.getText());
                 }
                 
                 panel2.add(txt23);
                 txt23.setVisible(false);
                 if(radio10.isSelected()){
                 	txt23.setText(radio10.getText());
                 }
                 else if(radio11.isSelected()){
                 	txt23.setText(radio11.getText());
                 }
                 else if(radio12.isSelected()){
                 	txt23.setText(radio12.getText());
                 }
                 g.AnalisisLCD(Integer.parseInt(txtis1.getText()), Integer.parseInt(txt22.getText()), Integer.parseInt(txt23.getText()));
                 
                 panel2.add(txt24);
                 txt24.setVisible(false);
                 if(radio13.isSelected()){
                 	txt24.setText(radio13.getText());
                 }
                 else if(radio14.isSelected()){
                 	txt24.setText(radio14.getText());
                 }
                 else if (radio15.isSelected()){
                	txt24.setText(radio15.getText());
                 }
                 
                 if(radio16.isSelected()){
                 	txt25.setText(radio16.getText());
                 }
                 else if(radio17.isSelected()){
                 	txt25.setText(radio17.getText());
                 }
                 g.AnalisisLampu(Integer.parseInt(txtis2.getText()),Integer.parseInt(txt24.getText()),Integer.parseInt(txt25.getText()) );
                 
                 panel2.add(txt26);
                 txt26.setVisible(false);
                 if(radio19.isSelected()){
                 	txt26.setText(radio19.getText());
                 }
                 else if (radio20.isSelected()){
                	txt26.setText(radio20.getText());
                 }
                 
                 panel2.add(txt27);
                 txt27.setVisible(false);
                 if(radio22.isSelected()){
                 	txt27.setText(radio22.getText());
                 }
                 else if(radio23.isSelected()){
                 	txt27.setText(radio23.getText());
                 }
                 else if (radio24.isSelected()){
                	txt27.setText(radio24.getText());
                 }
                 g.AnalisisKipas(Integer.parseInt(txtis3.getText()), Integer.parseInt(txt26.getText()), Integer.parseInt(txt27.getText()));
                 
                 panel2.add(txt28);
                 txt28.setVisible(false);
                 if(radio25.isSelected()){
                 	txt28.setText(radio25.getText());
                 }
                 else if(radio26.isSelected()){
                 	txt28.setText(radio26.getText());
                 }
                 else if (radio27.isSelected()){
                	txt28.setText(radio27.getText());
                 }
                 
                 panel2.add(txt29);
                 txt29.setVisible(false);
                 if(radio28.isSelected()){
                 	txt29.setText(radio28.getText());
                 }
                 else if(radio29.isSelected()){
                 	txt29.setText(radio29.getText());
                 }
                 g.AnalisisAC(Integer.parseInt(txtis4.getText()), Integer.parseInt(txt28.getText()), Integer.parseInt(txt29.getText()));
                 
                 panel2.add(txt30);
                 txt30.setVisible(false);
                 if(radio30.isSelected()){
                 	txt30.setText(radio30.getText());
                 }
                 else if(radio31.isSelected()){
                 	txt30.setText(radio31.getText());
                 }
                 else if (radio32.isSelected()){
                	txt30.setText(radio32.getText());
                 }
                 
                 panel2.add(txt31);
                 txt31.setVisible(false);
                 if(radio33.isSelected()){
                 	txt31.setText(radio33.getText());
                 }
                 else if(radio34.isSelected()){
                 	txt31.setText(radio34.getText());
                 }
                 g.AnalisisCCTV(Integer.parseInt(txtis5.getText()), Integer.parseInt(txt30.getText()), Integer.parseInt(txt31.getText()));
                }
                 
            });
        
		return panel2;
}
    public Component Lingkungan(){
        label4 = new JLabel("Lingkungan");
        panel4 = new JPanel();
        panel4.setBorder(new EmptyBorder(8, 8, 8, 8));
        panel4.setLayout(null);
        panel4.setBackground(Color.GREEN);
        JLabel Lantai, Atap, Dinding ,Pintu, Jendela;
        JRadioButton jatap1, jatap2, jdinding1,jdinding2, jpintu1, jpintu2, Jjendela1, jjendela2, jlantai1,jlantai2;
        
        Lantai = new JLabel("Lantai :");
        Lantai.setBounds(40, 50, 200, 58);
        panel4.add(Lantai);
        
        Atap = new JLabel("Atap :");
        Atap.setBounds(40, 70, 200, 58);
        panel4.add(Atap);
        
        Dinding = new JLabel("Dinding :");
        Dinding.setBounds(40, 90, 200, 58);
        panel4.add(Dinding);
        
        Pintu = new JLabel("Pintu :");
        Pintu.setBounds(40, 110, 200, 58);
        panel4.add(Pintu);
        
        Jendela = new JLabel("Jendela :");
        Jendela.setBounds(40, 130, 200, 58);
        panel4.add(Jendela);
        
        jlantai1 = new JRadioButton("Bersih");
        jlantai1.setBounds(135, 70, 70, 20);
        panel4.add(jlantai1);
        
        jlantai2 = new JRadioButton("Kotor");
        jlantai2.setBounds(260, 70, 100, 20);
        panel4.add(jlantai2);
        g2.add(jlantai1);
        g2.add(jlantai2);
        
        jatap1 = new JRadioButton("Bersih");
        jatap1.setBounds(135, 90, 70, 20);
        panel4.add(jatap1);
        
        jatap2 = new JRadioButton("Kotor");
        jatap2.setBounds(260, 90, 100, 20);
        panel4.add(jatap2);
        g3.add(jatap1);
        g3.add(jatap2);
        
        jdinding1 = new JRadioButton("Bersih");
        jdinding1.setBounds(135, 110, 70, 20);
        panel4.add(jdinding1);
        
        jdinding2 = new JRadioButton("Kotor");
        jdinding2.setBounds(260, 110, 100, 20);
        panel4.add(jdinding2);
        g4.add(jdinding1);
        g4.add(jdinding2);
        
        jpintu1 = new JRadioButton("Bersih");
        jpintu1.setBounds(135, 130, 70, 20);
        panel4.add(jpintu1);
        
        jpintu2 = new JRadioButton("Kotor");
        jpintu2.setBounds(260, 130, 100, 20);
        panel4.add(jpintu2);
        g5.add(jpintu1);
        g5.add(jpintu2);
        
        Jjendela1  = new JRadioButton("Bersih");
        Jjendela1.setBounds(135, 150, 70, 20);
        panel4.add(Jjendela1);
        
        jjendela2 = new JRadioButton("Kotor");
        jjendela2.setBounds(260, 150, 100, 20);
        panel4.add(jjendela2);
        g6.add(Jjendela1);
        g6.add(jjendela2);
        final JButton next4 = new JButton("Next");
                next4.setBounds(500, 350,120, 25);
                panel4.add(next4);
                next4.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                next4.setText("Silahkan klik tab berikutnya ");
                JTextField txt11 = new JTextField();
                panel4.add(txt11);
                txt11.setVisible(false);
                if(jlantai1.isSelected()){
                	txt11.setText(jlantai1.getText());
                }
                else if(jlantai2.isSelected()){
                	txt11.setText(jlantai2.getText());
                }
                JTextField txt12 = new JTextField();
                panel4.add(txt12);
                txt12.setVisible(false);
                if(jatap1.isSelected()){
                	txt12.setText(jatap1.getText());
                }
                else if(jatap2.isSelected()){
                	txt12.setText(jatap2.getText());
                }
                JTextField txt13 = new JTextField();
                panel4.add(txt13);
                txt13.setVisible(false);
                if(jdinding1.isSelected()){
                	txt13.setText(jdinding1.getText());
                }
                else if(jdinding2.isSelected()){
                	txt13.setText(jdinding2.getText());
                }
                JTextField txt14 = new JTextField();
                panel4.add(txt14);
                txt14.setVisible(false);
                if(jpintu1.isSelected()){
                	txt14.setText(jpintu1.getText());
                }
                else if(jpintu2.isSelected()){
                	txt14.setText(jpintu2.getText());
                }
                JTextField txt15 = new JTextField();
                panel4.add(txt15);
                txt15.setVisible(false);
                if(Jjendela1.isSelected()){
                	txt15.setText(Jjendela1.getText());
                }
                else if(jjendela2.isSelected()){
                	txt15.setText(jjendela2.getText());
                }
                g.AnalisisKebersihan(txt11.getText(), txt12.getText(), txt13.getText(), txt14.getText(), txt15.getText());
            }
        });
        return panel4;
        
    }
    public Component Kebersihan(){
        label5 = new JLabel("Kebersihan");
        panel5 = new JPanel();
        panel5.setBorder(new EmptyBorder(8, 8, 8, 8));
        panel5.setLayout(null);
        panel5.setBackground(Color.GREEN);
        JLabel SirkulasiUdara, NilaiPencahayaan, Kelembapan, Suhu;
         JRadioButton button1,button2;
         
        SirkulasiUdara = new JLabel("SirkulasiUdara :");
        SirkulasiUdara.setBounds(40, 50, 200, 58);
        panel5.add(SirkulasiUdara);
        button1 = new JRadioButton("Lancar ");
        button1.setBounds(160, 70, 70, 20);
        button2 = new JRadioButton("Tidak Lancar");
        button2.setBounds(290, 70, 100, 20);
        panel5.add(button1);
        panel5.add(button2);
        g7.add(button1);
        g7.add(button2);
        
        NilaiPencahayaan = new JLabel("Nilai Pencahayaan :");
        NilaiPencahayaan.setBounds(40, 80, 200, 58);
        panel5.add(NilaiPencahayaan);
        JTextField txtisi = new JTextField();
        txtisi.setBounds(160, 100, 100, 20);
        panel5.add(txtisi);
        
        Kelembapan = new JLabel("Kelembapan :");
        Kelembapan.setBounds(40, 110, 200, 58);
        panel5.add(Kelembapan);
        JTextField txtisi1 = new JTextField();
        txtisi1.setBounds(160, 130, 100, 20);
        panel5.add(txtisi1);
        
        Suhu = new JLabel("Suhu :");
        Suhu.setBounds(40, 140, 200, 58);
        panel5.add(Suhu);
        JTextField txtisi2 = new JTextField();
        txtisi2.setBounds(160, 160, 100, 20);
        panel5.add(txtisi2);
        final JButton next5 = new JButton("Next");
                next5.setBounds(500, 350,120, 25);
                next5.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                next5.setText("Silahkan klik tab berikutnya");
                panel5.add(isitxt13);
                isitxt13.setVisible(false);
                if(button1.isSelected()){
                	isitxt13.setText(button1.getText());
                }
                else if(button2.isSelected()){
                	isitxt13.setText(button2.getText());
                }
                g.AnalisisSirkulasiUdara(isitxt13.getText());
                g.AnalisisPencahayaan(Integer.parseInt(txtisi.getText()));
                g.AnalisisKelembapan(Integer.parseInt(txtisi1.getText()));
                g.AnalisisSuhu(Integer.parseInt(txtisi2.getText()));
            }
        });
                panel5.add(next5);
        
        return panel5;
    }
    public Component Kenyamanan(){
        label6 = new JLabel("Kenyamanan");
        panel6 = new JPanel();
        panel6.setBorder(new EmptyBorder(8, 8, 8, 8));
        panel6.setLayout(null);
        panel6.setBackground(Color.GREEN);
        JLabel Kebisingan, Bau, Kebocoran ,Kerusakan, Keausan;
        JRadioButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button10;
        
        Kebisingan = new JLabel("Kebisingan :");
        Kebisingan.setBounds(40, 50, 200, 58);
        panel6.add(Kebisingan);
        button1 = new JRadioButton("Bising ");
        button1.setBounds(150, 70, 70, 20);
        button2 = new JRadioButton("Tidak Bising");
        button2.setBounds(290, 70, 100, 20);
        panel6.add(button1);
        panel6.add(button2);
        g8.add(button1);
        g8.add(button2);
        
        Bau = new JLabel("Bau :");
        Bau.setBounds(40, 80, 200, 58);
        panel6.add(Bau);
        button3 = new JRadioButton("Bau");
        button3.setBounds(150, 100, 70, 20);
        button4 = new JRadioButton("Tidak Bau");
        button4.setBounds(290, 100, 100, 20);
        panel6.add(button3);
        panel6.add(button4);
        g9.add(button3);
        g9.add(button4);
        
        Kebocoran = new JLabel("Kebocoran : ");
        Kebocoran.setBounds(40, 110, 200, 58);
        panel6.add(Kebocoran);
        button5 = new JRadioButton("Bocor");
        button5.setBounds(150, 130, 70, 20);
        button6 = new JRadioButton("Tidak Bocor");
        button6.setBounds(290, 130, 100, 20);
        panel6.add(button5);
        panel6.add(button6);
        g10.add(button5);
        g10.add(button6);
        
        Kerusakan = new JLabel("Kerusakan :");
        Kerusakan.setBounds(40, 140, 200, 58);
        panel6.add(Kerusakan);
        button7 = new JRadioButton("Rusak");
        button7.setBounds(150, 160, 70, 20);
        button8 = new JRadioButton("Tidak Rusak");
        button8.setBounds(290, 160, 100, 20);
        panel6.add(button7);
        panel6.add(button8);
        g11.add(button7);
        g11.add(button8);
        
        
        
        Keausan = new JLabel("Keausan :");
        Keausan.setBounds(40, 170, 200, 58);
        panel6.add(Keausan);
        button9 = new JRadioButton("Rusak");
        button9.setBounds(150, 190, 70, 20);
        button10 = new JRadioButton("Tidak Rusak");
        button10.setBounds(290, 190, 100, 20);
        panel6.add(button9);
        panel6.add(button10);
        g12.add(button9);
        g12.add(button10);
        
        final JButton next6 = new JButton("Next");
                next6.setBounds(500, 350,120, 25);
                panel6.add(next6);
                next6.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                next6.setText("Silahkan klik tab berikutnya");
                JTextField txt14 = new JTextField();
                panel6.add(txt14);
                txt14.setVisible(false);
                if(button1.isSelected()){
                	isitxt14.setText(button1.getText());
                }
                else if(button2.isSelected()){
                	isitxt14.setText(button2.getText());
                }
                g.AnalisisKebisingan(txt14.getText());
                JTextField txt15 = new JTextField();
                if(button3.isSelected()){
                	isitxt15.setText(button3.getText());
                }
                else if(button4.isSelected()){
                	isitxt15.setText(button4.getText());
                }
                g.AnalisisBau(isitxt15.getText());
                JTextField txt16 = new JTextField();
                if(button5.isSelected()){
                	isitxt16.setText(button5.getText());
                }
                else if(button6.isSelected()){
                	isitxt16.setText(button6.getText());
                }
                g.AnalisisKebocoran(isitxt16.getText());
                JTextField txt17 = new JTextField();
                if(button7.isSelected()){
                	isitxt17.setText(button7.getText());
                }
                else if(button8.isSelected()){
                	isitxt17.setText(button8.getText());
                }
                g.AnalisisKerusakan(isitxt17.getText());
                JTextField txt18 = new JTextField();
                if(button9.isSelected()){
                	isitxt18.setText(button9.getText());
                }
                else if(button10.isSelected()){
                	isitxt18.setText(button10.getText());
                }
                g.AnalisisKeausan(isitxt18.getText());
            }
        });
        return panel6;
    }
    public Component Keamanan(){
        label7 = new JLabel("Keamanan");
        panel7 = new JPanel();
        panel7.setBorder(new EmptyBorder(8, 8, 8, 8));
        panel7.setLayout(null);
        panel7.setBackground(Color.GREEN);
        JLabel Kekokohan, KunciPintu,KunciJendela,Bahaya;
        
        JRadioButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11;
        Kekokohan = new JLabel("Kekokohan :");
        Kekokohan.setBounds(40, 50, 200, 58);
        panel7.add(Kekokohan);
        button1 = new JRadioButton("Kokoh ");
        button1.setBounds(150, 70, 70, 20);
        
        button2 = new JRadioButton("Tidak Kokoh");
        button2.setBounds(290, 70, 100, 20);
        panel7.add(button1);
        panel7.add(button2);
        g13.add(button1);
        g13.add(button2);
        

        isitxt5 = new JTextField();
        isitxt5.setBounds(545, 70, 25, 20);
    	panel7.add(isitxt5);
    	isitxt5.setVisible(false);
    	
        
        KunciPintu = new JLabel("Kunci Pintu :");
        KunciPintu.setBounds(40, 80, 200, 58);
        panel7.add(KunciPintu);
        button3 = new JRadioButton("Ada");
        button3.setBounds(150, 100, 70, 20);
        button4 = new JRadioButton("Rusak");
        button4.setBounds(290, 100, 70, 20);
        button5 = new JRadioButton("Tidak Ada");
        button5.setBounds(430, 100, 100, 20);
        panel7.add(button3);
        panel7.add(button4);
        panel7.add(button5);
        g14.add(button3);
        g14.add(button4);
        g14.add(button5);
        
        isitxt6 = new JTextField();
        isitxt6.setBounds(545, 100, 25, 20);
    	panel7.add(isitxt6);
    	isitxt6.setVisible(false);
        
        KunciJendela = new JLabel("Kunci jendela :");
        KunciJendela.setBounds(40, 110, 200, 58);
        panel7.add(KunciJendela);
        button7 = new JRadioButton("Ada");
        button7.setBounds(150, 130, 70, 20);
        button8 = new JRadioButton("Rusak");
        button8.setBounds(290, 130, 70, 20);
        button9 = new JRadioButton("Tidak Ada");
        button9.setBounds(430, 130, 100, 20);
        panel7.add(button7);
        panel7.add(button8);
        panel7.add(button9);
        g15.add(button7);
        g15.add(button8);
        g15.add(button9);
        
        isitxt7 = new JTextField();
        isitxt7.setBounds(545, 130, 25, 20);
    	panel7.add(isitxt7);
    	isitxt7.setVisible(false);
    	
        
        
        Bahaya = new JLabel("Bahaya :");
        Bahaya.setBounds(40, 140, 200, 58);
        panel7.add(Bahaya);
        button10 = new JRadioButton("Bahaya");
        button10.setBounds(150, 160, 70, 20);
        button11 = new JRadioButton("Tidak Bahaya");
        button11.setBounds(290, 160, 110, 20);
        panel7.add(button10);
        panel7.add(button11);
        g16.add(button10);
        g16.add(button11);
        
        
        isitxt8 = new JTextField();
        isitxt8.setBounds(545, 160, 25, 20);
    	panel7.add(isitxt8);
    	isitxt8.setVisible(false);
    	
    	/*JButton saving = new JButton("Save");
    	saving.setBounds(650, 350, 120, 25);
    	panel.add(saving);
    	saving.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				save.simpan();
				
			}
		});*/
    	
    	JButton hasil = new JButton("Hasil");
    	hasil.setBounds(580, 350, 120, 26);
    	panel7.add(hasil);
    	hasil.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showInternalMessageDialog(null, g.persentaseKesesuaian());
				
				
			}
		});
    	
        
        final JButton next7 = new JButton("Next");
                next7.setBounds(500, 350,120, 25);
                panel7.add(next7);
                next7.addActionListener(new java.awt.event.ActionListener () {
                	public void actionPerformed(java.awt.event.ActionListener  evt) {
                	//KeamananActionPerformed(evt);
            }

					@Override
					public void actionPerformed(ActionEvent e) {
						if(button1.isSelected()){
				        	isitxt5.setText("kokoh");
				        	g.AnalisisKekokohan(button1.getText());
				        	//JOptionPane.showMessageDialog(null, isitxt5.getText());	
				        }
				        else if(button2.isSelected()){
				        	isitxt5.setText("tidak kokoh");
				        }
						if(button7.isSelected()){
				            isitxt7.setText("ada");
				        }
				        else if(button8.isSelected()){
				            isitxt7.setText("rusak");
				        }
				        else if(button9.isSelected()){
				        	isitxt7.setText("tidak ada");
				        }
						g.AnalisisKunciPintu(isitxt7.getText());
						if(button3.isSelected()){
				        	isitxt6.setText(button3.getText());
				        }
				        else if(button4.isSelected()){
				        	isitxt6.setText(button.getText());
				        }
				        else if(button5.isSelected()){
				        	isitxt6.setText(button.getText());
				        }
						g.AnalisisKunciJendela(isitxt6.getText());
						if(button10.isSelected()){
				            isitxt8.setText(button10.getText());
				        }
				        else if(button11.isSelected()){
				            isitxt8.setText(button11.getText());
				        }
						g.AnalisisKeamananRuang(isitxt8.getText());
											}
					
                });

        return panel7;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        next.setText("Silahkan anda klik tab berikutnya");
        //l.simpan();
    }



}

