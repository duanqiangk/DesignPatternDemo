package design.iterator;

import java.util.List;

/**
 * @Description 具体迭代器角色，正序访问文件
 */
public class PositiveIterator implements Iterator {

    /**
     * 持有文件名列表
     */
    private List<String> fileNameList ;

    /**
     * 下一个要访问元素的下标,初始化为0
     */
    private int nextIndex = 0;

    public PositiveIterator(List<String> fileNameList){
        this.fileNameList = fileNameList;
    }

    @Override
    public boolean hasNext() {
        return fileNameList != null && nextIndex < fileNameList.size();
    }

    @Override
    public String nextFileName() {
        if(fileNameList == null || nextIndex >= fileNameList.size()){
            return null;
        }

        return this.fileNameList.get(this.nextIndex ++);
    }
}
