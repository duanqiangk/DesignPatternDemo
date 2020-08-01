package design.adapter.cla;

/**
 * @Description xlsx文件读取器
 */
public class XLSXFileReader implements ExcelFileReader {
    @Override
    public String getFileContent(ExcelFile file) {
        if("xlsx".equals(file.getType())){
            return file.getContent();
        }
        throw new RuntimeException("文件类型不匹配，XLSX文件读取器不可读取");
    }
}
