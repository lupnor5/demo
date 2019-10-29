# Demo

## Objective

The objective of creating this sample project is to show that it is not necessary to create triggers to maintain relationships in cortex, instead we must take advantage of Hibernate/JPA to create them when it is necessary. This sample project shows how to get rid of the following triggers: 

## after_app_group_insert()

This trigger creates a new relationship between app_group and app_user in the table app_group_membership.

## after_app_group_delete()

This trigger deletes an existing relationship between app_group and app_user when app_user is deleted. 

The same is reached adding explicitly the relationship in the class AppUserServiceImpl.java with this simple change it is possible to avoid completely the usage of triggers.

