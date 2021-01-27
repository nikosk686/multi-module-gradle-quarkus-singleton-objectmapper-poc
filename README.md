### Bean configuration

It provides 2 different singleton ObjectMapper instances.

See `master-module/BeansConfiguration`

In order to verify that they are singleton run the test in `module-1` and examine the printed output.
   
### Multi module setup
An empty parent module that contains 3 modules with dependencies to each other.
Highlights:
1) Common dependencies in parents build gradle
2) Dynamic module inclusion/exclusion (see the usage of `activeClientModule`)
3) Check the empty `beans.xml` usage that is needed for providing beans from one module to another

### Constructor based injection
Check the 2 service classes and how they get their dependencies through constructor injection.