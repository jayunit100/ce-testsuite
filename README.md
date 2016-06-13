# Cloud Enablement Testsuite - ce-testsuite

For more details about each test, please verify its README.md file.

# Running from source.

First, build the prerequisite projects:

```
git clone https://github.com/arquillian/arquillian-cube.git
cd arquillian-cube
mvn clean install -DskipTests=true
cd ../
git clone https://github.com/jboss-openshift/ce-arq.git
cd ce-arq
mvn clean install
cd ../
```

Then, you can follow individual instructions in different test directories.

#### Found an issue?
Please, feel free to report the issue that you found [here](https://github.com/jboss-openshift/ce-testsuite/issues/new).

__For feedbacks please send us an email (cloud-enablement-feedback@redhat.com) and let us know what you are thinking.__
