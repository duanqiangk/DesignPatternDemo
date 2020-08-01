package design.adapter.cla;

/**
 * @Description XLS文件读取适配器
 */
public class XLSReaderAdapter  extends XLSFileReader implements ExcelCore{
    @Override
    public String show(ExcelFile excelFile) {
        return super.getFileContent(excelFile);
    }
}
