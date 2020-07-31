package design.template;

import java.util.List;

/**
 * @Description 音乐数据管理，抽象类角色
 */
public abstract class MusicDataManager {

    /**
     * 获取最佳音乐排行榜单
     * @param musicDataList 入选音乐数据
     * @param count 最佳榜单音乐数目
     * @return 榜单
     */
    public List<MusicData> musicList(List<MusicData> musicDataList,int count){
        receiveMusicList(musicDataList);
        sortMusicList();
        return rangeMusicList(count);
    }

    /**
     * 获取音乐数据
     * @param musicDataList 音乐数据表
     */
    protected abstract void receiveMusicList(List<MusicData> musicDataList);

    /**
     * 对音乐数据进行排序
     */
    protected abstract void sortMusicList();

    /**
     * 获取音乐榜单
     * @param count 榜单音乐数量
     * @return 音乐榜单
     */
    protected abstract List<MusicData> rangeMusicList(int count);
}
