package resume.kelseyhrubes;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Button;
import android.widget.ListView;
import android.graphics.Outline;

import java.util.ArrayList;


public class MainActivity extends Activity {

    private ListView resumeItemsList;
    private Activity activity;
    private ArrayList<ResumeItem> resumeItemsSource;
    private ListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        getActionBar().hide();
        setContentView(R.layout.activity_main);
        resumeItemsList = (ListView) findViewById(R.id.resume_items_listview);
        activity = this;
        setupResumeItemsSource();
        populateListView();
    }


    /**
     * manually adds entries for education, experience, skills, extracurriculars, etc
     */
   private void setupResumeItemsSource(){
        resumeItemsSource = new ArrayList<ResumeItem>();
        ResumeItemListFactory rIL = new ResumeItemListFactory(resumeItemsSource);
        rIL.setupAll();
   }

    /**
     * sets adapter to listview for custom styling of list items
     */
   private void populateListView() {
       adapter = new ListAdapter(this, R.layout.list_resume_items, resumeItemsSource);
       resumeItemsList.setAdapter(adapter);
   }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
