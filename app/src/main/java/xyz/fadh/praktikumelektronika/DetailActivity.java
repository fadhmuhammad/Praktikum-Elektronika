package xyz.fadh.praktikumelektronika;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mukesh.MarkdownView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();

        MarkdownView markdownView = (MarkdownView) findViewById(R.id.markdown_view);
        markdownView.setMarkDownText("# Hello World\nThis is a simple markdown"); //Displays markdown text
    }
}
