This is a spark testing module.

You can run it like so:

`mvn clean package test -Pjdg -Dkubernetes.master=https://10.1.236.15:8443 -Dkubernetes.registry.url=10.1.236.15:5001 -Ddocker.url=http://10.1.236.15:2375 -Drouter.hostIP=10.1.236.15 -Dtest=SparkTest -Dkubernetes.ignore.cleanup=true -Dsurefire.useFile=false -DtrimStackTrace=false`

This of course assumes you have an openshift cluster running at the above (10.1....) address, and that you have run `oc login` so that you can submit openshift pods.

This tests starts a spark cluster using the supported xpaas templates and then launches a container which is running in the same namespace.

That container can then uses DNS to connect to spark services, the web ui, launch jobs, and so on.
