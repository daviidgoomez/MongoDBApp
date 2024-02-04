package com.example.mongodbapp

sealed class NavigationActivity(val route: String) {

  object HomeApp: NavigationActivity("Home")

  object BuildCollectionScreen: NavigationActivity("Collection")

  object InsertDocument: NavigationActivity("Insert")

  object DeleteDocument: NavigationActivity("Delete")

  object UpdateDocument: NavigationActivity("Update")

  object SelectDocument: NavigationActivity("Select")


}