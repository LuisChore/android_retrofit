## [Movie  App](https://github.com/LuisChore/android_retrofit/tree/main/01MovieApp)

**To use it**: Create an API-key and put it in *strings.xml*

**Description**: App that fetches online data from a Movie database API themoviedb.org (Retrofit) in a JSON format and converts it in JAVA Objects (GSON) and displays the most popular movies using CardView and RecyclerView. App developed using MVVM architecture pattern. 
	
**Android Topics**: 

* *Retrofit:* Library for making network requests in Android Apps, used to retrieve and upload data via a REST-based web service.
    * Retrofit Interface: Services interfaces that define the API endpoints and their associated HTTP methods
    * Retrofit Instance: It works as a central configuration point,  Retrofit Instance is created to use it for the creation of Services Instances.
* *GSON*: A Java serialization/deserialization library to convert Java Objects into JSON and back.
* *jsonschema2pojo:*  Online site to Generate Plain Old Java Objects from JSON or JSON-Schema.
* *Repository*: Class that isolates the data source from the rest of the app and provides a clean API for data access to the ViewModel.
* *ViewModel*: MVVM layer that exposes data to the UI components using LiveData and other observable mechanisms 
* *LiveData*: It is a data holder class that can be observed by UI components. When data changes in the ViewModel, LiveData notifies the UI allowing it to interact and update accordingly 
* *SwipeRefreshLayout*:  Implement the swipe-to-refresh UI pattern, it detects a vertical swipe, displays a distinctive progres bar and triggers callback methods in your app.
* *DataBinding*: Library that allows you to bind UI components in your layouts to data sources in your app. 
* *BaseObservable*.Observable base class that enable automatic data binding and make it easier to bind data, it provides notifyPropertyChanged()
* *@Bindable.* Annotation  is used on the getters in an Observable class in order to mention to Data Binding that those properties  are going to be binded.
* *Glide:*  An image loading and caching library for Android focused on smooth scrolling.
* *@BindingAdapter:* Binding Adapters are responsible for making the appropriate framework calls to set values. A static binding adapter method with the BindingAdapter annotation lets you customize how a setter for an attribute is called.
