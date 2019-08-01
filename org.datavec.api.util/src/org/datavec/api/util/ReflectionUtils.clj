(ns org.datavec.api.util.ReflectionUtils
  "Deprecated.
 Use ReflectionUtils"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.util ReflectionUtils]))

(defn *new-instance
  "Deprecated.

  the-class - class of which an object is created - `java.lang.Class`
  conf - Configuration - `org.datavec.api.conf.Configuration`

  returns: a new object - `<T> T`"
  ([^java.lang.Class the-class ^org.datavec.api.conf.Configuration conf]
    (ReflectionUtils/newInstance the-class conf)))

(defn *set-conf
  "Deprecated.

  the-object - object for which to set configuration - `java.lang.Object`
  conf - Configuration - `org.datavec.api.conf.Configuration`"
  ([^java.lang.Object the-object ^org.datavec.api.conf.Configuration conf]
    (ReflectionUtils/setConf the-object conf)))

(defn *copy
  "Deprecated.

  conf - `org.datavec.api.conf.Configuration`
  src - the object to copy into, which is destroyed - `T`
  dst - the object to copy from - `T`

  returns: `<T> T`

  throws: java.io.IOException"
  ([^org.datavec.api.conf.Configuration conf src dst]
    (ReflectionUtils/copy conf src dst)))

