package com.example.hzhz.lastwork;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private MyDatabaseHelper dbHelper;
    private EditText editText_name;
    private EditText editText_tel;
    private EditText editText_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editText_name = (EditText) findViewById(R.id.edit_name);
        editText_tel = (EditText) findViewById(R.id.edit_tel);
        editText_email = (EditText) findViewById(R.id.edit_email);



        dbHelper = new MyDatabaseHelper(this,"Vip.db",null,1);
        Button vip_ok = (Button) findViewById(R.id.vip_ok);
        vip_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.getWritableDatabase();
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                ContentValues values = new ContentValues();
                final String str_name = editText_name.getText().toString();
                final String str_tel = editText_tel.getText().toString();
                final String str_email = editText_email.getText().toString();
                //开始第一条数据
                values.put("name",str_name);
                values.put("tel",str_tel);
                values.put("email",str_email);
                db.insert("Vip",null,values);//插入第一条
                values.clear();
                Toast.makeText(Main2Activity.this,"已提交！",Toast.LENGTH_SHORT).show();
                finish();
            }
        });


    }
}
