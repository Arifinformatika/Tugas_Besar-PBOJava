package TBku;

public class Analysis implements Kesesuaian{
	RuangKelas kls = new RuangKelas();
	int sesuai=0;
	//GUItbfix h = new GUItbfix();
	
	
	//kondisi kelas
	public double Hitungluas(){
		return kls.getPanjangRuang()*kls.getLebarRuang();
		
	}
	public String BentukRuang(String bentuk){
		if(kls.getPanjangRuang()==kls.getLebarRuang()){
			return("tidak sesuai = Bentuk Ruangan Persegi");
		}
		else
			sesuai++;
			return("sesuai = Bentuk Ruangan Persegi Panjang");
		
	}
	
	public double rasio(){
		return Hitungluas()/kls.getJumlahKursi();
	}
	
	public String rasiokelas(){
		if(rasio()>=0.5){
			sesuai++;
			return "rasio sesuai";
		}else{
			return "rasio tidak sesuai";
		}
	}
	
	public String AnalisaPintu(String jumlahpintu){
		if(kls.getJumlahPintu()>=2){
			sesuai++;
			return "Jumlah Pintu = Sesuai";
		}else{
			return "Jumlah Pintu = tidak sesuai";
		}
	}
	public String AnalisaJendela(String jumlahjendela){
		if(kls.getJumlahJendela()>=1){
			sesuai++;
			return "Jumlah Jendela = Sesuai";
		}else{
			return "Jumlah Jendela = Tidak Sesuai";
		}
	}

	//jumlah kondisi dan posisi sarana
	public String AnalisaKelistrikan(int jumlahstopkontak, int kondisistopkontak, int posisistopkontak){
		if(kls.getJumlahstopkontak()>=4 && kls.getKondisistopkontak()==1||kls.getKondisistopkontak()==2&&kls.getPosisistopkontak()==1||kls.getPosisistopkontak()==2){
			sesuai++;
			return ("Jumlah StopKontak = Sesuai");
		}else{
			return ("Jumlah StopKontak = tidak sesuai");
		}
	}
	public String AnalisisLCD(int KabelLCD, int KondisikabelLCD, int posisiKabelLCD){
		if(kls.getKabelLCD()>=1&&kls.getKondisikabelLCD()==1||kls.getKondisikabelLCD()==2&&kls.getPosisikabelLCD()==1){
			sesuai++;
			return "jumlah kabel LCD = sesuai";
	}else
			return "jumlah kabel LCD = tidak sesuai";
	}
	public String AnalisisLampu(int jumlahlampu, int kondisilampu, int posisilampu){
		if(kls.getJumlahlampu()>=18&&kls.getKondisilampu()==1&&kls.getPosisilampu()==1){
			sesuai++;
			return ("Jumlah Lampu = Sesuai");
		}else{
			return ("Jumlah Lampu = tidak sesuai");
		}
	}
	public String AnalisisKipas(int jumlahkipasangin, int kondisikipasangin, int posisikipasangin){
		if(kls.getJumlahkipasangin()>=2&&kls.getKondisikipasangin()==1&&kls.getPosisikipasangin()==1){
			sesuai++;
			return ("Jumlah Kipas Angin = Sesuai");
		}else{
			return ("Jumlah Kipas Angin = tidak sesuai");
		}
	}
	public String AnalisisAC(int jumlahAC, int kondisiAC, int posisiAC){
		if(kls.getJumlahAC()>=1&&kls.getKondisiAC()==1&&kls.getPosisiAC()==1||kls.getPosisiAC()==2){
			sesuai++;
			return("Jumlah AC = Sesuai");
		}else{
			return("Jumlah AC = tidak sesuai");
		}
	}
	public String AnalisisInternet(int SSID){
		if(kls.getSSID()==1&&kls.getLogin()==1){
			sesuai++;
			return("SSID = Sesuai");
		}else{
			return("SSID = tidak sesuai");
		}
	}
	public String AnalisisCCTV(int jumlahCCTV, int kondisiCCTV, int posisiCCTV){
		if(kls.getJumlahCCTV()==2&&kls.getKondisiCCTV()==1&&kls.getPosisiCCTV()==1||kls.getPosisiCCTV()==3){
			sesuai++;
			return("Jumlah CCTV = Sesuai");
		}else{
			return("Jumlah CCTV = tidak sesuai");
		}
	}
	
	//lingkungan
	public String AnalisisKebersihan(String kondisilanatai, String Kondisidinsing, String kondisiatap, String kondisipintu, String kondisijendela){
		if(kls.getKondisilantai()=="Bersih"&&kls.getKondisidinding()=="Bersih"&&kls.getKondisiatap()=="Bersih"&&kls.getKondisipintu()=="Bersih"&&kls.getKondisijendela()=="Bersih"){
			sesuai++;
			return("Kebersihan Ruangan = sesuai");
		}else{
			return("Kebersihan Ruangan = tidak sesuai");
		}
	}
	
	//kebersihan

