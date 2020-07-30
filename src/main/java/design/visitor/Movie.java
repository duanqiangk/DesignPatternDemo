package design.visitor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description 电影
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    /**
     * 电影名
     */
    private String name;
    /**
     * 电影持续时间（小时）
     */
    private int time ;
    /**
     * 电影类别
     */
    private String type;
}
