package resume.kelseyhrubes;


public class ResumeItem {

    private String title;
    //references a Drawable ID
    private int icon;

    public ResumeItem(String title, int icon){
        this.title = title;
        this.icon = icon;
    }

    public int getIcon(){
        return  this.icon;
    }

    public String getTitle(){
        return this.title;
    }

}