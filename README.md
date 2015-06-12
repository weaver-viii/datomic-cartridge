# OpenShift cartridge for Datomic

Deploy Clojure and Datomic application on OpenShift.

This is a template for an Openshift cartridge. It will allow you to easily get Datomic running on an free Openshift cartrige so that you can experiment. It uses the free version of Datomic which runs an in-memory database that is not saved to disk, so data will not persist between restarts of your app.

You can find the dirty details on this [blog post](http://monjohn.github.io/running-datomic-on-openshift). 

```

rhc app-create mydatomapp https://raw.githubusercontent.com/monjohn/datomic-cartridge/master/metadata/manifest.yml

```
