package TBku;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;



public class Inventaris {
	Scanner in = new Scanner(System.in);
	RuangKelas Kelas = new RuangKelas();
	GUItbfix tb = new GUItbfix();
        //Analysis a = new Analysis();
        RuangKelas Cls;
        
        public Inventaris(JTextField namaruang, JTextField lokasiruang, JTextField fakultas, JTextField studi){
                Kelas.setNamaruang(namaruang.getText());
                Kelas.setLokasiruang(lokasiruang.getText());
                Kelas.setFakultas(fakultas.getText());
                Kelas.setStudi(studi.getText());
                Cls = new RuangKelas(Kelas.getNamaruang(),Kelas.getLokasiruang(),Kelas.getFakultas(),Kelas.getStudi());
        }
        public void Insertdata(JTextField a,JTextField b,JTextField c,JTextField d ) {
		//System.out.println("Masukkan Identitas : (nama ruangan, lokasi ruangan, fakultas, Prodi)");
		Kelas.setIdentitas(in.next(), in.next(), in.next(), in.next());
                Kelas.setNamaruang(a.getText());
                Kelas.setLokasiruang(b.getText());
                Kelas.setFakultas(c.getText());
                Kelas.setStudi(d.getText());

	}

	public Inventaris(JTextField PanjangRuang, JTextField LebarRuang, JTextField JumlahKursi, JTextField JumlahPintu, JTextField JumlahJendela){
                Kelas.setPanjangRuang(Integer.parseInt(PanjangRuang.getText()));
                Kelas.setLebarRuang(Integer.parseInt(LebarRuang.getText()));
                Kelas.setJumlahKursi(Integer.parseInt(JumlahKursi.getText()));
                Kelas.setJumlahPintu(Integer.parseInt(JumlahPintu.getText()));
                Kelas.setJumlahJendela(Integer.parseInt(JumlahJendela.getText()));
                Cls = new RuangKelas(Kelas.getPanjangRuang(),Kelas.getLebarRuang(),Kelas.getJumlahKursi(),Kelas.getJumlahPintu(),Kelas.getJumlahJendela()); 
        }
        
	public void KondisiKelas(JTextField a,JTextField b, JTextField c, JTextField d,JTextField e) {
		//System.out.println("Kondisi Ruang Kelas\n");
		//System.out.println("Masukkan panjang ruangan : ");
		Kelas.setPanjangRuang(Integer.parseInt(a.getText()));
		//System.out.println("\n");
		//System.out.println("Masukkan lebar ruangan : ");
		Kelas.setLebarRuang(Integer.parseInt(b.getText()));
		//System.out.println("\n");
		//System.out.println("masukan jumlah kursi : ");
		Kelas.setJumlahKursi(Integer.parseInt(c.getText()));
		//System.out.println("\n");
		//System.out.println("Masukkan jumlah pintu : ");
		Kelas.setJumlahPintu(Integer.parseInt(d.getText()));
		//System.out.println("\n");
		//System.out.println("Masukkan jumlah jendela : ");
		Kelas.setJumlahJendela(Integer.parseInt(e.getText()));
		//System.out.println("\n");

	}
        
