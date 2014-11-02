package resume.kelseyhrubes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ListAdapter extends ArrayAdapter<ResumeItem> {

    private Context context;
    private int layout;
    private List<ResumeItem> resumeItems;

    public ListAdapter(Context context, int resource, List<ResumeItem> objects) {
        super(context, resource, objects);
        this.context = context;
        this.layout = resource;
        this.resumeItems = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Make sure we have a view to work with (may have been given null)
        View itemView = convertView;
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(layout, parent, false);
        }

        ResumeItem currentItem = resumeItems.get(position);

        //set image
        ImageView resumeItemIcon = (ImageView) itemView.findViewById(R.id.resume_item_image);
        resumeItemIcon.setImageResource(currentItem.getIcon());

        //set text
        TextView resumeItemName = (TextView) itemView.findViewById(R.id.resume_item_name);
        resumeItemName.setText(currentItem.getTitle());


        return itemView;
    }
}