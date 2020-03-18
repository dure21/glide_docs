package io.yagus.glide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Glide 함수
        * -override(): 지정한 이미지의 크기만큼만 불러올 수 있습니다. 이를 통해 이미지 로딩속도를 최적화 할 수 있습니다.
        * -placeholder(): 이미지를 로딩하는 동안 처음에 보여줄 placeholder이미지를 지정할 수 있습니다.
        * -error(): 이미지로딩에 실패했을경우 실패 이미지를 지정할 수 있습니다.
        * -thumbnail(): 지정한 %비율 만큼 미리 이미지를 가져와서 보여줍니다. 0.1f로 지정했다면 실제 이미지 크기 중 10%만 먼저 가져와서 흐릿하게 보여줍니다.
        * -asGif(): 정적인 이미지 뿐만 아니라 GIF도 로딩할 수 있습니다.
        * -fitCenter(): 실제 이미지가 이미지뷰의 사이즈와 다를 때, 이미지와 이미지뷰의 중간을 맞춰서 이미지 크기를 스케일링한다.
        * -CenterCrop(): 실제 이미지가 이미지뷰의 사이즈보다 클 때, 이미지뷰의 크기에 맞춰 이미지 중간부분을 잘라서 스케일링한다.
        * -bitmapTransform(new RoundedCornersTransformation(context,radius,margin)):
        * **참고사이트:
        * https://github.com/codepath/android_guides/wiki/Displaying-Images-with-the-Glide-Library
        * https://bumptech.github.io/glide/
        * https://gun0912.tistory.com/17*/

        ImageView imageView1 = findViewById(R.id.imageView1);
        Glide.with(this).load(R.drawable.drawableimage).into(imageView1);

        ImageView imageView2 = findViewById(R.id.imageView2);
        Glide.with(this).load("https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png").into(imageView2);
    }
}