        public Inventaris(JTextField Jumlahstopkontak, JRadioButton BaikSemua,JRadioButton BaikSebagian,JRadioButton Rusak, JRadioButton Dekatdosen,JRadioButton Disamping,JRadioButton Dibelakang,
                JTextField JumlahkabelLCD, JRadioButton BaikSemua1, JRadioButton BaikSebagian1, JRadioButton Rusak1, JRadioButton Dekatdosen1,JRadioButton Disamping1,JRadioButton Dibelakang1, 
                JTextField Jumlahlampu, JRadioButton BaikSemua2,JRadioButton BaikSebagian2,JRadioButton Rusak2, JRadioButton Atap, JRadioButton dinding,
                JTextField jumlahkipas, JRadioButton BaikSemua3,JRadioButton BaikSebagian3,JRadioButton Rusak3, JRadioButton Atap1, JRadioButton dinding1,
                JTextField jumlahAC, JRadioButton BaikSemua4,JRadioButton BaikSebagian4,JRadioButton Rusak4, JRadioButton Depan1,JRadioButton Disamping2,JRadioButton Dibelakang2,
                JTextField SSID, JTextField Bandwidth,
                JTextField jumlahCCTV, JRadioButton depan, JRadioButton disamping,JRadioButton dibelakang, JRadioButton BaikSemua6,JRadioButton BaikSebagian6,JRadioButton Rusak6){
               
                Kelas.setJumlahstopkontak(Integer.parseInt(Jumlahstopkontak.getText()));
                if(BaikSemua.isSelected()){
                    Kelas.setKondisistopkontak(Integer.parseInt("Baik Semua"));
                }else if(BaikSebagian.isSelected()){
                    Kelas.setKondisistopkontak(Integer.parseInt("Baik Sebagian"));
                }else if(Rusak.isSelected()){
                    Kelas.setKondisistopkontak(Integer.parseInt("Rusak"));
                }
                if(Dekatdosen.isSelected()){
                    Kelas.setPosisistopkontak(Integer.parseInt("Didekat Dosen"));
                }else if(Disamping.isSelected()){
                    Kelas.setPosisistopkontak(Integer.parseInt("Di samping"));
                }else if(Dibelakang.isSelected()){
                    Kelas.setPosisistopkontak(Integer.parseInt("Di Belakang"));
                }
                Kelas.setKabelLCD(Integer.parseInt(JumlahkabelLCD.getText()));
                if(BaikSemua1.isSelected()){
                    Kelas.setKondisikabelLCD(Integer.parseInt("Baiik Semua"));
                }else if(BaikSebagian1.isSelected()){
                    Kelas.setKondisikabelLCD(Integer.parseInt("Baik Sebagian"));
                }else if(Rusak1.isSelected()){
                    Kelas.setKondisikabelLCD(Integer.parseInt("Rusak"));
                }
                if(Dekatdosen.isSelected()){
                    Kelas.setPosisikabelLCD(Integer.parseInt("Didekat Dosen"));
                }else if(Disamping1.isSelected()){
                    Kelas.setPosisikabelLCD(Integer.parseInt("Di samping"));
                }else if(Dibelakang1.isSelected()){
                    Kelas.setPosisikabelLCD(Integer.parseInt("Di Belakang"));
                }
                Kelas.setJumlahlampu(Integer.parseInt(Jumlahlampu.getText()));
                if(BaikSemua2.isSelected()){
                    Kelas.setKondisilampu(Integer.parseInt("Baik Semua"));
                }else if(BaikSebagian2.isSelected()){
                    Kelas.setKondisilampu(Integer.parseInt("Baik Sebagian"));
                }else if(Rusak2.isSelected()){
                    Kelas.setKondisilampu(Integer.parseInt("Rusak"));
                }
                if(Atap.isSelected()){
                    Kelas.setPosisilampu(Integer.parseInt("Di atap"));
                }else if(dinding.isSelected()){
                    Kelas.setPosisilampu(Integer.parseInt("Di dinding"));
                }
                Kelas.setJumlahkipasangin(Integer.parseInt(jumlahkipas.getText()));
                if(BaikSemua4.isSelected()){
                    Kelas.setKondisikipasangin(Integer.parseInt("Baik Semua"));
                }else if(BaikSebagian4.isSelected()){
                    Kelas.setKondisikipasangin(Integer.parseInt("Baik Sebagian"));
                }else if(Rusak4.isSelected()){
                    Kelas.setKondisikipasangin(Integer.parseInt("Rusak"));
                }
                if(Atap1.isSelected()){
                    Kelas.setPosisikipasangin(Integer.parseInt("Di atap"));
                }else if(dinding1.isSelected()){
                    Kelas.setPosisikipasangin(Integer.parseInt("Di dinding"));
                }
                Kelas.setJumlahAC(Integer.parseInt(jumlahAC.getText()));
                if(BaikSemua3.isSelected()){
                    Kelas.setKondisiAC(Integer.parseInt("Baik Semua"));
                }else if(BaikSebagian3.isSelected()){
                    Kelas.setKondisiAC(Integer.parseInt("Baik Sebagian"));
                }else if(Rusak3.isSelected()){
                    Kelas.setKondisiAC(Integer.parseInt("Rusak"));
                }
                if(Depan1.isSelected()){
                    Kelas.setPosisiAC(Integer.parseInt("Di depan"));
                }else if(Disamping1.isSelected()){
                    Kelas.setPosisiAC(Integer.parseInt("Di Samping"));
                }else if(Dibelakang1.isSelected()){
                    Kelas.setPosisiAC(Integer.parseInt("Di Belakang"));
                }
                Kelas.setSSID(Integer.parseInt(SSID.getText()));
                Kelas.setBandwidth(Integer.parseInt(Bandwidth.getText()));
                Kelas.setJumlahCCTV(Integer.parseInt(jumlahCCTV.getText()));
                if(BaikSemua6.isSelected()){
                    Kelas.setKondisiCCTV(Integer.parseInt("Baik Semua"));
                }else if(BaikSebagian6.isSelected()){
                    Kelas.setKondisiAC(Integer.parseInt("Baik Sebagian"));
                }else if(Rusak6.isSelected()){
                    Kelas.setKondisiCCTV(Integer.parseInt("Rusak"));
                }
                if(depan.isSelected()){
                    Kelas.setPosisiCCTV(Integer.parseInt("Di depan"));
                }else if(Disamping2.isSelected()){
                    Kelas.setPosisiCCTV(Integer.parseInt("Di Samping"));
                }else if(Dibelakang2.isSelected()){
                    Kelas.setPosisiCCTV(Integer.parseInt("Di Belakang"));
                }
        }

