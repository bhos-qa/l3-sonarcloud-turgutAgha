package org.turgut;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.turgut.Main.PermissionManager;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    PermissionManager pm;

    @BeforeEach
    void setUp() {
        pm = new PermissionManager();
    }

    @Test
    void testGetMCurrentLevel(){
        assertEquals("USER", pm.getMCurrentLevel());
    }

}
