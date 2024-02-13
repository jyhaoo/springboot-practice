package com.jyhaoo.jackson_spring_web;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jyhaoo.jackson_spring_web.domain.Book;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JacksonTests {

    @Test
    public void testThatObjectMapperCanCreateJavaObjectFromJsonObject() throws JsonProcessingException {
        Book book = Book.builder()
                .isbn("978-02033-430-49")
                .title("Year of the Warrior")
                .author("Jeff Probst")
                .yearPublished("2006")
                .build();

        final ObjectMapper objectMapper = new ObjectMapper();
        String json = "{\"isbn\":\"978-02033-430-49\",\"title\":\"Year of the Warrior\",\"author\":\"Jeff Probst\",\"yearPublished\":\"2006\"}";
        String result = objectMapper.writeValueAsString(book);
        assertThat(result).isEqualTo(json);
    }

    @Test
    public void testThatObjectMapperCanCreateJavaObjectFromJsonObject() throws JsonProcessingException {
        Book book = Book.builder()
                .isbn("978-02033-430-49")
                .title("Year of the Warrior")
                .author("Jeff Probst")
                .yearPublished("2006")
                .build();

        String json = "{\"isbn\":\"978-02033-430-49\",\"title\":\"Year of the Warrior\",\"author\":\"Jeff Probst\",\"yearPublished\":\"2006\"}";

        final ObjectMapper objectMapper = new ObjectMapper();

        Book result = objectMapper.readValue(json, Book.class);

        assertThat(result).isEqualTo(book);
    }
}
