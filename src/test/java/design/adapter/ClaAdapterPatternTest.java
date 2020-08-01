package design.adapter;

import design.adapter.cla.*;
import org.junit.Test;

/**
 * @Description 类适配器模式测试
 */
public class ClaAdapterPatternTest {

    @Test
    public void test(){
        ExcelFile csvFile = new ExcelFile("csv" , "csv 文件内容在此");
        ExcelFile xlsFile = new ExcelFile("xls" , "xls 文件内容在此");
        ExcelFile xlsxFile = new ExcelFile("xlsx" , "xlsx 文件内容在此");

        ExcelCore csvCore = new CSVReaderAdapter();
        ExcelCore xlsCore = new XLSReaderAdapter();
        ExcelCore xlsxCore = new XLSXReaderAdapter();

        /**
         * 正确读取文件数据
         */
        System.out.println(csvCore.show(csvFile));;
        System.out.println(xlsCore.show(xlsFile));;
        System.out.println(xlsxCore.show(xlsxFile));;

        /**
         * 错误读取文件时抛出异常，仅写一个，其他类似
         */
        try {
            csvCore.show(xlsFile);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