	//@Override
	public void JmlhKondisiPosisiSarana(JTextField a, JTextField b, JTextField c) {
		//System.out.println("Masukkan jumlah steker diruangan : ");
		Kelas.setJumlahstopkontak(Integer.parseInt(a.getText()));
		//System.out.println("\n");
		//System.out.println("Pilih kondisi steker yang ada di ruangan : \n1. baik \n 2. sebagian rusak \n 3. rusak semua \n4. tidak ada");
		Kelas.setKondisistopkontak(Integer.parseInt(b.getText()));
		//System.out.println("\n");
		//System.out.println("Masukkan posisi steker : \n1.dipojok ruang&dekat dosen \n2. ditengah ruang ");
		Kelas.setPosisistopkontak(Integer.parseInt(c.getText()));
		//System.out.println("\n");
		//System.out.println("Masukkan jumlah kabel LCD : ");
		Kelas.setKabelLCD(in.nextInt());
		//System.out.println("\n");
		//System.out.println("Pilih Kondisi Kabel LCD : \n1. berfungsi \n2. rusak sebagian \n3. rusak semua \n4. tidak ada");
		Kelas.setKondisikabelLCD(in.nextInt());
		//System.out.println("\n");
		//System.out.println("Dimana letak/posisi kabel LCD : \n1. dekat dosen \n2. dekat mahasiswa");
		Kelas.setPosisikabelLCD(in.nextInt());
		//System.out.println("\n");
		//System.out.println("Masukkan jumlah lampu diruangan : ");
		Kelas.setJumlahlampu(in.nextInt());
		//System.out.println("\n");
		//System.out.println("Pilih Kondisi lampu diruangan : \n 1. berfungsi semua \n2. rusak sebagian \n3. rusak semua \n4. tidak ada");
		Kelas.setKondisilampu(in.nextInt());
		//System.out.println("\n");
		//System.out.println("Dimana letak/posisi lampu : \n 1.atap \n 2. dinding \n3. lampu meja ");
		Kelas.setPosisilampu(in.nextInt());
		//System.out.println("\n");
		//System.out.println("Masukkan jumlah kipas angin yang ada diruangan : ");
		Kelas.setJumlahkipasangin(in.nextInt());
		//System.out.println("\n");
		//System.out.println("Pilih kondisi kipas angin : \n.1. baik semua \n2. rusak sebagian \n3. rusak semua \n4. tidak ada");
		Kelas.setKondisilampu(in.nextInt());
		//System.out.println("\n");
		//System.out.println("Dimana letak/posisi dari kipas angin : \n1. atap \n2. dinding \n3. kipas berdiri");
		Kelas.setPosisikipasangin(in.nextInt());
		//System.out.println("\n");
		//System.out.println("Masukkan jumlah AC dalam ruangan : ");
		Kelas.setJumlahAC(in.nextInt());
		//System.out.println("\n");
		//System.out.println("Pilih Kondisi AC dalam ruangan : \n1. baik \n2. rusak sebagian \n3. rusak semua \n4. tidak ada");
		Kelas.setKondisiAC(in.nextInt());
		//System.out.println("\n");
		//System.out.println("Dimana letak/posisi dari AC diruangan : \n1. dibelakang \n2. samping \n3. depan");
		Kelas.setPosisiAC(in.nextInt());
		//System.out.println("\n");
		//System.out.println("Pilih SSID yang di gunakan : \n1. UMM Hotspot \n2. Lab informatika ");
		Kelas.setSSID(in.nextInt());
		//System.out.println("\n");
		//System.out.println("Apaka anda bisa Login : \n1. Ya \n2. Tidak");
		Kelas.setLogin(in.nextInt());
		//System.out.println("\n");
		//System.out.println("Masukkan jumlah Bandwidth : ");
		Kelas.setBandwidth(in.nextInt());
		//System.out.println("\n");
		//System.out.println("Masukkan jumlah CCTV diruangan : ");
		Kelas.setJumlahCCTV(in.nextInt());
		//System.out.println("\n");
		//System.out.println("Pilih kondisi CCTV diruangan : \n1. baik \n2. rusak sebagian \n3.rusak semua \n4. tidak ada");
		Kelas.setKondisiCCTV(in.nextInt());
		//System.out.println("\n");
		//System.out.println("DImana letal/posisi dari CCTV diruangan : \n1. depan \n2. samping \n3. belakangan \n4. tidak ada");
		Kelas.setPosisiCCTV(in.nextInt());
		//System.out.println("\n");
	}
        
