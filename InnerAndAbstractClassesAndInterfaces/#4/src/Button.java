/**
 * @author UGURINAL
 * on 8/30/2019
 * at 4:02 PM
 * InnerClasses
 */

public class Button {
    private String title;
    private OnClickListener onClickListener;

    public Button(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void buttonOnClick(){
        this.onClickListener.onClick(this.title);
    }

   public interface OnClickListener{
        public void onClick(String title);
   }
}
