package GoogleCalk;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SearchCalc extends TestBase {


    @Test
    public void searchCalculator() {
        driver.get(SITE_URL);

        driver.findElement(By.xpath("//input[@class = 'gLFyf gsfi']")).sendKeys("Калькулятор");
        driver.findElement(By.className("gNO89b")).click();

        driver.findElement(By.xpath("//div[text() = '1']")).click();
        driver.findElement(By.xpath("//div[text() = '×']")).click();
        driver.findElement(By.xpath("//div[text() = '2']")).click();
        driver.findElement(By.xpath("//div[text() = '−']")).click();
        driver.findElement(By.xpath("//div[text() = '3']")).click();
        driver.findElement(By.xpath("//div[text() = '+']")).click();
        driver.findElement(By.xpath("//div[text() = '1']")).click();
        driver.findElement(By.xpath("//div[text() = '=']")).click();

        WebDriverWait wait1 = new WebDriverWait(driver,10);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class = 'vUGUtc']")));

        WebDriverWait wait2 = new WebDriverWait(driver,10);
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class = 'qv3Wpe']")));

    }


}
