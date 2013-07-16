package fr.afcepf.atod18.xml.test;



import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.afcepf.atod18.xml.calcul.Calculateur;

//Test unitaire avec JUnit4
public class TestCalculateur {
	
	private static Logger logger = LoggerFactory.getLogger(TestCalculateur.class);
	
	private Calculateur calculateur; //chose à tester
	
	@Before // ou @BeforeClass si init chose "static"
	public void initCalculateur(){
		calculateur = new Calculateur();
	}
	
	@Test
	public void testAddition(){
		double res= calculateur.addition(5.5 , 4.4 );
		//Assert.assertTrue(res == 9.9);
		Assert.assertEquals(9.9, res, 0.000001 /*delta pres*/);
		logger.debug("testAddition: 5.5+4.4="+res);
	}
	
	@Test
	public void testMultiplication(){
		double res= calculateur.multiplication(2 , 6 );
		//Assert.assertTrue(res == 12);
		Assert.assertEquals(12, res, 0.000001 /*delta pres*/);
		logger.debug("testMultiplication: 2*6="+res);
	}

}
