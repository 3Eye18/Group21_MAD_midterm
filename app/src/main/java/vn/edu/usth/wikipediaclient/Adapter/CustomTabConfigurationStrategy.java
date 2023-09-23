package vn.edu.usth.wikipediaclient.Adapter;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import vn.edu.usth.wikipediaclient.R;

public class CustomTabConfigurationStrategy implements TabLayoutMediator.TabConfigurationStrategy {
    @Override
    public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
        // Tạo custom giao diện cho tiêu đề tab
        tab.setCustomView(R.layout.custom_tab_layout);
        ImageView tabIcon = tab.getCustomView().findViewById(R.id.tab_icon);
        TextView tabTitle = tab.getCustomView().findViewById(R.id.tab_title);

        // Tùy chỉnh biểu tượng và tiêu đề của tab dựa vào vị trí
        // Tiếp tục sử dụng loại câu điều kiện switch case và trả về giá trị đã setup
        switch (position) {
            case 0:
                tabIcon.setImageResource(R.drawable.home);    // set icon cho title
                tabTitle.setText("Home"); // đổi tên title
                break;
            case 1:
                tabIcon.setImageResource(R.drawable.search);
                tabTitle.setText("Search");
                break;
            case 2:
                tabIcon.setImageResource(R.drawable. account);
                tabTitle.setText("Account");
            default:
                break;
        }
    }
}

