package test.logic;

import static org.junit.Assert.*;

import model.logic.Cinema;

import org.junit.Before;
import org.junit.Test;

public class TestModelo {
	
	private Cinema modelo;
	private static int CAPACIDAD=100;

	@Before
	public void setUp1() {
		
	}

	public void setUp2() {
	
	}

	@Test
	public void testModelo() {
		assertTrue(modelo!=null);
		assertTrue(modelo.darTamano()==0);  // Modelo con 0 elementos presentes.
	}

	@Test
	public void testDarTamano() {
		assertTrue(modelo.darTamano()==0);// Modelo con 0 elementos presentes.
		setUp2();
		assertTrue(modelo.darTamano() == CAPACIDAD);// Modelo con 100 elementos presentes.
	}

	@Test
	public void testAgregar() {
		setUp2();
		assertTrue(modelo.darTamano() == CAPACIDAD);// Modelo con 100 elementos presentes.
	}

	@Test
	public void testBuscar() {
		setUp2();
		assertNotNull(modelo.buscar(50));// Modelo con el 50 elementos presentes.
	}

	@Test
	public void testEliminar() {
		setUp2();
		assertTrue(modelo.darTamano() == CAPACIDAD);// Modelo con 100 elementos presentes.
		assertTrue(modelo.eliminar(50).equals( ""+(50)));// Modelo con 99 elementos presentes, eliminando el 50.
		assertNull(modelo.buscar(50));// Modelo con 99 elementos presentes.
	}

}
