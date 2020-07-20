package sg.edu.rp.c346.id18015938.demoemployeeinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvList;
    ArrayList<Jobs> JobsList;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvList = findViewById(R.id.listViewList);
        JobsList = new ArrayList<>();

        Jobs p1 = new Jobs("John", "Software Technical Leader", 3400);
        Jobs p2 = new Jobs("May", "Programmer", 2200);

        JobsList.add(p1);
        JobsList.add(p2);

        adapter = new CustomAdapter(this, R.layout.row, JobsList);

        lvList.setAdapter(adapter);
    }
}
