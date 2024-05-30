package de.agmyrek.demoopenapispring.api;


import org.openapitools.api.Workshop;
import org.openapitools.api.WorkshopsApi;
import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class ZeitenController implements WorkshopsApi {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(ZeitenController.class);

    /**
     * GET /workshops
     * Verfügbare Workshop anzeigen
     *
     * @return OK (status code 200)
     */
    @Override
    public ResponseEntity<List<Workshop>> workshopsAnzeigen() {
        var workshops = List.of(
                new Workshop().id("1").titel("titel").beschreibung("beschreibung").verfuegbarePlaetze(BigDecimal.valueOf(100))
        );
        log.info("Verfügbare Workshops: {}", workshops);
        return new ResponseEntity<>(workshops, HttpStatus.OK);
    }

}
