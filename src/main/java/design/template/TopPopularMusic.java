package design.template;

import java.util.Comparator;
import java.util.List;

/**
 * @Description 最受欢迎排行榜，具体子类
 */
public class TopPopularMusic extends MusicDataManager{

    private List<MusicData> musicDataList;

    @Override
    protected void receiveMusicList(List<MusicData> musicDataList) {
        this.musicDataList = musicDataList;
    }

    @Override
    protected void sortMusicList() {
        /**
         * 最高音乐榜单根据访问数量逆序排序
         */
        this.musicDataList.sort((d1 , d2) -> d2.getVisitCount() - d1.getVisitCount());
    }

    @Override
    protected List<MusicData> rangeMusicList(int count) {
        return this.musicDataList.subList(0 , count);
    }
}
