package com.example.audiobook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.testlist);
        ArrayList<book_interface> books = new ArrayList<>();
        books.add(new book_interface("BRAD MELTZER","The Lincoln Conspiracy","Takes a little-known true story about the FIRST plot to kill Abraham Lincoln and turns it into a first-rate nonfiction thriller. Filled with amazing American history, secret societies, incredible research, and a shocking conspiracy to murder Abraham Lincoln at the dawn of his presidency.",R.drawable.book1));
        books.add(new book_interface("Alex George","The Paris Hours","Exquisite…A testimony to the life-changing power of a single day, the book reads like a Jazz Age Les Miserables.",R.drawable.book2));
        books.add(new book_interface("Delia Owens","Where the Crawdads Sing","A painfully beautiful first novel that is at once a murder mystery, a coming-of-age narrative and a celebration of nature ...",R.drawable.book3));
        books.add(new book_interface("Michael Connelly","Fair Warning","[A] fast-paced thriller, written by a master of the genre",R.drawable.book5));

        Book_Adapter ada= new Book_Adapter(this,R.layout.book_interface,books);

        lv.setAdapter(ada);

        final String []audioname= {"The Lincoln Conspiracy","The Paris Hours","Where the Crawdads Sing","Fair Warning"} ;
        final int []audioimage = {R.drawable.book1,R.drawable.book2,R.drawable.book3,R.drawable.book5};

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),audioface.class);
                intent.putExtra("audio_nameaudio",audioname[position]);
                intent.putExtra("audio_image",audioimage[position]);
                startActivity(intent);
            }
        });

        

    }
}
