package controller;

public interface RegexContainer {
    String LASTNAME_REGEX_LAT = "[A-Z][a-z]{1,20}";
    String LASTNAME_REGEX_UA = "[А-ЩҐЄІЇЮЯ][а-щґєіїьюя']{1,19}[а-щґєіїьюя]";
    String LOGIN_REGEX = "[A-Za-z0-9-_]{8,20}";
    String FIRSTNAME_REGEX_LAT = "[A-Z][a-z]{1,20}";
    String FIRSTNAME_REGEX_UA = "[А-ЩҐЄІЇЮЯ][а-щґєіїьюя']{1,19}[а-щґєіїьюя]";
    String PATRONYMIC_REGEX_LAT = "[A-Z][a-z]{1,20}";
    String PATRONYMIC_REGEX_UA = "[А-ЩҐЄІЇЮЯ][а-щґєіїьюя']{1,19}[а-щґєіїьюя]";
    String COMMENT_REGEX = ".*|\\n";
    String HOME_PHONE_NUMBER_REGEX = "+?[0-9]{5,12}";
    String MOBILE_NUMBER_REGEX = "+?[0-9]{9,12}";
    String MOBILE_NUMBER2_REGEX = "+?[0-9]{9,12}|\\n";
    String E_MAIL_REGEX = "^[A-Za-z0-9._-]+@[A-Za-z0-9-]+.[A-Za-z]{2,4}$";
    String SKYPE_REGEX = "[A-Za-z0-9-_]{1,20}";
    String INDEX_REGEX = "[0-9]{5}";
    String CITY_REGEX_LAT = "[A-Z][a-z-]{1,20}";
    String CITY_REGEX_UA = "[А-ЩҐЄІЇЮЯ][а-щґєіїьюя'-]{1,19}[а-щґєіїьюя]";
    String STREET_REGEX_LAT = "[A-Z][a-z-]{1,20}";
    String STREET_REGEX_UA = "[А-ЩҐЄІЇЮЯ][а-щґєіїьюя'-]{1,19}[а-щґєіїьюя]";
    String HOUSE_NUMBER_REGEX = "[0-9]{1,4}";
    String APARTMENT_NUMBER_REGEX = "[0-9]{1,4}";
}
