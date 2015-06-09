(defproject clojureapp "0.1.1-SNAPSHOT"
  
    :plugins [[lein-ring "0.9.4"]]
    :dependencies [[org.clojure/clojure "1.6.0"]
                   [http-kit "2.1.18"]
                   [com.datomic/datomic-free "0.9.5173" :exclusions [joda-time]]]
    :main webapp)
