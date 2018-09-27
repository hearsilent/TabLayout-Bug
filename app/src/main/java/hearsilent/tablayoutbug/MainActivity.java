package hearsilent.tablayoutbug;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
        setUpViews();
    }

    private void findViews() {
        mToolbar = findViewById(R.id.toolbar);
        mTabLayout = findViewById(R.id.tabLayout);
    }

    private void setUpViews() {
        setSupportActionBar(mToolbar);

        for (int i = 0; i < 7; i++) {
            View view = View.inflate(this, R.layout.tab_item, null);
            TextView textView = view.findViewById(R.id.textView);
            textView.setText(String.format(Locale.getDefault(), "%d", i + 1));
            textView.setTextColor(ContextCompat.getColor(this, i == 0 ? R.color.white_text : R.color.white_text_secondary));

            mTabLayout.addTab(mTabLayout.newTab().setCustomView(view));
        }

        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab == null || tab.getCustomView() == null)
                    return;
                TextView textView = tab.getCustomView().findViewById(R.id.textView);
                if (textView != null)
                    textView.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.white_text));
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                if (tab == null || tab.getCustomView() == null)
                    return;
                TextView textView = tab.getCustomView().findViewById(R.id.textView);
                if (textView != null)
                    textView.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.white_text_secondary));
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

}
