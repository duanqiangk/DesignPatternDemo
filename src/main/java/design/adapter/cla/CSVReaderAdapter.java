package design.adapter.cla;

/**
 * @Description CSV文件读取适配器
 */
public class CSVReaderAdapter extends CSVFileReader implements ExcelCore{

    /**
     * 使用父类方法 CSVFileReader.getFileContent() 获取文件内容
     * 使用时创建该适配器，定义类型为ExcelCore ， 例如：
     * ExcelCore core = new CsvReaderAdapter();
     *
     * @param excelFile 文件
     * @return 文件内容
     */
    @Override
    public String show(ExcelFile excelFile) {
        return super.getFileContent(excelFile);
    }
}
