package design.adapter.obj;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Description 音乐文件
 */
@Data
@AllArgsConstructor
public class MusicFile {
    /**
     * 文件类型
     */
    private String type;
    /**
     * 文件名
     */
    private String name;
}
