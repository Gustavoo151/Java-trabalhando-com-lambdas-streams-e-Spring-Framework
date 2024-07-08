package com.example.scrammatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)  // Usamos para ignorar algums dados que não queremos mapear
public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") int totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao) {
}
