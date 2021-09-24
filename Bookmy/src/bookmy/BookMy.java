package bookmy;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BookMy {
	static WebDriver driver;
	
	static String[] XLReader() throws IOException{
		File loc=new File("E:\\CH\\ShowB.xlsx");
		
		FileInputStream f = new FileInputStream(loc);
		
		XSSFWorkbook wb = new XSSFWorkbook(f);
		XSSFSheet s = wb.getSheetAt(0);
		
		
		String data1=s.getRow(1).getCell(1).getStringCellValue();
		String data2=s.getRow(2).getCell(2).getStringCellValue();
		String data3=s.getRow(3).getCell(3).getStringCellValue();
		
		String[] xs= new String[] {data1,data2,data3};
		String[]r=new String[3];
		r[1]=xs[1];
		r[2]=xs[2];
		r[3]=xs[3];
		
		return r;
		
	}
	

	public static void main(String[] args) throws IOException, InterruptedException,AWTException{
		System.setProperty("webdriver.chrome.driver", "E:\\CH\\chromedriver.exe");
		

		WebDriver driver=new ChromeDriver();
		//driver.get("https://in.bookmyshow.com/");
		
		driver.manage().window().maximize();
		
	}
	
	public class XSSFWorkbook{

		public XSSFWorkbook(FileInputStream f) throws InterruptedException, AWTException, IOException {
			
			
			Thread.sleep(2000);

			WebElement data = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div/div/input")); 
			Thread.sleep(2000);
			int j = 0;
			Object[] res = null;
			data.sendKeys((CharSequence[]) res[j]);

			Robot r = new Robot();

			

			r.keyPress(KeyEvent.VK_ENTER);  
			r.keyRelease(KeyEvent.VK_ENTER);

			Thread.sleep(3000);
			WebElement mou3 =driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/header/div[2]/div/div/div/div[1]/div/a[1]"));
			Actions a= new Actions (driver); 
			a.doubleClick(mou3).build().perform();

			Thread.sleep(3000);

			WebElement mou4= driver.findElement(By.xpath("//[@id-\super-container\"]/div[2]/div[3]/div[2]/div[3]/div/div/div[2]/a[1]/div/div[2]/div/img"));
			Actions a2= new Actions (driver); 
			a2.doubleClick(mou4).build().perform();
			
			Thread.sleep(3000);

			System.out.println("CITY NAME IS:");
			String cName= driver.findElement(By.xpath("//*[@ide\"super-container\"]/header/div[1]/div/div/div/div[2]/div[1]/span")).getText(); 
			System.out.println(cName);
			

			Thread.sleep(3000);

			System.out.println("MOVIE NAME IS :");
			String mName= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/section[1]/div/div/div[2]/h1")).getText();
			System.out.println(mName);

			Thread.sleep(3000);
			System.out.println("About movie:");
			String about= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/section[1]/section/span/div/span")).getText();
			System.out.println(about);

			File file =new File("E:\\BookMyShow");
			boolean fl=file.mkdir();
			System.out.println(fl);
			
			File tfile =new File("E:\\BookMyShow\\Project.txt");
			boolean g=tfile.createNewFile();
			System.out.println(g);
			
			FileWriter wfile =new FileWriter("E:\\BookMyShow\\Project.txt");
			BufferedWriter bw= new BufferedWriter(wfile);
			
			System.out.println("Writing to file");
			bw.write("City Name:");
			bw.write(cName);
			bw.newLine();
			bw.write("                                     ");
			bw.newLine();
			
			bw.write("Movie Name:");
			bw.newLine();
			bw.write(mName);
			bw.newLine();
			bw.write("                                     ");
			bw.newLine();
			
			
			bw.write("About Movie:");
			bw.newLine();
			bw.write(about);
			bw.newLine();
			bw.write("                                     ");
			bw.newLine();
			
			driver.get("https://in.bookmyshow.com/explore/home");
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/header/div[1]/div/div/div/div[2]/div[1]/span")).click();
			bw.append(cName);
			bw.append(mName);
			bw.append(about);
			
			bw.close();

			
			
			// TODO Auto-generated constructor stub
		}
		
		
	}
	

}
