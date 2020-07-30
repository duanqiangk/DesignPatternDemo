package design.visitor;

/**
 * @Description 观众A
 */
public class VisitorA implements Visitor {
    @Override
    public void remark(Movie movie) {
        int remarkLevel = 5;
        if (movie.getTime() > 1){
            remarkLevel -- ;
        }
        if(movie.getType() == "搞笑"){
            remarkLevel -- ;
        }
        System.out.println(String.format("我是VisitorA，我对电影%s的评价为%d颗星" , movie.getName(),remarkLevel));
    }
}
