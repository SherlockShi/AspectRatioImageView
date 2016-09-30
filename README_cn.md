#AspectRatioImageView  
宽高比可以自由设置的ImageView(默认为3:2)

# Document
[English](./README.md)
[中文](./README_cn.md)

# 截图
<img src="http://7xlpfl.com1.z0.glb.clouddn.com/16-9-30/10154521.jpg" width="200" height="350" alt="AspectRatioImageView"/>

# 依赖
使用gradle依赖:
```groovy
dependencies {
    ...
    compile 'com.sherlockshi.widget:aspectratioimageview:1.0.1'
}
```

或使用Maven依赖:
```groovy
<dependency>
  <groupId>com.sherlockshi.widget</groupId>
  <artifactId>aspectratioimageview</artifactId>
  <version>1.0.1</version>
</dependency>
```

# 用法
像使用ImageView一样,在XML文件中使用:
```xml
<com.sherlockshi.widget.AspectRatioImageView
    android:layout_width="match_parent"
    android:layout_height="0dp"
    android:scaleType="centerCrop"
    app:width_ratio="4"
    app:height_ratio="2"
    android:src="..."/>
```

### 属性
AspectRatioImageView有以下两个属性:
`width_ratio`: 宽度比例, 类型为integer
`height_ratio`: 高度比例, 类型为integer

> 只要有一个属性未设置，就会使用默认比例3:2.