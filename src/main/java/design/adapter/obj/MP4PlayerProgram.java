package design.adapter.obj;

/**
 * @Description MP4音乐播放程序
 */
public class MP4PlayerProgram implements MusicPlayerProgram {
    @Override
    public void programStart(MusicFile musicFile) {
        String option = String.format("MP4播放程序无法播放该音乐文件,文件类型%s,文件名%s",musicFile.getType(),musicFile.getName());
        if("mp4".equals(musicFile.getType())){
            option = String.format("音乐%s正在播放---MP4播放程序",musicFile.getName());
        }
        System.out.println(option);
    }
}