        public Inventaris(JRadioButton Bersih, JRadioButton Kotor, JRadioButton Bersih1, JRadioButton Kotor1, JRadioButton Bersih2, JRadioButton Kotor2, JRadioButton Bersih3, JRadioButton Kotor3, JRadioButton Bersih4, JRadioButton Kotor4){
                if(Bersih.isSelected()){
                    Kelas.setKondisilantai("Bersih");
                }
                else if(Kotor.isSelected()){
                    Kelas.setKondisilantai("Kotor");
                }
                if(Bersih1.isSelected()){
                    Kelas.setKondisidinding("Bersih");
                }
                else if(Kotor1.isSelected()){
                    Kelas.setKondisidinding("Kotor");
                }
                if(Bersih2.isSelected()){
                    Kelas.setKondisiatap("Bersih");
                }
                else if(Kotor2.isSelected()){
                    Kelas.setKondisiatap("Kotor");
                }
                if(Bersih3.isSelected()){
                    Kelas.setKondisipintu("Bersih");
                }
                else if(Kotor3.isSelected()){
                    Kelas.setKondisipintu("Kotor");
                }
                if(Bersih4.isSelected()){
                    Kelas.setKondisijendela("Bersih");
                }
                else if(Kotor4.isSelected()){
                    Kelas.setKondisijendela("Kotor");
                }
                Cls = new RuangKelas(Kelas.getKondisilantai(),Kelas.getKondisidinding(),Kelas.getKondisiatap(),Kelas.getKondisipintu(),Kelas.getKondisijendela());
        }
        
	/*@Override
	public void LingkunganRuangKelas() {
		System.out.println("Kondisi lantai diruangan : \n1. bersih \n2. kotor");
		super.setKondisilantai(in.nextInt());
		System.out.println("\n");
		System.out.println("Kondisi dinding diruangan : \n1. bersih \n2. kotor");
		super.setKondisidinding(in.nextInt());
		System.out.println("\n");
		System.out.println("Kondisi Atap diruangan : \n1. bersih \n2. kotor");
		super.setKondisiatap(in.nextInt());
		System.out.println("\n");
		System.out.println("Kondisi pintu diruangan : \n1. bersih \n2. kotor");
		super.setKondisipintu(in.nextInt());
		System.out.println("\n");
		System.out.println("Kondisi Jendela diruangan : \n1. bersih \n2. kotor");
		super.setKondisijendela(in.nextInt());
		System.out.println("\n");
	}*/
        
        public Inventaris(JRadioButton Lancar,JRadioButton TidakLancar, JTextField Nilaipencahayaan, JTextField Kelembapan, JTextField Suhu){
                if(Lancar.isSelected()){
                    Kelas.setSirkulasiudara("Lancar");
                }
                else if(TidakLancar.isSelected()){
                    Kelas.setSirkulasiudara("Tidak Lancar");
                }
                Kelas.setNilaipencahayaan(Integer.parseInt(Nilaipencahayaan.getText()));
                Kelas.setKelembapan(Integer.parseInt(Kelembapan.getText()));
                Kelas.setSuhu(Integer.parseInt(Suhu.getText()));
                Cls = new RuangKelas(Kelas.getSirkulasiudara(),Kelas.getNilaipencahayaan(),Kelas.getKelembapan(),Kelas.getSuhu());
        }
	
