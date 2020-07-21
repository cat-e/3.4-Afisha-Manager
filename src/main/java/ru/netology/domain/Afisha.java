package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Data
public class Afisha {
    private int id;
    private int filmId;
    private String productName;
    private String posterURL;
    private String genre;



    public int getId() {
        return id;
    }
}
