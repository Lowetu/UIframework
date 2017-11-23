package com.UIframework.Class2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Name;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xpath.operations.Equals;

public class ReadExcle {

	public static void main(String[] args) throws IOException {
		File excle = new File("./tests.xls");
		FileInputStream in = new FileInputStream(excle);
		//Workbook book = new XSSFWorkbook(in);//读取2003以上版本
		Workbook book = new HSSFWorkbook(in);//读取97-2003版本
		Sheet sh = book.getSheetAt(0);//Sheet sh = book.getName("sheet1");
		
		System.out.println("读取第五行：");
		Row row1 = sh.getRow(4);
		for(int m=0;m<row1.getLastCellNum();m++) {
			Cell cellL = row1.getCell(m);
			if(cellL.getCellType()==0)
				System.out.print((int)cellL.getNumericCellValue()+"\t");//数字 返回double
			if(cellL.getCellType()==1)
				System.out.print(cellL.getRichStringCellValue().getString()+"\t");//文本
		}
		System.out.println();
		System.out.println("读取全部：");
		for(int j=0;j<=sh.getLastRowNum();j++) {
			Row row =sh.getRow(j);
			for(int i=0;i<row.getLastCellNum();i++) {
				Cell cell=row.getCell(i);
				//System.out.println(cell.getCellTypeEnum());//单元格类型
				if(cell.getCellType()==0)
					System.out.print((int)cell.getNumericCellValue()+"\t");//数字 返回double
				if(cell.getCellType()==1)
					System.out.print(cell.getRichStringCellValue().getString()+"\t");//文本
			}
			System.out.println();
		}
		
		book.close();
		

	}

}
