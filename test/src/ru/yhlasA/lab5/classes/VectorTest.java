package ru.pershina.lab4.classes;


import org.junit.Test;
import static org.junit.Assert.*;

import ru.pershina.lab4.*;

/**
Тестирование методова класс "треугольник"
@author Pershina Elena
*/
public class VectorTest{ 
   
   @Test
   public void testDistance() 
   { 
	System.out.println("Тестируем метод getDistance()");
	Vector p = new Vector(new Point(1,2,2), new Point(1,2,3));
	assertEquals(1.0,p.getDistance(), 0.01);			
   }

   @Test
   public void testPerimetr() 
   { 
	System.out.println("Тестируем метод getPerimetr()");
	Vector p = new Vector(new Point(1,2,2), new Point(1,2,3));
	assertEquals(1.0,p.getPerimetr(), 0.01);			
   }
}
