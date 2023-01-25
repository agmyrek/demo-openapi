package de.agmyrek.demoopenapispring.api;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
@ContextConfiguration
@AutoConfigureMockMvc
class ZeitenControllerTest {

    private static final String CONTENT_TYPE = "application/x.db.vendo.moditi.v1+json";
    private static final String URL_WORKSHOPS = "/workshops";
    private static final String URL_WORKSHOPS_ANMELDUNG = "/workshops/{id}/anmeldung";

    @Autowired
    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
    }

    @Test
    void workshopsAnzeigen() throws Exception {
        ResultActions resultAction = mockMvc.perform(
                get(URL_WORKSHOPS)
                        .contentType(CONTENT_TYPE)
                        .characterEncoding("utf-8")
        );

        //then:
        resultAction.andExpect(status().isOk());
    }

    @Test
    void workshopAnmeldung() {
    }
}