        /*@Override
	public void KebersihanRuangKelas() {
		System.out.println("Konisi sirkulasi udara : \n1. lancar \n2. tidak lancar");
		super.setSirkulasiudara(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan nilai pencahayaan : ");
		super.setNilaipencahayaan(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan berapa kelembapan diruangan : ");
		super.setKelembapan(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan berapa suhu dalam ruangan : ");
		super.setSuhu(in.nextInt());
		System.out.println("\n");
	}*/
        
        public Inventaris(JRadioButton Bising, JRadioButton TidakBising, JRadioButton Bau, JRadioButton TidakBau, JRadioButton Bocor, JRadioButton TidakBocor, JRadioButton Rusak, JRadioButton TidakRusak, JRadioButton Aus, JRadioButton TidakAus,String a){
            
            Inventaris tese =  new Inventaris();
            
               //tese.AnalisisKebisingan();
               
               
            if(Bising.isSelected()){
                    Kelas.setKebisingan("Bising");
                }
                else if(TidakBising.isSelected()){
                    Kelas.setKebisingan("Tidak Bising");
                }
                if(Bau.isSelected()){
                    Kelas.setBau("Bau");
                }
                else if(TidakBau.isSelected()){
                    Kelas.setBau("Tidak Bau");
                }
                if(Bocor.isSelected()){
                    Kelas.setKebocoran("Bocor");
                }
                else if(TidakBocor.isSelected()){
                    Kelas.setKebocoran("Tidak Bocor");
                }
                if(Rusak.isSelected()){
                    Kelas.setKerusakan("Rusak");
                }
                else if(TidakRusak.isSelected()){
                    Kelas.setKerusakan("Tidak Rusak");
                }
                if(Aus.isSelected()){
                    Kelas.setKeausan("Aus");
                }
                else if(TidakAus.isSelected()){
                    Kelas.setKeausan("Tidak Aus");
                }
                Cls = new RuangKelas(Kelas.getKebisingan(),Kelas.getBau(),Kelas.getKebocoran(),Kelas.getKerusakan(),Kelas.getKeausan(),null);
        }

	/*@Override
	public void KenyamananRuangKelas() {
		System.out.println("Kondisi Kebisingan : \n1. tidak bising \n2. bising");
		super.setKebisingan(in.nextInt());
		System.out.println("\n");
		System.out.println("kondisi bau ruangan : \n1. tidak bau \n2. bauk");
		super.setBau(in.nextInt());
		System.out.println("\n");
		System.out.println("Kondisi Kebocoran ruangan : \n1. tidak bocor \n2. bocor");
		super.setKebocoran(in.nextInt());
		System.out.println("\n");
		System.out.println("Konsisi kerusakan ruangan : \n1. tidak rusak \n2. rusak");
		super.setKerusakan(in.nextInt());
		System.out.println("\n");
		System.out.println("Kondisi Keausan Ruangan : \n1.tidak aus \n2. sudah aus");
		super.setKeausan(in.nextInt());
		System.out.println("\n");
	}*/
        
