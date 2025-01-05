package com.giovani.workshopmongo.domain;

import java.io.Serializable;
import java.util.Objects;

/*
*  Isso significa que objetos dessa classe podem ser convertidos em um fluxo de bytes,
*  que pode ser armazenado em arquivos, transmitido pela rede ou armazenado em um banco de dados,
*  e posteriormente reconstruído em sua forma original (desserializado).
*/
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private String email;

    // associações
    //pivate List<Post posts> post;


    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // vou comparar meu objetos somente com o id
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(getId(), user.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}
