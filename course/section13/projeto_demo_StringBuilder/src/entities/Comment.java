package entities;

public class Comment {
    
    private String text;

    // CONSTRUCTORS
    public Comment(){
    }
    public Comment(String text){
        this.text = text;
    }

    //getters and setters
    public String getText(){
        return text;
    }
    public void setText(String text){
        this.text = text;
    }
}
