package design.template;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

/**
 * @Description 模板方法模式测试
 */
public class TemplateTest {

    @Test
    public void test() {
        List<MusicData> musicData = initMusicData();

        MusicDataManager topMusicDataManager = new TopPopularMusic();
        List<MusicData> musicData1 = topMusicDataManager.musicList(musicData, 10);
        prtData("最受欢迎音乐列表", musicData1);

        MusicDataManager unpopularityManager = new UnpopularityMusic();
        List<MusicData> musicData2 = unpopularityManager.musicList(musicData, 10);
        prtData("最不受欢迎音乐列表", musicData2);
    }

    void prtData(String message, List<MusicData> dataList) {
        System.out.println(message);
        dataList.forEach((data) -> System.out.println(String.format("%-20s%-20s", data.getName(), data.getVisitCount())));
    }

    /**
     * 初始化音乐数据列表
     *
     * @return 音乐数据
     */
    public List<MusicData> initMusicData() {
        return Lists.newArrayList(
                new MusicData("Dogs", 20),
                new MusicData("Misunderstood", 39),
                new MusicData("Give Me Love", 329),
                new MusicData("Dream", 202),
                new MusicData("Shape Of You", 88),
                new MusicData("Good Vibes", 101),
                new MusicData("Yesterday", 339),
                new MusicData("Sold out", 195),
                new MusicData("Victory", 561),
                new MusicData("Longing", 213),
                new MusicData("Lily", 195),
                new MusicData("This Empty Space", 564),
                new MusicData("17", 1231),
                new MusicData("Unspoken", 156),
                new MusicData("Evergreen", 546)
        );
    }
}