	public String AnalisisSirkulasiUdara(String SirkulasiUdara){
		if(kls.getSirkulasiudara()=="Lancar"){
			sesuai++;
			return("Sirkulasi Udara = sesuai");
		}else{
			return("Sirkulasi Udara = tidak sesuai");
		}
	}
	public String AnalisisPencahayaan(int Nilaipencahayaa){
		if(kls.getNilaipencahayaan()>=250&&kls.getNilaipencahayaan()<=350){
			sesuai++;
			return("Pencahayaan = sesuai");
		}else{
			return("Pencahayaan = tidak sesuai");
		}
	}
	public String AnalisisKelembapan(int Kelembapan){
		if(kls.getKelembapan()>=70&&kls.getKelembapan()<=80){
			sesuai++;
			return("Kelembapan = sesuai");
		}else{
			return("Kelembapan = tidak sesuai");
		}
	}
	public String AnalisisSuhu(int Suhu){
		if(kls.getSuhu()>=25&&kls.getSuhu()<=35){
			sesuai++;
			return("Suhu = sesuai");
		}else{
			return("Suhu = tidak sesuai");
		}
	}
	
	//kenyamanan
	public String AnalisisKebisingan(String Kebisingan){
		if(kls.getKebisingan()=="Tidak Bising"){
			sesuai++;
			return("Tingkat Kebisingan = Sesuai");
		}else{
			return("Tingkat Kebisingan = tidak sesuai");
		}
	}
	public String AnalisisBau(String Bau){
		if(kls.getBau()=="Tidak Bau"){
			sesuai++;
			return("Bau Ruangan = Sesuai");
		}else{
			return("Bau Ruangan = tidak sesuai");
		}
	}
	public String AnalisisKebocoran(String Kebocoran){
		if(kls.getKebocoran()=="Tidak Bocor"){
			sesuai++;
			return("Tingkat Kebocoran = Sesuai");
		}else{
			return("Tingkat Kebocoran = tidak sesuai");
		}
	}
	public String AnalisisKerusakan(String Kerusakan){
		if(kls.getKerusakan()=="Tidak Rusak"){
			sesuai++;
			return("Tingkat Kerusakan = Sesuai");
		}else{
			return("Tingkat Kerusakan = tidak sesuai");
	}
	}
	public String AnalisisKeausan(String Keausan){
		if(kls.getKeausan()=="Tidak Aus"){
			sesuai++;
			return("Tingkat Keausan = Sesuai");
		}else{
			return("Tingkat Keausan = tidak sesuai");
		}
	}
	
	//keamnan
	public String AnalisisKekokohan(String Kokoh){
		if(kls.getKekokohan()=="kokoh"){
			sesuai++;
			return("Tingkat Kekokohan = Sesuai");
		}else{
			return("Tingkat Kekokohan = tidak sesuai");
		}
	}
	public String AnalisisKunciPintu(String kuncipintu){
		if(kls.getKuncipintu()=="Ada"){
			sesuai++;
			return("Kunci pintu = Sesuai");
		}else{
			return("Kunci pintu = tidak sesuai");
		}
	}
	public String AnalisisKunciJendela(String kuncijendela){
		if(kls.getKuncijendela()=="Ada"){
			sesuai++;
			return("Kunci Jendela = Sesuai");
		}else{
			return("Kunci Jendela = tidak sesuai");
		}
	}
	public String AnalisisKeamananRuang(String Bahaya){
		if(kls.getBahaya()=="Tidak Bahaya"){
			sesuai++;
			return("Tingkat Keamanan Ruangan = Sesuai");
		}else{
			return("Tingkat Keamanan Ruangan = tidak sesuai");
		}
	}
	@Override
	public double persentaseKesesuaian(){
		return sesuai*2.7;
	}
	@Override
	public void KelayakanRuang(){
		if(persentaseKesesuaian()>=persentaseSesuai){
			System.out.println( "Kelayakan ruangan sangat baik dan pantas untuk dipakai untuk perkuliahan");
		}else if(persentaseKesesuaian()>=persentasecukup&&persentaseKesesuaian()<persentaseSesuai){
			System.out.println("Kelayakan ruangan cukup baik dan masih bisa digunakan");
		}else if(persentaseKesesuaian()>=persenpenggantian&&persentaseKesesuaian()<persentasecukup){
			System.out.println("Ada beberapa inventaris ruangan yang harus di ganti atau perbaiki");
		}else if(persentaseKesesuaian()>=persenRenovasi&&persentaseKesesuaian()<persenpenggantian){
			System.out.println("Ruangan ini butuh renovasi terlebih dahulu sebelum digunakan");
		}else if(persentaseKesesuaian()>=persenperbaikanTotal&&persentaseKesesuaian()<persenRenovasi){
			System.out.println("Ruangan ini butuh Perbikan total sekaligus renovasi dan penggantian barang inventaris");
		}
		//return "Kelayakan ruangan sangat baik dan pantas untuk dipakai untuk perkuliahan";
	}
	
}
