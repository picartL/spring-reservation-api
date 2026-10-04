package com.polytech.polytech.entity;

import java.time.LocalDateTime;

/** represente la table reservation dans la BDD**/

public class reservation {

    private Integer id;

    private Integer utilisateur_id;

    private Integer velo_id;

    private int reservation;

    private LocalDateTime date_debut;

    private LocalDateTime date_fin;

}
