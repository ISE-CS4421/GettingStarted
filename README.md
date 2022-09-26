# CS4421-ISE

Welcome to the GitHub repository for the CS4421-2022 cohort (ISE) at the University of Limerick!
Here you will find all the exercises and content regarding CS4421. You are free to submit PR's to improve the content.

# Student Instructions

For this set of exercises, we are going to be working with files in the src/main/java/com/example/project/ directory.
The goal of this assignment is to get you used to using utilises like GitHub, version controll, and begin getting an understanding of Java.
In this repo, you'll find two main paths, main and test. The main folder will contain all of the code that we'll be working on and the test directory is where you'll find the automated tests we run to check the code. You won't need to do anything with the tests, but if you are interested in seeing how we do the automated testing, have a look in that test folder. If you are interested in running the automated tests on your local computer, you'll need a java tool called Gradle, link below for installation and reference material.

 * [Gradle Installation](https://www.youtube.com/watch?v=h6Figshq6_I&ab_channel=AutomationStepbyStep)
 * [Gradle Documentation](https://docs.gradle.org/current/userguide/userguide.html)
 
**NOTE**: Do not commit any changes to the test directory. When you create a pull request to merge your code, it will show up and we'll ask you to revert those changes.

## Requirements

You will need to make sure that you have completed all the requirements from the installation sheet provided on moodle.


## Directory Structure

```bash
src
├───main
│   └───java
│       └───com
│           └───example
│               └───project
│                   ├───GettingStarted.java
│                   ├───ComputationMethods.java
│                   ├───SelectionMethods.java
│                   ├───StringManipulation.java
│                   └───RepetitionMethods.java
└───test
    └───java
        └───com
            └───example
                └───project
                    ├───AbstractTestingImp.java
                    ├───GettingStartedTest.java
                    ├───ComputationMethodsTest.java
                    ├───SelectionMethodsTest.java
                    ├───StringManipulationTest.java
                    └───RepetitionMethodsTest.java
```
## Day One Exercise

For today, you are going to look at the GettingStarted.java located [here](src/main/java/com/example/project/GettingStarted.java).

Follow the instructions in the file and attempt the exercises. 
The first thing you should do once you've cloned the repo is to make a new branch for your changes.
```bash
git checkout -b NewBranchName
```
Nex thing is to attempt the exercises in the sheet. Once you're happy with your changes, add the changes, commit them and push the changes to GitHub.
```git
git add DirectoryPath/fileName.java
git commit -m "A meaningful commit message"
git push
```

Review your changes on the GitHub repo, then once happy, make a pull request into the original branch. 
## Order of Exercises

 * [GettingStarted.java](src/main/java/com/example/project/GettingStarted.java)
 * [ComputationMethods.java](src/main/java/com/example/project/ComputationMethods.java)
 * [SelectionMethods.java](src/main/java/com/example/project/SelectionMethods.java)
 * [StringManipulation.java](src/main/java/com/example/project/StringManipulation.java)
 * [RepetitionMethods.java](src/main/java/com/example/project/RepetitionMethods.java)

Primary Authors
===============
* __[Adam J. Doherty](https://github.com/AdamD115114)__
    Master student at UL
* __[Ivan Hugo Guevara](https://github.com/IvanHGuevara)__
    PhD researcher at Confirm Centre@UL
* __[Dr. Salim Saay](https://github.com/saaysalim)__
    Lecturer at University of Limerick


Acknowledgements
===============
* __[Prof. Tiziana Margaria](https://www.linkedin.com/in/tiziana-margaria-9044a12/)__
    Full professor and Co-Director of Immersive Software Engineering [1] at University of Limerick
    
References
===============

[1] https://www.software-engineering.ie/
