package org.lang;

public class StateDetails {
	//southIndia(),northIndia()
	public void southIndia() {
System.out.println("I am a south indian");
	}
	public void northIndia() {
System.out.println("i like north india");
	}
	public static void main(String[] args) {
		
		StateDetails state= new StateDetails();
		state.northIndia();
		state.southIndia();
		
		LanguageInfo statelangdetails= new LanguageInfo();
		statelangdetails.hindiLanguage();
		statelangdetails.englishLanguage();
		statelangdetails.tamilLanguage();
		
	}

}
