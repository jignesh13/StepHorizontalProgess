# StepProgressbar Android Project

This repository contains an Android project that showcases a custom view called "StepProgressbar". The StepProgressbar is a visually appealing and interactive view that represents progress in a step-by-step manner, providing a visual indication of completed and remaining steps.

horizontal progessview with step divider use in many fitness app


<image src=https://user-images.githubusercontent.com/20221469/58424764-c8ee3100-80b5-11e9-9a75-f9720de8da00.gif
 width=225 height=400>

 ## Features

- Customizable number of steps and current step position.
- Interactive navigation through steps with smooth animations.
- Customizable appearance, including colors, labels, and icons for each step.
- Support for different step configurations, such as vertical or horizontal layout.
- User-friendly UI with intuitive interactions and visual feedback.
- Callbacks for tracking step changes and responding to user interactions.
- Support for both determinate and indeterminate progress modes.
 
### how to use

To use the StepProgressbar project, follow these steps:

1. Clone or download the repository.
2. Open the project in Android Studio.
3. Build and run the app on an Android device or emulator.
4. Interact with the StepProgressbar to explore the features and customization options.


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

## Usage

- Customize the appearance of the StepProgressbar by modifying colors, labels, icons, and layout configurations to match your design requirements.
- Integrate the StepProgressbar into your own Android projects to provide a visually appealing and interactive step-by-step progress visualization.
- Utilize the step callbacks to track user progress, implement validations, or trigger actions at specific steps.

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
