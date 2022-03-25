package Odev2;

public class Sarjor {
	
	private int sarjorKapasite;
	private int mevcutMermi;
	
	
	public Sarjor(int sarjorKapasite,int mevcutMermi) {
		this.mevcutMermi=mevcutMermi;
		this.sarjorKapasite=sarjorKapasite;
	}
	
	
	
	
	public void detaylarýGoster() {
	System.out.println("mevcut mermisi :  "+ this.mevcutMermi);
	System.out.println(" þarjör kapasitesi :  " + this.sarjorKapasite);
	
	
	
	}
	
	public int getSarjorKapasite() {
		return sarjorKapasite;
	}
	public void setSarjorKapasite(int sarjorKapasite) {
		this.sarjorKapasite = sarjorKapasite;
	}
	public int getMevcutMermi() {
		return mevcutMermi;
	}
	public void setMevcutMermi(int mevcutMermi) {
		this.mevcutMermi = mevcutMermi;
	}
	
	
	
	
	public  void atesEt() {

		
		if(mevcutMermi>0) {
		for(int i=mevcutMermi ; i==0;--i) {
			
			System.out.println( i +". mermi ateþ edildi ");
				
			}
		}
	
	}
	public void doldur() {	
	
		if(mevcutMermi==0) {		
			for(int i=mevcutMermi;i==sarjorKapasite;i++) {
				
				System.out.println( i+". mermi silaha eklendi");
				
			}		
		
		
		}				
	

	
	
		}
}


















