package com.example.ahtcfg24.baymax;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class ActivityRegister extends Activity
{



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        EditText username = (EditText) findViewById(R.id.rg_username);
        EditText password = (EditText) findViewById(R.id.rg_password);
        EditText password2 = (EditText) findViewById(R.id.rg_password2);
        EditText email = (EditText) findViewById(R.id.rg_email);
        EditText phone = (EditText) findViewById(R.id.rg_phone);
    }


    public void ensure(View view)
    {

        startActivity(new Intent(ActivityRegister.this, ActivityMain.class));
    }

//    private boolean checkInput(String num, String name, String location, String birth)
//    {
//        boolean flag = false;
//        if (!num.matches("[0-9]{10}"))
//        {
//            Toast("ѧ��Ϊ10λ���֣�");
//        } else if (!name.matches("[\\u4E00-\\u9FA5]{2,4}"))
//        {
//            MyDialog.show("����д��ȷ��������");
//        } else if (!location.matches("[\\u4E00-\\u9FA5]{2,5}"))
//        {
//            MyDialog.show("����д��ȷ�ļ��ᣡ");
//        } else if (!birth.matches("[1][9][0-9]{2}[/.]([0][1-9]|[1][0-2])[/.]([0][1-9]|[1][0-9]|[2][0-9]|[3][0-1])"))
//        {
//            MyDialog.show("����д��ȷ�ĳ������£���1996.01.01");
//        } else flag = true;
//
//        return flag;
//    }

}
