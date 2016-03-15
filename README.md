# spring-boot-rest-openshift

[![Build Status](https://travis-ci.org/jdamor/spring-boot-rest-openshift.svg?branch=master)](https://travis-ci.org/jdamor/spring-boot-rest-openshift)
[![Coverage Status](https://coveralls.io/repos/github/jdamor/spring-boot-rest-openshift/badge.svg?branch=master)](https://coveralls.io/github/jdamor/spring-boot-rest-openshift?branch=master)

[![Stories in Ready](https://badge.waffle.io/jdamor/spring-boot-rest-openshift.png?label=ready&title=Ready)](https://waffle.io/jdamor/spring-boot-rest-openshift)
[![Stories in In Progress](https://badge.waffle.io/jdamor/spring-boot-rest-openshift.png?label=ready&title=In Progress)](https://waffle.io/jdamor/spring-boot-rest-openshift)

Example of REST API with Spring Boot hosted in Openshift

* Travis-CI:
  - Added .travis.yml and badge for branch master.
  - Example of Travis pushing to Openshift in .travis.yml.openshift (rename and change values or "travis setup openshift)
* Coveralls:
  - Unit test (JUnit) coverage added to .travis.yml
  - Added badge status for branch master.
  - Added plugin for Maven
* Waffle.io:
  - Project management board based on Github issues
  - Just login with your github user a accept pull request to start (and add badges)
* Openshift (Using Web console):
  - Create a "Do-It-Yourself 0.1" application
  - Choose this repositorie as Source Code
  - Update .travis.yml to push succesful builds to Openshift
