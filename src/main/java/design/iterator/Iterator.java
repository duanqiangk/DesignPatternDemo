package design.iterator;

/**
 * @Description 抽象迭代器角色
 */
public interface Iterator {
    /**
     * 是否还有下一个元素
     * @return true/false
     */
    boolean hasNext();

    /**
     * @return 下一个文件名，如果没有则为null
     */
    String nextFileName();
}
