package design.template;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Description 音乐数据
 */
@Data
@AllArgsConstructor
public class MusicData {
    private String name;
    private int visitCount;
}
