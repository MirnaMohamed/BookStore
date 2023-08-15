package com.example.demo.validations;

import com.example.demo.exceptions.BadEntryException;
import com.example.demo.models.constants.Constants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BookValidation {
    private static final BookValidation bookValidation = new BookValidation();
    private Pattern nameRegex = Constants.nameRegex;
    private BookValidation(){}

    public static BookValidation getBookValidation() {
        return bookValidation;
    }
    public void NameValidation(String name) {
        Matcher matcher = nameRegex.matcher(name);
        if (!matcher.matches()) {
            throw new BadEntryException("Invalid Book Title");
        }
    }
}
