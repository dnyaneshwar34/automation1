package facebook;

import org.testng.annotations.Test;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Excellsheet {
 
  
	        @Test
          public void excell() throws Throwable {
		  
		  FileInputStream myfile = new FileInputStream("D:\\excelsheet\\Book2.xlsx");
		  
		      Sheet mysheet=   WorkbookFactory.create(myfile).getSheet("Sheet1");
		  
		                int totalrownum   = mysheet.getLastRowNum();
		                System.out.println(totalrownum );
		     int totalcellnum =  mysheet.getRow(0).getLastCellNum();
		  System.out.println(totalcellnum);
		  
		  for(int i=0;i<=totalrownum-1;i++ ) {
			  for(int j=0;j<=totalcellnum-1;i++) {
				  
			  
		         Cell mycell   	=  mysheet.getRow(i).getCell(j);
		      CellType mycelltype          =  mycell.getCellType();
			  
		      if(mycelltype == CellType.STRING) {
		    System.out.println(mycell.getStringCellValue());	 
		    
		    	  
		    	  
		      }
		      else if(mycelltype== CellType.NUMERIC) {
		    System.out.println(mycell.getNumericCellValue());
		      }
		      else if(mycelltype==CellType.BOOLEAN) {
		    	  System.out.println(mycell.getBooleanCellValue());
		      }
		      else if (mycelltype==CellType.BLANK) {
		    	  System.out.print("");
		    	  
		      }
		      
			  }
		      System.out.println("");
		      
		      
		      
		      
		  }
		  
	  }
	

	
	



  }

