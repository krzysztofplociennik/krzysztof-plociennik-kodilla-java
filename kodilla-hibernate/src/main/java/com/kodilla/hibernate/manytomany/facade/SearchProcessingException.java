package com.kodilla.hibernate.manytomany.facade;

public class SearchProcessingException extends Exception {

    public static String INFO_NO_COMPANY_FOUND = "There are no companies with a keyword like that!";
    public static String INFO_NO_EMPLOYEE_FOUND = "There are no employees with a keyword like that!";
    public static String ERR_NO_PHRASE_GIVEN = "Please include a keyword!";
    public static String ERR_NO_RECORDS = "There are no records in the repository!";

    public SearchProcessingException(String message) {
        super(message);
    }
}