        public Inventaris(JRadioButton Kekokohan,JRadioButton TidakKokoh, JRadioButton Ada, JRadioButton TidakAda, JRadioButton Ada1, JRadioButton TidakAda1, JRadioButton Ada2, JRadioButton TidakAda2){
                if(Kekokohan.isSelected()){
                    Kelas.setKekokohan("kokoh");
                }
                else if(TidakKokoh.isSelected()){
                    Kelas.setKekokohan("Tidak Kokoh");
                }
                if(Ada.isSelected()){
                    Kelas.setKuncipintu("ADA");
                }
                else if(TidakAda.isSelected()){
                    Kelas.setKuncipintu("Tidak ADA");
                }
                if(Ada1.isSelected()){
                    Kelas.setKuncijendela("ADA");
                }
                else if(TidakAda1.isSelected()){
                    Kelas.setKuncijendela("Tidak ADA");
                }
                if(Ada2.isSelected()){
                    Kelas.setBahaya("ADA");
                }
                else if(TidakAda2.isSelected()){
                    Kelas.setBahaya("Tidak ADA");
                }
                Cls = new RuangKelas(Kelas.getKekokohan(),Kelas.getKuncipintu(),Kelas.getKuncijendela(),Kelas.getBahaya());
        }

	
	public void KeamananRuangKelas(JTextField a,JTextField b, JTextField c, JTextField d) {
		//System.out.println("Kekokohan ruangan : \n1. kokoh \n2. tidak kokoh");
		Kelas.setKekokohan((a.getText()));
		//System.out.println("\n");
		//System.out.println("Kunci pintu ruangan : \n1. ada \n2. rusak \n3. tidak ada");
		Kelas.setKuncipintu((b.getText()));
		//System.out.println("\n");
		//System.out.println("Kunci jendela ruangan : \n1. ada \n2. rusak \n3. tidak ada");
		Kelas.setKuncijendela(c.getText());
		//System.out.println("\n");
		//System.out.println("Kondisi bahaya ruangan : \n1.aman \n2. tidak aman");
		Kelas.setBahaya(d.getText());
		//System.out.println("\n");
	}
        
        public RuangKelas getRuangKelas(){
                return Cls;
        }
        Inventaris(){
            
        }
	
	public void diserialisasi () throws ClassNotFoundException{
		ObjectInputStream in;
		try{ 
			in = new ObjectInputStream(new FileInputStream("UjiCobaTB.ser"));
			in.readObject();
			System.out.println(Kelas.getNamaruang());
			System.out.println(Kelas.getLokasiruang());
			System.out.println(Kelas.getFakultas());
			System.out.println(Kelas.getStudi());
			System.out.println(Kelas.getPanjangRuang());
			System.out.println(Kelas.getLebarRuang());
			System.out.println(Kelas.getJumlahKursi());
			System.out.println(Kelas.getJumlahPintu());
			System.out.println(Kelas.getJumlahJendela());
			System.out.println(Kelas.getJumlahstopkontak());
			System.out.println(Kelas.getKondisistopkontak());
			System.out.println(Kelas.getPosisistopkontak());
			System.out.println(Kelas.getKabelLCD());
			System.out.println(Kelas.getKondisikabelLCD());
			System.out.println(Kelas.getPosisikabelLCD());
			System.out.println(Kelas.getJumlahlampu());
			System.out.println(Kelas.getKondisilampu());
			System.out.println(Kelas.getPosisilampu());
			System.out.println(Kelas.getJumlahkipasangin());
			System.out.println(Kelas.getKondisikipasangin());
			System.out.println(Kelas.getPosisikipasangin());
			System.out.println(Kelas.getJumlahAC());
			System.out.println(Kelas.getKondisiAC());
			System.out.println(Kelas.getPosisiAC());
			System.out.println(Kelas.getSSID());
			System.out.println(Kelas.getBandwidth());
			System.out.println(Kelas.getJumlahCCTV());
			System.out.println(Kelas.getKondisiCCTV());
			System.out.println(Kelas.getPosisiCCTV());
			System.out.println(Kelas.getKondisilantai());
			System.out.println(Kelas.getKondisidinding());
			System.out.println(Kelas.getKondisiatap());
			System.out.println(Kelas.getKondisipintu());
			System.out.println(Kelas.getKondisijendela());
			System.out.println(Kelas.getSirkulasiudara());
			System.out.println(Kelas.getNilaipencahayaan());
			System.out.println(Kelas.getKelembapan());
			System.out.println(Kelas.getSuhu());
			System.out.println(Kelas.getKebisingan());
			System.out.println(Kelas.getBau());
			System.out.println(Kelas.getKebocoran());
			System.out.println(Kelas.getKerusakan());
			System.out.println(Kelas.getKeausan());
			System.out.println(Kelas.getKekokohan());
			System.out.println(Kelas.getKuncipintu());
			System.out.println(Kelas.getKuncijendela());
			System.out.println(Kelas.getBahaya());
			
			in.close();
			
			
		}catch(FileNotFoundException e){
		}catch(IOException a){
			
		}
		
		
	}
	
