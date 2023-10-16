package com.example.kharja.Controllers;


import com.example.kharja.Entity.NightClub;
import com.example.kharja.Services.NightClubService;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;


@SpringBootTest
public class NightClubTest {

    @InjectMocks
    private NightClubController nightClubController;

    @Mock
    private NightClubService nightClubService;

    @Before("")
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAddNightClub() {
        NightClub nightClub = new NightClub();
        NightClub nightClub1 = new NightClub();
        nightClub.setName("Test Night Club 1");
        nightClub1.setName("Test Night Club 2");
        when(nightClubService.add(any(NightClub.class))).thenReturn(nightClub);
        ResponseEntity<Object> responseEntity = nightClubController.addNightClub(nightClub);
        verify(nightClubService, times(1)).add(nightClub);
        assertNotNull(responseEntity);
        assertEquals(ResponseEntity.accepted().body(nightClub), responseEntity);
    }

    @Test
    public void testGetNightClubs() {
        NightClub nightClub = new NightClub();
        NightClub nightClub1 = new NightClub();
        nightClub.setName("Test Night Club 1");
        nightClub.setAlcohol(true);
        nightClub1.setName("Test Night Club 2");
        when(nightClubService.add(any(NightClub.class))).thenReturn(nightClub);
        ResponseEntity<Object> responseEntity = nightClubController.addNightClub(nightClub);
        verify(nightClubService, times(1)).add(nightClub);
        assertNotNull(responseEntity);
        System.out.println(responseEntity);
        System.out.println("______________________________________________________________");
        assertEquals(ResponseEntity.accepted().body(nightClub), responseEntity);
    }
}
