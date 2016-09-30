#AspectRatioImageView  
An ImageView which you can set the aspect ratio freely (default is 3:2).

# Document
[English](./README.md)
[中文](./README_cn.md)

# Screenshot
<img src="http://7xlpfl.com1.z0.glb.clouddn.com/16-9-30/4968112.jpg" width="200" height="350" alt="AspectRatioImageView"/>

# Dependency
By gradle:
```groovy
dependencies {
    ...
    compile 'com.sherlockshi.widget:aspectratioimageview:1.0.1'
}
```

or by Maven:
```groovy
<dependency>
  <groupId>com.sherlockshi.widget</groupId>
  <artifactId>aspectratioimageview</artifactId>
  <version>1.0.1</version>
</dependency>
```


### Usage
use in xml files, just as an ImageView:
```xml
<com.sherlockshi.widget.AspectRatioImageView
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:scaleType="centerCrop"
        app:width_ratio="4"
        app:height_ratio="2"
        android:src="..."/>
```

### Attributes
AspectRatioImageView has two attributes:
`width_ratio`: Width ratio, type: integer
`height_ratio`: Height ratio, type: integer

> As long as there is an attribute is not set, the ImageView will use default 3:2 aspect ratio.