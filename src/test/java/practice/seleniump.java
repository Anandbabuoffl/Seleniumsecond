package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class seleniump {

public static void main(String[] args) throws IOException {
	/*
	 * @Test(dataProvider="login") public void launch(String user,String psd) {
	 * WebDriverManager.chromedriver().setup(); WebDriver driver = new
	 * ChromeDriver();
	 * driver.get("https://demo.opencart.com/index.php?route=account/login");
	 * driver.manage().window().maximize();
	 * driver.findElement(By.id("input-email")).sendKeys(user);
	 * driver.findElement(By.id("input-password")).sendKeys(psd);
	 * driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")
	 * ).click();
	 * 
	 * 
	 * 
	 * }
	 * 
	 * @DataProvider(name="login") public Object[][] getdata() {
	 * 
	 * Object[][] log= {{"des@gmail.com","1234"}, {"des@gmail.com","1234"},
	 * {"des@gmail.com","123"}, {"des@gmail.com","123"},}; return log; }
	 */
       String filepath="C:\\Users\\bbuanan\\eclipse-workspace\\Selenium\\src\\test\\java\\practice\\Test.xlsx";
       FileInputStream fis=new FileInputStream(filepath);
       
       XSSFWorkbook workbook=new XSSFWorkbook(fis);
       XSSFSheet sheet= workbook.getSheet("Sheet0");
       int row= sheet.getLastRowNum();
       System.out.println(row);
      int cloumncount= sheet.getRow(0).getLastCellNum();
      System.out.println(cloumncount);
      
      for(int i=0;i<row;i++) {
    	 XSSFRow row1= sheet.getRow(i);
    	 
    	 for(int j=0;j<cloumncount;j++) {
    		 
    	XSSFCell cell= row1.getCell(j);
    	
    	switch (cell.getCellType()) {
    	case STRING:
    		System.out.print(cell.getStringCellValue());break;
    	case NUMERIC:
    		System.out.print(cell.getNumericCellValue());break;
    	case BOOLEAN:
    		System.out.print(cell.getBooleanCellValue());break;
    	}
    		 System.out.println();
    	 }
      }
      
      
       
       
	
}
}