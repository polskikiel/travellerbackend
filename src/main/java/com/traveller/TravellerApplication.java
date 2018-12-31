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
        points.add(new Point(50.203, 23.431, "jechane grecja", "imgur xd"));
        points.add(new Point(50.24, 23.472, "jechane afruka", "imgur xd"));

        List<Place> places = new ArrayList<>();
        places.add(new Place(new Point(50, 23, "Park narodowy", "https://images.unsplash.com/photo-1531804055935-76f44d7c3621?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=3334&q=80"), points));

        List<Point> polsl = new ArrayList<>();
        polsl.add(new Point(50.291159, 18.680220, "Wydział Matematyki Stosowanej", "imgur xd"));
        polsl.add(new Point(50.288710, 18.677271, "Wydział Automatyki, Elektroniki i Informatyki", "imgur xd"));
        polsl.add(new Point(50.289955, 18.677905, "Wydział Budownictwa", "imgur xd"));
        polsl.add(new Point(50.292478, 18.681030, "Wydział Mechaniczny Technologiczny", "imgur xd"));
        polsl.add(new Point(50.289663, 18.678762, "Wydział Architektury", "imgur xd"));
        places.add(new Place(new Point(50.29, 18.679, "Politechnika Śląska", "https://images.unsplash.com/photo-1531804055935-76f44d7c3621?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=3334&q=80"), polsl));


        return places;
    }
}
