package vn.edu.usth.wikipediaclient;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity5 extends AppCompatActivity {

    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        // Lấy dữ liệu người dùng từ shared preferences
        SharedPreferences sharedPreferences = getSharedPreferences("my_app", MODE_PRIVATE);
        String username = sharedPreferences.getString("username", "");
        String password = sharedPreferences.getString("password", "");

        // Kiểm tra xem người dùng đã đăng nhập chưa
        if (!username.isEmpty() && !password.isEmpty()) {
            // Đăng nhập thành công
            // Hiển thị dữ liệu người dùng
            TextView tvUsername = findViewById(R.id.tv_username);
            tvUsername.setText(username);
            TextView tvPassword = findViewById(R.id.tv_password);
            tvPassword.setText(password);
            //...
        } else {
            // Đăng nhập thất bại
            //...
        }

        // Lấy dữ liệu người dùng từ màn hình đăng nhập
        TextView tvUsername = findViewById(R.id.tv_username);
        String usernameFromLogin = tvUsername.getText().toString();
        TextView tvPassword = findViewById(R.id.tv_password);
        String passwordFromLogin = tvPassword.getText().toString();

        // Kiểm tra xem dữ liệu người dùng có chính xác hay không
        if (username.equals(usernameFromLogin) &&
                password.equals(passwordFromLogin)) {
            // Đăng nhập thành công
            //...
        } else {
            // Đăng nhập thất bại
            //...
        }
    }
}
