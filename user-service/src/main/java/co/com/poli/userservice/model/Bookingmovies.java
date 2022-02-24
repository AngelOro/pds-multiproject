package co.com.poli.userservice.model;

import lombok.Data;

@Data
public class Bookingmovies {
    private Long id;
    private Long movieId;
    private Movie movie;
}
