#AspectRatioImageView  
[ ![Download](https://api.bintray.com/packages/sherlockshi/android-widgets/AspectRatioImageView/images/download.svg) ](https://bintray.com/sherlockshi/android-widgets/AspectRatioImageView/_latestVersion)

宽高比可以自由设置的ImageView(默认为3:2)

# 文档
[English](./README.md)  
中文

# 截图
<img src="http://7xlpfl.com1.z0.glb.clouddn.com/16-9-30/83520279.jpg" width="200" height="400" alt="AspectRatioImageView"/>

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
  <type>pom</type>
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

# 属性
AspectRatioImageView有以下两个属性:  
`width_ratio`: 宽度比例, 类型为integer  
`height_ratio`: 高度比例, 类型为integer  

> 只要有一个属性未设置，就会使用默认比例3:2.

# License
```
Copyright 2016 SherlockShi

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```