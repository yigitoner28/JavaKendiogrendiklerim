package Odev2;
	
public class Silah {
	
	private int hedefUzakligi;	
	private int menzil;
	Sarjor sarjor;
	
	
	
	public Silah(int hedefUzakligi,int menzil) {
		this.hedefUzakligi=hedefUzakligi;
		this.menzil=menzil;
	
	}
	
		public void detaylarýGoster() {
			System.out.println("silahýn seçilen hedef uzaklýðý"+hedefUzakligi);
			System.out.println("silahýn maksimum menzili  " + menzil);
		}
	
		public void atesEt() {
			
			if(hedefUzakligi==menzil);
			sarjor.atesEt();
			
		}
		public void doldur() {
			sarjor.doldur();
		}
	
	
	
	
	
	
	public int getMenzil() {
		return menzil;
	}

	public void setMenzil(int menzil) {
		this.menzil = menzil;
	}

	public int getHedefUzakligi() {
		return hedefUzakligi;
	}

	public void setHedefUzakligi(int hedefUzakligi) {
		this.hedefUzakligi = hedefUzakligi;
	}

	}
			
	





	






	
	





