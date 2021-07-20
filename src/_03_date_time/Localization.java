package _03_date_time;

import java.util.Currency;
import java.util.Locale;

public class Localization {

    public static void main(String[] args) {

        // Locale(String language)
        // Locale(String language, String country)

        Locale locale = new Locale("Turkish","Turkey");
        System.out.println(locale.getCountry()); // get country
        System.out.println(locale.getDisplayCountry());
        System.out.println(locale.getLanguage()); // get language
        System.out.println(locale.getDisplayLanguage());

        // Currency classes

        Currency us_dollar = Currency.getInstance("US"); //Australian Dollar
        System.out.println(us_dollar.getCurrencyCode());
        System.out.println(us_dollar.getDefaultFractionDigits());



    }
}
