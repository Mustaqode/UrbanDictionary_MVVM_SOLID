# UrbanDictionary_MVVM_SOLID
A dictionary app made using MVVM and Clean Architecture principles

This app is made to achieve MVVM with Clean Architecture as much as possible. 

I have separated the entire application into three modules.

# 1) App 
  This module contains Presentation layer (Activity, ViewModel) and FrameWork layer (Libraries like Retrofit, Koin etc). This cam be replaced with other sdks (Having Kotlin Multiplatform projects in mind) 
  
# 2) Data
  This module is responsible for aggregating data needed in the app strictly following the Dependency inversion principle that 
  it doesn't know the concept of where and how the required data is acquired when it comes to dealing with framework            components; it could be from inbuilt gps or from a network request. It doesn't care. 
 
# 3) Domain 
  This layer contains the business logic of the application
  
# Tech stack
  1) Lifecycle components (ViewModel)
  2) Koin 
  3) Retrofit
  4) Coroutines
  
![header image] (https://github.com/Mustaqode/UrbanDictionary_MVVM_SOLID/blob/master/screenshot.png)
