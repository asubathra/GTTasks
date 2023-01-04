package org.language;

public class LanguageInfo extends StateDetails {
private void tamilLanguage() {
	
}{
	System.out.println("Speaking for Tamilnadu People");
}
private void englishLanguage() {
	System.out.println("Speaking for American People");
}
private void hindiLanguage() {
	System.out.println("Speaking for North Indian People");
}

public static void main(String[] args) {
	LanguageInfo lang = new LanguageInfo();
	lang.tamilLanguage();
	lang.englishLanguage();
	lang.hindiLanguage();
	lang.southIndia();
	lang.northIndia();
	
}
}
