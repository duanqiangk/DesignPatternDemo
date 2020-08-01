package design.adapter.cla;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Description Excel可读取的文件
 */
@AllArgsConstructor
@Data
public class ExcelFile {
    /**
     * 文件类型
     */
    private String type;
    /**
     * 文件内容
     */
    private String content;
}
