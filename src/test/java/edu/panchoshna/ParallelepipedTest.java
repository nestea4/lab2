package edu.panchoshna;

import org.junit.Test;

import static org.junit.Assert.*;

/*
    @author User
    @project lab2
    @class ParallelepipedTest
    @version 1.0.0
    @since 09.03.2025 - 14.56 
*/public class ParallelepipedTest {
    public Parallelepiped parallelepiped = new Parallelepiped(3,4,5);

    @Test
    public void whenLength_3_AndWidth_4_AndHeight_5_ThenVolume_60() {
        assertEquals(60.0, parallelepiped.getVolume(), 0.001);
    }

    @Test
    public void whenLength_3_AndWidth_4_AndHeight_5_ThenSurfaceArea_94() {
        assertEquals(94.0, parallelepiped.getSurfaceArea(), 0.001);
    }

    @Test
    public void whenLength_3_AndWidth_4_AndHeight_5_ThenIsNotCube() {
        assertFalse(parallelepiped.isCube());
    }

    @Test
    public void whenLength_3_AndWidth_4_AndHeight_5_ThenDiagonalLength_7_071() {
        assertEquals(7.071, parallelepiped.getDiagonalLength(), 0.001);
    }

    @Test
    public void whenLength_3_AndWidth_4_AndHeight_5_AndScaleFactor_2_ThenDimensionsDoubled() {
        Parallelepiped scalableParallelepiped = new Parallelepiped(3, 4, 5);

        scalableParallelepiped.scale(2);
        assertEquals(6.0, scalableParallelepiped.getLength(), 0.001);
        assertEquals(8.0, scalableParallelepiped.getWidth(), 0.001);
        assertEquals(10.0, scalableParallelepiped.getHeight(), 0.001);
    }

    @Test
    public void whenLength_3_AndWidth_4_AndHeight_5_ThenLateralSurfaceArea_70() {
        assertEquals(70.0, parallelepiped.getLateralSurfaceArea(), 0.001);
    }

    @Test
    public void whenLength_3_AndWidth_4_AndHeight_5_ThenBasePerimeter_14() {
        assertEquals(14.0, parallelepiped.getBasePerimeter(), 0.001);
    }
}