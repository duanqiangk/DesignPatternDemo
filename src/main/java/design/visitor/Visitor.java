package design.visitor;

/**
 * @Description 观众接口
 */
public interface Visitor {
    /**
     * 实现对电影的点评
     */
    void remark(Movie movie);
}
