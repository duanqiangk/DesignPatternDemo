package design.adapter.cla;

/**
 * @Description Excel 内核
 */
public interface ExcelCore {

    /**
     * 读取文件
     *
     * @param excelFile 文件
     * @return 文件内容
     * @exception RuntimeException 文件类型不匹配时抛出运行时异常
     */
    String show(ExcelFile excelFile);
}
