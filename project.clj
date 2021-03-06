(defproject cljnode "0.1.2"
  :jvm-opts ["-Ddev_env=dev"
             "-Dnode=cljnode@127.0.0.1"
             "-Dmbox=mboxname"
             "-Dcookie=nocookie"
             "-Depmd_port=15000"]
  :description "Clojure + LFE"
  :url "http://vonmo.com/projects/cljnode"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :resource-paths [ ]
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/tools.logging "0.2.4"]
                 [org.slf4j/slf4j-log4j12 "1.7.1"]
                 [log4j/log4j "1.2.17" :exclusions [javax.mail/mail
                                                    javax.jms/jms
                                                    com.sun.jmdk/jmxtools
                                                    com.sun.jmx/jmxri]]
                  [org.erlang.otp/jinterface "1.5.6"]]
  :main cljnode.core
  :source-paths ["src/clj"]
  :target-path "target/"
  :profiles {:uberjar {:aot :all}})
