package vn.edu.usth.wikipediaclient.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import vn.edu.usth.wikipediaclient.MainActivity2;
import vn.edu.usth.wikipediaclient.fragment.Fragment1;
import vn.edu.usth.wikipediaclient.fragment.Fragment2;
import vn.edu.usth.wikipediaclient.fragment.Fragment3;

// tạo ra 1 cái adapter đặt tên là Wikipedia để quản lí các Fragment cho viewpager2
public class Wikipedia extends FragmentStateAdapter {

    public Wikipedia(MainActivity2 fragmentActivity) {
        // ChatGPT : Cụ thể, lớp Wikipedia này có một constructor (hàm tạo) duy nhất nhận một tham số
        // là fragmentActivity, được kế thừa từ lớp FragmentStateAdapter. Hàm tạo này gọi constructor của lớp cha FragmentStateAdapter
        // thông qua lệnh super(fragmentActivity).
        //Khi bạn tạo một đối tượng của lớp Wikipedia và truyền một FragmentActivity vào đó,
        // bạn sẽ có một đối tượng Wikipedia sẵn sàng để sử dụng FragmentStateAdapter để quản lý các Fragment trong ứng dụng Android của bạn.
        // Cụ thể hơn, bạn có thể sử dụng Wikipedia để tạo và cung cấp các Fragment cho ViewPager2 của bạn
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        // Tạo và trả về Fragment tương ứng với vị trí (position)
        // cơ bản ta sử dụng câu lệnh switch case như 1 câu điều kiện để nó sẽ tùy thuộc vào vị trí ( positoin ) để trả về giá trị mà mk setup
        switch (position) {
            case 0:
                return new Fragment1();
            case 1:
                return new Fragment2();
            case 2:
                return new Fragment3();
            default:
                return null; // nếu ko có giá trị thì sẽ về Null
        }
    }

    @Override
    public int getItemCount() {
        // Số lượng Fragment bạn muốn hiển thị (trong trường hợp này là 4)
        return 3;
    }
}