	public void tampil(){
	System.out.println("" + tb.txtisi.getText());
	System.out.println("" + tb.txtisi1.getText());
	System.out.println("" + tb.txtisi2.getText());
	System.out.println("" + tb.txtisi3.getText());
	System.out.println("" + tb.txtisi4.getText());
	// KondisiRKelas a = new KondisiRKelas();
	//System.out.println(" Hasil = " + a.Hitungluas());
	//System.out.println("" + a.BentukRuang());
	System.out.println("" + tb.isitxt.getText());
	//System.out.println("luas rasio = " + a.rasio());
	System.out.println("" + tb.isitxt1.getText());
	System.out.println("" + tb.isitxt2.getText());
	//System.out.println("" + a.AnalisaPintu());
	//System.out.println("" + a.AnalisaJendela());
	/*System.out.println("" + tb.txt2);
	System.out.println("" + Kelas.getKondisistopkontak());
	System.out.println("" + Kelas.getPosisistopkontak());
	// JmlhKondisiPosisiSarana b = new JmlhKondisiPosisiSarana();
	System.out.println("" + a.AnalisaKelistrikan());
	System.out.println("" + Kelas.getKabelLCD());
	System.out.println("" + Kelas.getKondisikabelLCD());
	System.out.println("" + Kelas.getPosisikabelLCD());
	System.out.println("" + a.AnalisisLCD());
	System.out.println("" + Kelas.getJumlahlampu());
	System.out.println("" + Kelas.getKondisilampu());
	System.out.println("" + Kelas.getPosisilampu());
	System.out.println("" + a.AnalisisLampu());
	System.out.println("" + Kelas.getJumlahkipasangin());
	System.out.println("" + Kelas.getKondisikipasangin());
	System.out.println("" + Kelas.getPosisikipasangin());
	System.out.println("" + a.AnalisisKipas());
	System.out.println("" + Kelas.getJumlahAC());
	System.out.println("" + Kelas.getKondisiAC());
	System.out.println("" + Kelas.getPosisiAC());
	System.out.println("" + a.AnalisisAC());
	System.out.println("" + Kelas.getSSID());
	System.out.println("" + Kelas.getBandwidth());
	System.out.println("" + a.AnalisisInternet());
	System.out.println("" + Kelas.getJumlahCCTV());
	System.out.println("" + Kelas.getKondisiCCTV());
	System.out.println("" + Kelas.getPosisiCCTV());
	System.out.println("" + a.AnalisisCCTV());
	System.out.println("" + Kelas.getKondisilantai());
	System.out.println("" + Kelas.getKondisidinding());
	System.out.println("" + Kelas.getKondisiatap());
	System.out.println("" + Kelas.getKondisipintu());
	System.out.println("" + Kelas.getKondisijendela());
	// LingkunganRuangKelas c = new LingkunganRuangKelas();
	System.out.println("" + a.AnalisisKebersihan());
	System.out.println("" + Kelas.getSirkulasiudara());
	// KebersihanRuangKelas d = new KebersihanRuangKelas();
	System.out.println("" + a.AnalisisPencahayaan());
	System.out.println("" + a.AnalisisKelembapan());
	System.out.println("" + a.AnalisisSuhu());
	// KenyamananRuangKelas e = new KenyamananRuangKelas();
	System.out.println("" + a.AnalisisKebisingan());
	System.out.println("" + Kelas.getBau());
	System.out.println("" + a.AnalisisBau());
	System.out.println("" + Kelas.getKebocoran());
	System.out.println("" + a.AnalisisKebocoran());
	System.out.println("" + Kelas.getKerusakan());
	System.out.println("" + a.AnalisisKerusakan());
	System.out.println("" + Kelas.getKeausan());
	System.out.println("" + a.AnalisisKeausan());
	System.out.println("" + Kelas.getKekokohan());
	// KeamanaRuangKelas f = new KeamanaRuangKelas();
	System.out.println("" + a.AnalisisKekokohan());
	System.out.println("" + Kelas.getKuncipintu());
	System.out.println("" + a.AnalisisKunciPintu());
	System.out.println("" + Kelas.getKuncijendela());
	System.out.println("" + a.AnalisisKunciJendela());
	System.out.println("" + Kelas.getBahaya());
	System.out.println("" + a.AnalisisKeamananRuang());
	a.KelayakanRuang();
	System.out.println("" + a.persentaseKesesuaian());*/
	}
}
