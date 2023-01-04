package org.lang;

public class StateDetails {
public void southIndia() {
	System.out.println("Southindia people speaking in Tamil");
	
}
public void northIndia() {
	System.out.println("Northindia people speaking in Telugu");
}
public static void main(String[] args) {
	
	LanguageInfo lang = new LanguageInfo();
	StateDetails state =new StateDetails();
	
	lang.tamilLanguage();
	lang.englishLanguage();
	lang.hindiLanguage();
	state.southIndia();
	state.northIndia();
	
}
}
