# TabLayout-Bug (Fixed)
The is simple project to reproduce TabLayout tab background bug in support library 28.0.0.  
  
When you add `app:tabBackground="?android:attr/selectableItemBackgroundBorderless"` to TabLayout,  
press tab must be like borderless with round ripple.  
  
**Fixed:** Just add `app:tabUnboundedRipple="true"` to TabLayout in your layout xml.

## Screenshot
### 27.1.1
<img src="https://github.com/hearsilent/TabLayout-Bug/raw/master/screenshots/device-2018-09-27-235044.png" height="500">

### 28.0.0
<img src="https://github.com/hearsilent/TabLayout-Bug/raw/master/screenshots/device-2018-09-27-234846.png" height="500">

## Issue Tracker
- [TabLayout tab background issue](https://issuetracker.google.com/issues/116745358)
- [[TabLayout] TabLayout tab background issue](https://issuetracker.google.com/issues/116747147)
