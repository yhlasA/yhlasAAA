package ru.pershina.lab4.classes;


import org.junit.Test;
import static org.junit.Assert.*;

import ru.pershina.lab4.*;

/**
Тестирование методова класс "треугольник"
@author Pershina Elena
*/
public class TriangleTest{ 
   
   @Test
   public void testPerimetr()
   { 
	System.out.println("Тестируем метод getPerimetr()");
	Triangle p =new Triangle(new Point(1,2,2), new Point(1,2,3),new Point(1,2,2));
	assertEquals(2.0,p.getPerimetr(), 0.01);			
   }

   @Test
   public void testArea() 
   { 
	System.out.println("Тестируем метод getArea()");
	Triangle p = new Triangle(new Point(1,2,2), new Point(1,2,3),new Point(1,2,2));
	assertEquals(0.0,p.getArea(), 0.01);			
   }
}
