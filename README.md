# StepHorizontalProgess
horizontal progessview with step divider use in many fitness app


<image src=https://user-images.githubusercontent.com/20221469/58424764-c8ee3100-80b5-11e9-9a75-f9720de8da00.gif
 width=225 height=400>
 
### how to use
```xml
  <com.example.stephorizontalprogess.MyHorizontalProgessView
        android:id="@+id/myHorizontalProgessView"
        android:layout_width="match_parent"
        android:layout_height="15dp"
        android:layout_marginLeft="10dp"
        android:layout_marginRight="10dp"
        app:currentblockprogesscolor="#fd6376"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:noofpart="5"
        app:progress="30"
        app:maxprogress="100"
        app:progesscolor="#ff8598"
        app:roundcorner="true"
        app:stepcolor="@android:color/white"
        app:viewbackgroundcolor="#dfdfdf">
```

##  Developer
  jignesh khunt
  (jigneshkhunt13@gmail.com)
  
##  License

Copyright 2019 jignesh khunt

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
