package design.iterator;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @Description 具体聚合角色，指的是类似Windows中近期访问文件夹
 */
public class RecentFileFolder implements Folder {

    /**
     * 文件夹中文件名列表，添加时已按照时间顺序
     */
    private List<String> fileNameList = Lists.newArrayList();

    @Override
    public void appendFile(String fileName) {
        fileNameList.add(fileName);
    }

    @Override
    public int size() {
        return fileNameList.size();
    }

    @Override
    public Iterator positiveIterator() {
        return new PositiveIterator(this.fileNameList);
    }

    @Override
    public Iterator negativeIterator() {
        return new NegativeIterator(this.fileNameList);
    }
}
