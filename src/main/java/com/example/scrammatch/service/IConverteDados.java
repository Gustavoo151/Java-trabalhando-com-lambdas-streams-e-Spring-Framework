package com.example.scrammatch.service;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe) throws JsonProcessingException;  // Interface que tem o tipo de retorno como generics
}
