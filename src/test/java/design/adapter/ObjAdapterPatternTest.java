package design.adapter;

import design.adapter.obj.*;
import org.junit.Test;

/**
 * @Description 对象适配器模式测试
 */
public class ObjAdapterPatternTest {

    @Test
    public void test(){
        MusicFile mp3Music = new MusicFile("mp3","稻香");
        MusicFile mp4Music = new MusicFile("mp4","七里香");

        /**
         * 正确播放案例
         */
        MusicPlayer mp3Player = new MusicAdapter(new MP3PlayerProgram());
        mp3Player.play(mp3Music);

        MusicPlayer mp4Player = new MusicAdapter(new MP4PlayerProgram());
        mp4Player.play(mp4Music);

        /**
         * 错误播放案例
         */
        mp4Player.play(mp3Music);
    }
}
