package vn.edu.usth.wikipediaclient;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startButton = findViewById(R.id.Button);
        startButton.setOnClickListener(new View.OnClickListener() {
            // cách hoạt động là trỏ vào cái button nó sẽ chuyển sang activity 2. Lưu ý khi code để ý ID button vì nếu muốn trỏ button nào để chuyển thì set ID but đó
            // câu lệnh thứ 2 là kích hoạt thì nó sẽ chuyển - lệnh start á !
            @Override
            public void onClick(View v) {
                // Chuyển từ Activity1 sang Activity2
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                // tạo ra 1 intent ( intent đơn giản là 1 đối tượng đc tạo để ra thực hiện 1 hoạt động cụ thể - ở đây là chuyển activity )
                // MainActivity.this : là nơi intent sẽ bắt đầu trỏ vào tức nó sẽ bắt đầu chuyển từ mainactivity -> activity 2 ( Activity2.claas )
                startActivity(intent);   // gọi hàm đẻe sử dụng cái intent thôi !
            }
        });

    }
}