package ar.edu.unq.po2.tp8;

import org.junit.Test;
import static org.junit.Assert.*;

public class LesionDermatologicaTest {

    @Test
    public void testSiguienteColor() {
        assertEquals(LesionDermatologica.GRIS, LesionDermatologica.ROJO.getProximoColor());
        assertEquals(LesionDermatologica.AMARILLO, LesionDermatologica.GRIS.getProximoColor());
        assertEquals(LesionDermatologica.MIEL, LesionDermatologica.AMARILLO.getProximoColor());
        assertEquals(LesionDermatologica.ROJO, LesionDermatologica.MIEL.getProximoColor());
    }

}

