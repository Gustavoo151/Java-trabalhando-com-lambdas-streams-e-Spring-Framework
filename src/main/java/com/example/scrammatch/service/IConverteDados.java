package com.example.scrammatch.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);  // Interface que tem o tipo de retorno como generics
}
