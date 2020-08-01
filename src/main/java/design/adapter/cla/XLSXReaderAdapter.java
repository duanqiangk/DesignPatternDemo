package design.adapter.cla;

/**
 * @Description XLSX 文件读取适配器
 */
public class XLSXReaderAdapter  extends XLSXFileReader implements ExcelCore{
    @Override
    public String show(ExcelFile excelFile) {
        return super.getFileContent(excelFile);
    }
}
