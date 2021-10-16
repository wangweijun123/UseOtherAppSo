package com.wangweijun.useso;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.wangweijun.signatrue.Signature;

/**
 * 使用别的应用的app中so
 *
 * 1 反编译拿出so (放到自己app的jnilibs目录下)
 * 2 找出加载so的class
 * 3 定义与之相同的全类名，然后就可以使用了
 *
 *
 * 应该还有其他方式使用，自己写c代码，
 */
public class OtherActivity extends AppCompatActivity {


    private static final String TAG = "wangweijun";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        String signature = Signature.signature();
        Log.i(TAG, "signaturexxx:"+signature);
    }

}
