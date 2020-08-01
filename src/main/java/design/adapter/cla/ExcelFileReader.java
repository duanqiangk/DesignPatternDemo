package design.adapter.cla;

/**
 * @Description 文件读取器抽象接口
 */
public interface ExcelFileReader {
    /**
     * 读取文件内容
     * @param file 文件
     * @return 文件内容
     */
    String getFileContent(ExcelFile file);
}
