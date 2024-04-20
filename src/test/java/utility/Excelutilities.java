package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutilities {

	public static String getCellValue(String filePath, String Sheet, int rowDetails, int columnDetails) throws IOException
	{
		try
		{
			FileInputStream file = new FileInputStream(filePath);
		
			XSSFWorkbook workbook = new XSSFWorkbook(file);
		
			XSSFCell cell = workbook.getSheet(Sheet).getRow(rowDetails).getCell(columnDetails);
		
			if(cell.getCellType() == CellType.STRING)
			{
				return cell.getStringCellValue();
			}
			else
			{
				return cell.getRawValue(); //Converts automatically to string
			}
		} catch(Exception e )
		{
			return "";
		}
	}
	
	public static int getRowCount(String filePath, String Sheet)
	{
		try 
		{
			FileInputStream file = new FileInputStream(filePath);
			
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			
			return workbook.getSheet(Sheet).getLastRowNum();
		
		}catch(Exception e)
		{
			return 0;
		}
	}

}
