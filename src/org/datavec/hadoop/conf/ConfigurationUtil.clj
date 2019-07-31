(ns org.datavec.hadoop.conf.ConfigurationUtil
  "Notes
 https://linuxjunkies.wordpress.com/2011/11/21/a-hdfsclient-for-hadoop-using-the-native-java-api-a-tutorial/
 Design Ideas
 - Need a DataVec Conf entry:
 - hadoop.configuration.path
 - example: hadoop.configuration.path=/home/hadoop/hadoop/conf/"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.hadoop.conf ConfigurationUtil]))

(defn ->configuration-util
  "Constructor."
  (^ConfigurationUtil []
    (new ConfigurationUtil )))

(defn *generate-config
  "base-conf-path - `java.lang.String`

  returns: `org.apache.hadoop.conf.Configuration`"
  (^org.apache.hadoop.conf.Configuration [^java.lang.String base-conf-path]
    (ConfigurationUtil/generateConfig base-conf-path)))

