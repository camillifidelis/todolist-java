package br.com.camillifidelis.todolist.user;

import lombok.Data;

// @Getter - colocar só getters
// @Setter - colocar só setters

@Data // getters e setters
public class UserModel {

    // se quiser get e set só de um atributo, colocar @Getter e @Setter em cima dele
    private String username;
    private String name;
    private String password;
}
