package asu.cis.transportation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class res extends AppCompatActivity {
    RecyclerView recyclerView;
    String From[],To[],Timeout[],TimeArrive[];
    int image = R.drawable.busicon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res);

        recyclerView =findViewById(R.id.recycle);

        From = getResources().getStringArray(R.array.from);
        To = getResources().getStringArray(R.array.To);
        Timeout = getResources().getStringArray(R.array.TimeOut);
        TimeArrive = getResources().getStringArray(R.array.ArriveTime);
        Adabter myadabter=new Adabter(this,From,To,Timeout,TimeArrive,image);
        recyclerView.setAdapter(myadabter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}