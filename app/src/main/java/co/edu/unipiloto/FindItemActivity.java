package co.edu.unipiloto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class FindItemActivity extends AppCompatActivity {

    itemSearch itemS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_item);
        itemS = new itemSearch(this);
    }

    public void onClickFindItem(View view){
        TextView types = (TextView) findViewById(R.id.type);
        Spinner color = (Spinner) findViewById(R.id.color);
        String itemType = String.valueOf(color.getSelectedItem());
        String items = itemS.getType(itemType);
        types.setText(items);
    }
}