package vn.edu.usth.wikipediaclient;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import vn.edu.usth.wikipediaclient.Adapter.CustomTabConfigurationStrategy;
import vn.edu.usth.wikipediaclient.Adapter.Wikipedia;

public class MainActivity2 extends AppCompatActivity {

    private ViewPager2 viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tab_layout);

        // Tạo và thiết lập Adapter cho ViewPager2
        Wikipedia adapter = new Wikipedia(this);
        viewPager.setAdapter(adapter);

        // Kết nối TabLayout với ViewPager2
        new TabLayoutMediator(tabLayout, viewPager, new CustomTabConfigurationStrategy()).attach();

    }
}


