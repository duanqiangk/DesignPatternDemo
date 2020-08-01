package design.adapter.obj;

/**
 * @Description 音乐播放程序抽象接口
 */
public interface MusicPlayerProgram {
    /**
     * 开始播放程序
     * @param musicFile 音乐文件
     */
    void programStart(MusicFile musicFile);
}
