package org.turgut;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.turgut.Main.PermissionManager;
import org.turgut.Main.PermissionLevel;

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

    @Test
    void testSetMCurrentLevel(){
        String[] permissionLevels = {"ADMIN", "DEVELOPER", "USER"};
        int counter = 0;
        for(PermissionLevel pl : PermissionLevel.values()){
            pm.setMCurrentLevel(pl);
            assertEquals(permissionLevels[counter], pm.getMCurrentLevel());
            counter++;
        }
    }

}
