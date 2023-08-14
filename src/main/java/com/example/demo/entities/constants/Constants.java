package com.example.demo.entities.constants;

import lombok.Getter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Constants {

    public static final Pattern passwordRegex = Pattern.compile("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$");
    public static final Pattern nameRegex = Pattern.compile("\\b([A-ZÀ-ÿ][-,a-z. ']+[ ]*)+");



}
