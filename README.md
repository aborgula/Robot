Robot Controller App UI

This project is a user interface prototype for an Android application designed to control a robot. The UI was developed in Java using Android Studio, based on a previously prepared design in Figma. This project does not include backend. 

Overview

The application interface includes the following screens and elements:

Splash Screen with Animation
A welcome screen displaying an animated logo. Implemented in the SplashScreen class.
Main Screen with Element Animations
The main interface includes animated components and a button intended to connect with a robot.
Bluetooth UI Controls
The layout includes UI elements designed to represent Bluetooth interaction, such as:
Four directional control buttons
A switch to simulate connection/disconnection
Placeholder text fields for robot sensor data (e.g. tilt, distance)
User Interface Design

The application uses a landscape layout by default, with automatic adjustment to portrait orientation when the device is rotated.
The UI is implemented using XML layouts that closely replicate the original Figma design.
AnimationUtils is used to add entry animations to elements, enhancing the interface with a more modern appearance.
