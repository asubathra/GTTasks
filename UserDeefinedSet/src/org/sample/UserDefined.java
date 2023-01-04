package org.sample;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UserDefined extends StudentDetails {
	
	public static void main(String[] args) {
		Set<StudentDetails>	s = new LinkedHashSet<StudentDetails>();
		
			StudentDetails SD = new StudentDetails();
			SD.setStdId("101");
			SD.setStdName("sam");
		    SD.setStdPhone("1234567890");
		    SD.setAddress("Chennai");
            SD.setDOB("9/9/1999"); 
            SD.setEMail("sdf12@gmail.com");
            SD.setGender("M");
         
            StudentDetails SD1 = new StudentDetails();
			SD1.setStdId("102");
			SD1.setStdName("Ram");
		    SD1.setStdPhone("89677567890");
		    SD1.setAddress("Chennai");
            SD1.setDOB("9/2/1988"); 
            SD1.setEMail("ram123@gmail.com");
            SD1.setGender("M");
         
            StudentDetails SD2 = new StudentDetails();
			SD2.setStdId("103");
			SD2.setStdName("john");
		    SD2.setStdPhone("5674567890");
		    SD2.setAddress("Madurai");
            SD2.setDOB("2/4/1999"); 
            SD2.setEMail("john12@gmail.com");
            SD2.setGender("M");
            
            StudentDetails SD3 = new StudentDetails();
			SD3.setStdId("123");
			SD3.setStdName("somu");
		    SD3.setStdPhone("89066777890");
		    SD3.setAddress("Hydrabad");
            SD3.setDOB("22/4/1999"); 
            SD3.setEMail("sso56@gmail.com");
            SD3.setGender("M");
         
            StudentDetails SD4 = new StudentDetails();
			SD4.setStdId("340");
			SD4.setStdName("mani");
		    SD4.setStdPhone("9784567890");
		    SD4.setAddress("Chennai");
            SD4.setDOB("12/9/1987"); 
            SD4.setEMail("manat@gmail.com");
            SD4.setGender("M");
         
         
            StudentDetails SD5 = new StudentDetails();
			SD5.setStdId("233");
			SD5.setStdName("mohan");
		    SD5.setStdPhone("89967887890");
		    SD5.setAddress("mumbai");
            SD5.setDOB("12/9/199"); 
            SD5.setEMail("monn3@gmail.com");
            SD5.setGender("M");
         
            StudentDetails SD6 = new StudentDetails();
			SD6.setStdId("235");
			SD6.setStdName("santhosh");
		    SD6.setStdPhone("7889999890");
		    SD6.setAddress("US");
            SD6.setDOB("11/7/1989"); 
            SD6.setEMail("san12@gmail.com");
            SD6.setGender("M");
         
            StudentDetails SD7 = new StudentDetails();
			SD7.setStdId("107");
			SD7.setStdName("Antony");
		    SD7.setStdPhone("876567890");
		    SD7.setAddress("Chennai");
            SD7.setDOB("6/1/1999"); 
            SD7.setEMail("sdf12@gmail.com");
            SD7.setGender("M");
         
            StudentDetails SD8 = new StudentDetails();
			SD8.setStdId("220");
			SD8.setStdName("ravi");
		    SD8.setStdPhone("9678867890");
		    SD8.setAddress("Mumbai");
            SD8.setDOB("19/2/1989"); 
            SD8.setEMail("rare12@gmail.com");
            SD8.setGender("M");
         
            StudentDetails SD9 = new StudentDetails();
			SD9.setStdId("134");
			SD9.setStdName("Gopi");
		    SD9.setStdPhone("9889567890");
		    SD9.setAddress("Chennai");
            SD9.setDOB("21/3/1989"); 
            SD9.setEMail("gohi2@gmail.com");
            SD9.setGender("M");
         
         s.add(SD);
         s.add(SD1);
         s.add(SD2);
         s.add(SD3);
         s.add(SD4);
         s.add(SD5);
         s.add(SD6);
         s.add(SD7);
         s.add(SD8);
         s.add(SD9);
         
         for (StudentDetails itr : s) {
        	 System.out.println(itr.getStdId());
			System.out.println(itr.getStdName());
			System.out.println(itr.getStdPhone());
			System.out.println(itr.getaddress());
			System.out.println(itr.getDOB());
			System.out.println(itr.getEMail());
			System.out.println(itr.getGender());
		}
         
}
}
