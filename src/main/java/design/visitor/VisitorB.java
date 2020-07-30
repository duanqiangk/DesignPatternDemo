package design.visitor;

/**
 * @Description 观众B
 */
public class VisitorB implements Visitor {
    @Override
    public void remark(Movie movie) {
        int remarkLevel = 5;
        if (movie.getTime() > 2){
            remarkLevel -- ;
        }
        if(movie.getType() == "恐怖"){
            remarkLevel -- ;
        }
        System.out.println(String.format("我是VisitorB，我对电影%s的评价为%d颗星" , movie.getName(),remarkLevel));
    }
}
