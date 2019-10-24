package org.richit.recyclerview.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import org.richit.recyclerview.Adapters.AdapterClass;
import org.richit.recyclerview.Models.Person;
import org.richit.recyclerview.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv = (RecyclerView) findViewById(R.id.rview);
        rv.setLayoutManager(new LinearLayoutManager(this));

        String[] languages = {"Java", "C++", "Android", "C", "Python", "C#", "JavaScript", "HTML", "CSS", "Java", "C++", "Android", "C", "Python", "C#", "JavaScript", "HTML", "CSS"};
        //rv.setAdapter(new AdapterClass(languages));

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Aizan", "Chittagong"));
        personList.add(new Person("Stepano", "Chittagong"));
        personList.add(new Person("Jhon", "Chittagong"));
        personList.add(new Person("Benzamin", "Chittagong"));
        personList.add(new Person("Aizan", "Chittagong"));
        personList.add(new Person("Stepano", "Chittagong"));
        personList.add(new Person("Jhon", "Chittagong"));
        personList.add(new Person("Benzamin", "Chittagong"));

        rv.setAdapter(new AdapterClass(this, personList));
    }
}
