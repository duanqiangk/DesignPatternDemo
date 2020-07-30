package design.iterator;

/**
 * @Description 抽象聚合角色，文件夹接口
 */
public interface Folder {
    /**
     * 添加文件方法，维护一组文件名
     * @param fileName 文件名
     */
    void appendFile(String fileName);

    /**
     * 获取文件夹文件数量
     * @return 文件夹中文件数量
     */
    int size();

    /**
     * 顺序访问迭代器
     * @return 顺序访问迭代器对象
     */
    Iterator positiveIterator();

    /**
     * 倒叙访问迭代器
     * @return 倒叙访问迭代器对象
     */
    Iterator negativeIterator();
}
