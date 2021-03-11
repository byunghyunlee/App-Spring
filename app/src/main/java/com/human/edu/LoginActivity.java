package com.human.edu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                EditText editText, editTextPassword;
                editTextID = findViewById(R.id.editTextID);
                editTextPassword
            }
        });
    }
    //Login.xml에서 onClick 속성을 gotoMain이라고 지정했을 경우 사용가능(아래)
    public void gotoMain(View view) {
        EditText editTextID, editTextPassword;
        //위에서 매개변수 view는 버튼뷰를 가리킵니다.
        editTextID = findViewById(R.id.editTextID);
        editTextPassword = findViewById(R.id.editTextPassword);
        Toast.makeText(LoginActivity.this, "디버그: " + editTextID.getText(),Toast.LENGTH_LONG).show();
        //로그인 버튼을 onClick했을때
        Intent mainIntent = new Intent(LoginActivity.this,MainActivity.class);
        //데이터를 입력해서 메인액티비티화면으로 보내기(아래)
        mainIntent.putExtra("editTextID",editTextID.getText().toString());//아이디
        mainIntent.putExtra("editTextPassword",editTextPassword.getText().toString());//암호
        startActivity(mainIntent);//편지봉투Intent를 개봉 = 화면불러오기실행
        finish();//LoginActivity화면을 종료(프로그램종료X)
    }
}