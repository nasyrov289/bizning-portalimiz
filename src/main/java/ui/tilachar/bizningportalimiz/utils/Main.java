//package ui.tilachar.bizningportalimiz.utils;
//
//import com.google.auth.oauth2.AccessToken;
//import com.google.auth.oauth2.GoogleCredentials;
//import com.google.cloud.translate.Language;
//import com.ibm.icu.text.Transliterator;
//import io.grpc.alts.GoogleDefaultChannelBuilder;
//import org.apache.commons.lang.StringEscapeUtils;
//
//import java.io.IOException;
//
//public class Main {
//
//    public static String LANGUAGE_COMBINATION = "Any-Eng"; // Any language to English
//    public static String LANGUAGE_COMBINATION_NO_ACCENTS = LANGUAGE_COMBINATION + "; nfd; [:nonspacing mark:] remove; nfc";
//
//    public static void main(String[] args) {
//
//        String originalText = "سامي الغامدي";//오늘의 좋은 글
//
//        try {
//
//            String originalLocale = GoogleTranslate.detectLanguage(originalText);
//
//            System.out.println("Original Locale\t: " + originalLocale);
//            System.out.println("Original Text\t: " + originalText);
//            String unicodeCodes = StringEscapeUtils.escapeJava(originalText);
//            System.out.println("Unicode codes\t: " + unicodeCodes);
//
//
//            System.out.println();
//
//            // Translator
//            System.out.println("Translated\t: " + GoogleTranslate.translate("en", originalText));
//
//
//            // Transliterator
//            Transliterator transliterator = Transliterator.getInstance(LANGUAGE_COMBINATION);
//            String result1 = transliterator.transliterate(originalText);
//            System.out.println("Transliterated\t: " + result1);
//
//            Transliterator transliteratorNoAccent = Transliterator.getInstance(LANGUAGE_COMBINATION_NO_ACCENTS);
//            String result2 = transliteratorNoAccent.transliterate(originalText);
//            System.out.println("No accents\t: " + result2);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//}