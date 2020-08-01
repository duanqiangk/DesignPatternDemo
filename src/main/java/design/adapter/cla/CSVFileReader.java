package design.adapter.cla;

/**
 * @Description csv文件读取器
 */
public class CSVFileReader implements ExcelFileReader{
    @Override
    public String getFileContent(ExcelFile file) {
        if("csv".equals(file.getType())){
            return file.getContent();
        }
        throw new RuntimeException("文件类型不匹配，CSV文件读取器不可读取");
    }
}
