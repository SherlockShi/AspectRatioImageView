#AspectRatioImageView  
[ ![Download](https://api.bintray.com/packages/sherlockshi/android-widgets/AspectRatioImageView/images/download.svg) ](https://bintray.com/sherlockshi/android-widgets/AspectRatioImageView/_latestVersion)

An ImageView which you can set the aspect ratio freely (default is 3:2).

# Document
English  
[中文](./README_cn.md)

# Screenshot
<img src="http://7xlpfl.com1.z0.glb.clouddn.com/16-9-30/83520279.jpg" width="200" height="400" alt="AspectRatioImageView"/>

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
  <type>pom</type>
</dependency>
```


# Usage
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

# Attributes
AspectRatioImageView has two attributes:  
`width_ratio`: Width ratio, type: integer  
`height_ratio`: Height ratio, type: integer  

> As long as there is an attribute is not set, the ImageView will use default 3:2 aspect ratio.

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