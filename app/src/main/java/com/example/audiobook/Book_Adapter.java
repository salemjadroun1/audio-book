package com.example.audiobook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Book_Adapter extends BaseAdapter {

    private Context c;
    private int resource ;
    private ArrayList<book_interface> books ;

    public Book_Adapter(Context c, int resource, ArrayList<book_interface> books) {
        this.c = c;
        this.resource = resource;
        this.books = books;
    }

    public void addItem(book_interface book){
        this.books.add(book);
    }

    @Override
    public int getCount() {
        return books.size();
    }

    @Override
    public book_interface getItem(int position) {
        return books.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView ;
        if (convertView==null){
            v= LayoutInflater.from(c).inflate(resource,null,false);
        }

        TextView namebook = v.findViewById(R.id.name_book);
        TextView nameAuthor = v.findViewById(R.id.name_author);
        TextView textdescription = v.findViewById(R.id.text_desription);
        ImageView waji_habook = v.findViewById(R.id.wajihabook);


        book_interface book = getItem(position);
        namebook.setText(book.getName_book());
        nameAuthor.setText(book.getName_Author());
        textdescription.setText(book.getText_desription());
        waji_habook.setImageResource(book.getWajihabook());
        return v;
    }


}
