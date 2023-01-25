package de.agmyrek.demoopenapispring.api;


import de.agmyrek.demoopenapispring.api.gen.WorkshopsApi;
import de.agmyrek.demoopenapispring.api.gen.model.AnmeldungRequestDto;
import de.agmyrek.demoopenapispring.api.gen.model.WorkshopDto;
import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

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
    public ResponseEntity<List<WorkshopDto>> workshopsAnzeigen() {
        var workshops = List.of(
                new WorkshopDto().id("1").titel("titel").beschreibung("beschreibung").verfuegbarePlaetze(BigDecimal.valueOf(100))
        );
        log.info("Verfügbare Workshops: {}", workshops);
        return new ResponseEntity<>(workshops, HttpStatus.OK);
    }

    /**
     * POST /workshops/{id}/anmeldung
     * Für einem Workshop anmelden
     *
     * @param id                  (required)
     * @param anmeldungRequestDto (optional)
     * @return Erfolgreich angemeldet (status code 200)
     */
    @Override
    public ResponseEntity<Void> workshopAnmeldung(String id, AnmeldungRequestDto anmeldungRequestDto) {

        log.info("Anmeldung erfolgreich für: {}", anmeldungRequestDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
