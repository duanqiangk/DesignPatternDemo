package design.adapter.cla;

/**
 * @Description XLS文件读取器
 */
public class XLSFileReader implements ExcelFileReader {
    @Override
    public String getFileContent(ExcelFile file) {
        if("xls".equals(file.getType())){
            return file.getContent();
        }
        throw new RuntimeException("文件类型不匹配，xls文件读取器不可读取");
    }
}
