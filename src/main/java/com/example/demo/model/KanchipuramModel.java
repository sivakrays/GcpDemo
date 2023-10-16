package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KanchipuramModel {

    public String devanagari;

    public String verseText;

    public String synonyms;

    public String translation;

    public String purport;
}
