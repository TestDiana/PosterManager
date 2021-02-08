package ru.netology.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PosterItem {

    private int id;
    private int filmId;
    private String filmName;
    private String filmGenre;
    private int filmPicture;
}
