package org.lang;

public class LanguageInfo {
// tamilLanguage(),englishLanguage(),hindiLanguage()
	public void tamilLanguage() {
		System.out.println("I speak tamil");

	}
	public void englishLanguage() {
		System.out.println("i can speak english");

	}
	public void hindiLanguage() {
System.out.println("i can speak hindi");
	}
public void teluguLanguage() {
	System.out.println("i can speak telugu");
}
	public void malayalLanguage() {
		System.out.println("i can speak malyali");
			}

	public static void main(String[] args) {
		LanguageInfo lang= new LanguageInfo();
		lang.tamilLanguage();
		lang.englishLanguage();
		lang.hindiLanguage();
		
	}
}
