package fileHandling;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class Excel_ReadData {

    public static void main(String[] args) {
        try {
//            File f = new File("C:\\Users\\mmoni\\OneDrive\\Documents\\Sheet1.xlsx");
            FileInputStream fin = new FileInputStream("D:\\nandhaclg\\files\\nec.xlsx");

            XSSFWorkbook xb = new XSSFWorkbook(fin);
            XSSFSheet xs = xb.getSheet("My Sheet");
            XSSFRow r = xs.getRow(4);
            XSSFCell c = r.getCell(10);

            switch (c.getCellType()) {
                case Cell.CELL_TYPE_STRING:
                    String result1 = c.getStringCellValue();
                    System.out.println(result1);
                    break;

                case Cell.CELL_TYPE_NUMERIC:
                    double result2 = c.getNumericCellValue();
                    System.out.println(result2);
                    break;

                case Cell.CELL_TYPE_BOOLEAN:
                    boolean result3 = c.getBooleanCellValue();
                    System.out.println(result3);
                    break;

                case Cell.CELL_TYPE_FORMULA:
                    String formula = c.getCellFormula();
                    System.out.println("Formula: " + formula);
                    // To evaluate formula result
                    FormulaEvaluator evaluator = xb.getCreationHelper().createFormulaEvaluator();
                    CellValue cellValue = evaluator.evaluate(c);
                    switch (cellValue.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            System.out.println(cellValue.getStringValue());
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            System.out.println(cellValue.getNumberValue());
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            System.out.println(cellValue.getBooleanValue());
                            break;
                        default:
                            System.out.println("Unknown formula result type");
                    }
                    break;

                default:
                    System.out.println("Unknown cell type");
            }

            fin.close();
//            xb.close();
        } catch (Exception obj) {
            obj.printStackTrace();
        }
    }
}
