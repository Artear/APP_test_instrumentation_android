package com.artear.firsttestintegration;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.artear.firsttestintegration.ListActivity.NEW_USER;
import static com.artear.firsttestintegration.ListActivity.RESULT_USER;

public class AddItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText name = (EditText) findViewById(R.id.editText);
        final EditText password = (EditText) findViewById(R.id.editText2);
        final EditText email = (EditText) findViewById(R.id.editText3);

        Button buttonSubmit = (Button) findViewById(R.id.button_submit);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Validate
                if(TextUtils.isEmpty(name.getText()) || TextUtils.isEmpty(password.getText()) || 
                        TextUtils.isEmpty(email.getText())){
                    Toast.makeText(AddItemActivity.this, "All fields are required to create new user",
                            Toast.LENGTH_SHORT).show();
                    return;
                }
                
                //Create new user
                User user = new User();
                user.setName(name.getText().toString());
                user.setPassword(password.getText().toString());
                user.setEmail(email.getText().toString());
                
                //Pass the user to main list activity
                Intent intent = new Intent();
                intent.putExtra(NEW_USER, user);
                setResult(RESULT_USER, intent);
                
                finish();
            }
        });
    }
}
