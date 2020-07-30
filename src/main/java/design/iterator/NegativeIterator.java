package design.iterator;

import java.util.List;

/**
 * @Description 具体迭代器对象，倒叙访问迭代器
 */
public class NegativeIterator implements Iterator {

    /**
     * 文件名列表
     */
    private List<String> fileNameList ;

    /**
     * 下一个要访问的对象
     */
    private int nextIndex;

    public NegativeIterator(List<String > fileNameList){
        this.fileNameList = fileNameList;
        this.nextIndex = (fileNameList == null? 0 : fileNameList.size() - 1);
    }
    @Override
    public boolean hasNext() {
        return fileNameList != null && this.nextIndex >= 0;
    }

    @Override
    public String nextFileName() {
        if(this.fileNameList == null || this.nextIndex < 0){
            return null;
        }
        return this.fileNameList.get(this.nextIndex --);
    }
}
