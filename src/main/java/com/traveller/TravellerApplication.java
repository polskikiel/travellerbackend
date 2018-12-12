package com.traveller;

import com.traveller.model.Place;
import com.traveller.model.Point;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TravellerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TravellerApplication.class, args);
    }

    @Bean
    public List<Place> places(){
        List<Point> points = new ArrayList<>();
        points.add(new Point(50.2, 23.401, "jechane rosja", "imgur xd"));
        points.add(new Point(20.2, 23.401, "jechane grecja", "imgur xd"));
        points.add(new Point(40.2, 23.401, "jechane afruka", "imgur xd"));

        List<Place> places = new ArrayList<>();
        places.add(new Place(new Point(50, 23, "baza", "bazxd"), points));

        return places;
    }
}
