package UIAutomationTesting.ANDROID.Reports;

import com.google.common.collect.Table;
import com.sun.rowset.internal.Row;
import javafx.scene.control.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.testng.annotations.Test;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;


public class DataDriven
{

   /* public ArrayList<String> creatDataDrivenReport(String testCaseName) throws IOException {
        ArrayList<String> a = new ArrayList<String>();
        FileInputStream fis = new FileInputStream("/Users/abvn237/Documents/CustomersBankingSAAppFramework/" +
                "src/test/java/UIAutomationTesting/ANDROID/Reports/demodata.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook(fis);


        int sheets = workbook.getNumberOfSheets();

        for (int i = 0; i < sheets; i++) {
            if (workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
                XSSFSheet sheet = workbook.getSheetAt(i);

                Iterator<Row> rows = (Iterator) sheet.iterator();
                Row firstRow = rows.next();

                Iterator<Cell> ce = firstRow.cellIterator();
                Iterator<Cell> ce = new Iterator<Cell>() {
                    @Override
                    public boolean hasNext() {
                        return false;
                    }

                    @Override
                    public Cell next() {
                        return null;
                    }
                };

                int k = 0;
                int column = 0;

                Iterator<Cell> cv = ce.cellIterator();

                while (ce.hasNext()) {

                    Cell value = ce.next();


                    a.add(ce.next().getStringValue));

                    if(value.getStringCellValue().equalsIgnoreCase("TestCases"))
                    {
                        //XSSFSheet sheet = workbook
                        column = k;

                    }

                    k++;

                    System.out.println(column);

                    while(cv.hasNext())
                    {
                        Cell c = cv.next();

                         Row r = rows.next();

                        if(c.getCell(column).getStringValue().equalsIgnoreCase(testCaseName))
                        {

                            Iterator<Cell> cv = r.cellIterator();

                            while(cv.hasNext())
                            {
                                Cell c = cv.next();

                                if(c.getCellTypeEnum() == CellType.STRING)
                                {
                                  a.add(c.getStringCellValue());
                                }
                                else
                                {
                                  a.add(NumberToTextConverter.toText(c.getNumericCellValue)));
                                }
                            }
                        }

                }
            }
        }
        return a;
    }*/
}
