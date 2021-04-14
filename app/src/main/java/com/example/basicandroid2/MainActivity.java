package com.example.basicandroid2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import cyd.awesome.material.AwesomeText;
import cyd.awesome.material.FontCharacterMaps;

public class MainActivity extends AppCompatActivity {

    Button button;
    AwesomeText ImgShowHidePassword;
    boolean pwd_status = true;
    EditText EdPassword;
    private CheckBox ShowPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ShowPass = findViewById(R.id.showPass);
        button = findViewById(R.id.btn_mulai);
        EdPassword = (EditText) findViewById(R.id.field_password);
//        ImgShowHidePassword = (AwesomeText)findViewById(R.id.ImgShowPassword);


        ShowPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ShowPass.isChecked()){
                    //Saat Checkbox dalam keadaan Checked, maka password akan di tampilkan
                    EdPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }else {
                    //Jika tidak, maka password akan di sembuyikan
                    EdPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hai", Toast.LENGTH_SHORT).show();
            }
        });
//        ImgShowHidePassword.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(pwd_status){
//                    EdPassword.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
//                    pwd_status = false;
//                    ImgShowHidePassword.setMaterialDesignIcon(FontCharacterMaps.MaterialDesign.MD_VISIBILITY);
//                    EdPassword.setSelection(EdPassword.length());
//                } else {
//                    EdPassword.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD | InputType.TYPE_CLASS_TEXT);
//                    pwd_status = true;
//                    ImgShowHidePassword.setMaterialDesignIcon(FontCharacterMaps.MaterialDesign.MD_VISIBILITY_OFF);
//                    EdPassword.setSelection(EdPassword.length());
//                }
//            }
//        });
    }
}