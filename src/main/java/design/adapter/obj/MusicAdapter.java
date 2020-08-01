package design.adapter.obj;

/**
 * @Description 适配器类
 */
public class MusicAdapter implements MusicPlayer {

    /**
     * 持有播放程序实例对象
     */
    private MusicPlayerProgram playerProgram ;

    public MusicAdapter(MusicPlayerProgram playerProgram){
        this.playerProgram = playerProgram;
    }

    @Override
    public void play(MusicFile musicFile) {
        playerProgram.programStart(musicFile);
    }
}
