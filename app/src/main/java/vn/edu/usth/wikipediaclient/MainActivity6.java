package vn.edu.usth.wikipediaclient;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity6 extends AppCompatActivity {

    private EditText etUsername;
    private EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);

        // Gán sự kiện click cho nút button đăng nhập
        Button btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lấy dữ liệu người dùng từ edit text
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                // Kiểm tra xem người dùng đã đăng nhập chưa
                if (username.equals("") || password.equals("")) {
                    Toast.makeText(MainActivity6.this, "Username và password không được rỗng", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Lưu dữ liệu người dùng vào shared preferences
                SharedPreferences sharedPreferences = getSharedPreferences("my_app", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("username", username);
                editor.putString("password", password);
                editor.apply();

                // Kiểm tra xem dữ liệu người dùng có chính xác hay không
                if (username.equals(etUsername.getText().toString()) &&
                        password.equals(etPassword.getText().toString())) {
                    // Đăng nhập thành công
                    // Hiển thị thông báo cho người dùng biết rằng họ đã đăng nhập thành công
                    Toast.makeText(MainActivity6.this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();

                    // Chuyển sang MainActivity5
                    Intent intent = new Intent(MainActivity6.this, MainActivity5.class);
                    startActivity(intent);
                } else {
                    // Đăng nhập thất bại
                    Toast.makeText(MainActivity6.this, "Tên đăng nhập hoặc mật khẩu không chính xác", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
