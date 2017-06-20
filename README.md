# 蒲公英快速集成
对蒲公英官网的再次封装，主要用于快速内测集成，自动更新。

## 使用方式

project build.gradle

```groovy
allprojects {
    repositories {
        jcenter()
        maven { url 'https://jitpack.io' }
        maven { url "https://raw.githubusercontent.com/Pgyer/mvn_repo_pgyer/master" }
    }
}
```
module build.gradle

```groovy
dependencies {
    debugCompile 'com.github.xesam:pgyer-quick:0.1'
}
```

Activity
```java
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Pgyer.register(this, Pgyer.UPDATE);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Pgyer.unregister(Pgyer.UPDATE);
    }
}
```