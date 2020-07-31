package design.template;

import java.util.Comparator;
import java.util.List;

/**
 * @Description 最不受欢迎音乐排行榜
 */
public class UnpopularityMusic extends MusicDataManager {

    private List<MusicData> musicDataList ;

    @Override
    protected void receiveMusicList(List<MusicData> musicDataList) {
        this.musicDataList = musicDataList;
    }

    @Override
    protected void sortMusicList() {
        this.musicDataList.sort(Comparator.comparingInt(MusicData::getVisitCount));
    }

    @Override
    protected List<MusicData> rangeMusicList(int count) {
        return this.musicDataList.subList(0 , count);
    }
}
