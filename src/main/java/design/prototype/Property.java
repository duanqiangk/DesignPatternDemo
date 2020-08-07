package design.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Description
 */

@Data
@AllArgsConstructor
public class Property implements Cloneable{
    /**
     * 语言
     */
    private String language;
    /**
     * 单词
     */
    private String word;

    @Override
    public Property clone(){
        Property result = null;
        try {
            result = (Property) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public String toString(){
        return String.format("language:%s,word:%s",this.language,this.word);
    }
}
