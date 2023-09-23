package vn.edu.usth.wikipediaclient.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import vn.edu.usth.wikipediaclient.MainActivity5;
import vn.edu.usth.wikipediaclient.MainActivity6;
import vn.edu.usth.wikipediaclient.R;

public class Fragment3 extends Fragment {

    private EditText etUsername;
    private EditText etPassword;
    private Button btnRegister;
    private Button btn_change_to_login;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_3, container, false);

        etUsername = view.findViewById(R.id.et_username);
        etPassword = view.findViewById(R.id.et_password);
        btnRegister = view.findViewById(R.id.btn_register);
        btn_change_to_login = view.findViewById(R.id.btn_change_to_login);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lấy dữ liệu người dùng
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                // Kiểm tra dữ liệu người dùng
                if (username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(getActivity(), "Username và password không được rỗng", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Lưu dữ liệu người dùng vào shared preferences
                SharedPreferences sharedPreferences = getActivity().getSharedPreferences("my_app", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("username", username);
                editor.putString("password", password);
                editor.apply();

                // Chuyển sang MainActivity5
                Intent intent = new Intent(getActivity(), MainActivity5.class);
                startActivity(intent);

                // Hiển thị thông báo cho người dùng biết rằng họ đã đăng ký thành công
                Toast.makeText(getActivity(), "Đăng ký thành công", Toast.LENGTH_SHORT).show();
            }
        });

                // Thêm lệnh chuyển sang MainActivity6
            btn_change_to_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Dừng activity hiện tại
                getActivity().finish();

                // Khởi chạy MainActivity6
                Intent intent = new Intent(getActivity(), MainActivity6.class);
                startActivity(intent);
            }
        });

        return view;
    }
}




