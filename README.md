
# react-native-jdpay

## Getting started

`$ npm install react-native-jdpay --save`

### Mostly automatic installation

`$ react-native link react-native-jdpay`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-jdpay` and add `RNJdpay.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNJdpay.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import jdpay.RNJdpayPackage;` to the imports at the top of the file
  - Add `new RNJdpayPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-jdpay'
  	project(':react-native-jdpay').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-jdpay/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-jdpay')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNJdpay.sln` in `node_modules/react-native-jdpay/windows/RNJdpay.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Jdpay.RNJdpay;` to the usings at the top of the file
  - Add `new RNJdpayPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNJdpay from 'react-native-jdpay';

// TODO: What to do with the module?
RNJdpay;
```
  # react-native-letote-jdpay
