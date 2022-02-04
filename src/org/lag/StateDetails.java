package org.lag;

public class StateDetails {
	private void southIndia() {
		System.out.println("The southern part of India is called Peninsula.");
	}
	private void northIndia() {
		System.out.println("The northern part of India is called Hindustan.");
	}
	public static void main(String[] args) {
		LanguageInfo l = new LanguageInfo();
		l.tamilLanguage();
		l.englishLanguage();
		l.hindilanguage();
		StateDetails s = new StateDetails();
		s.southIndia();
		s.northIndia();
	}	
}
