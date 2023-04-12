package com.JPAPart3.JPAPart3;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import jakarta.persistence.criteria.Join;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

@Converter
public class StringListConverter implements AttributeConverter<List<String>, String> {

    @Override
    public String convertToDatabaseColumn(List<String> list) {
        return String.join(",", list);
    }

    @Override
    public List<String> convertToEntityAttribute(String joined) {
        return new ArrayList<>(Arrays.asList(joined.split(",")));
    }

}