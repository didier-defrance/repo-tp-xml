package p1;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class TestCalculateur {
	
	private Calculateur calculateur; //à tester
	
	@Before
	public void initialisation(){
		calculateur = new Calculateur();
	}

	@Test
	public void testAddition(){
		Assert.assertTrue(11==calculateur.addition(5, 6));
	}
}
