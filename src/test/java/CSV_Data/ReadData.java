package CSV_Data;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

public class ReadData {


    @DataProvider(name = "stations")
    public Object[][] readStations(Method method) throws IOException {
        String sheet = method.getName();


        String filePath = System.getProperty("user.dir") + "\\src\\Read Data.xlsx";

        File file = new File(filePath);
        FileInputStream fileInputStream = new FileInputStream(file);

        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheetName = workbook.getSheet(sheet);

        int totalRows = sheetName.getLastRowNum();
        System.out.println(totalRows);
        Row cellRow = sheetName.getRow(0);
        int totalCols = cellRow.getLastCellNum();
        System.out.println(totalCols);

        DataFormatter format = new DataFormatter();

        String testData[][] = new String[totalRows][totalCols];

        for (int i =1;i<=totalRows;i++){
            for (int j=0;j<totalCols;j++){
                testData[i-1][j] = format.formatCellValue(sheetName.getRow(i).getCell(j));
                System.out.println(testData[i-1][j]);
            }
        }

        return testData;

    }
    @DataProvider(name = "info")
    public Object[][] readInfo(Method method) throws IOException {
        String sheet = method.getName();


        String filePath = System.getProperty("user.dir") + "\\src\\Read Data.xlsx";

        File file = new File(filePath);
        FileInputStream fileInputStream = new FileInputStream(file);

        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheetName = workbook.getSheet(sheet);

        int totalRows = sheetName.getLastRowNum();
        System.out.println(totalRows);
        Row cellRow = sheetName.getRow(0);
        int totalCols = cellRow.getLastCellNum();
        System.out.println(totalCols);

        DataFormatter format = new DataFormatter();

        String testData[][] = new String[totalRows][totalCols];

        for (int i =1;i<=totalRows;i++){
            for (int j=0;j<totalCols;j++){
                testData[i-1][j] = format.formatCellValue(sheetName.getRow(i).getCell(j));
                System.out.println(testData[i-1][j]);
            }
        }

        return testData;

    }
}
