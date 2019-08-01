(ns org.datavec.api.conf.Configured
  "Base class for things that may be configured with a Configuration."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.conf Configured]))

(defn ->configured
  "Constructor.

  Construct a Configured.

  conf - `org.datavec.api.conf.Configuration`"
  (^Configured [^org.datavec.api.conf.Configuration conf]
    (new Configured conf))
  (^Configured []
    (new Configured )))

(defn set-conf
  "Description copied from interface: Configurable

  conf - `org.datavec.api.conf.Configuration`"
  ([^Configured this ^org.datavec.api.conf.Configuration conf]
    (-> this (.setConf conf))))

(defn get-conf
  "Description copied from interface: Configurable

  returns: `org.datavec.api.conf.Configuration`"
  (^org.datavec.api.conf.Configuration [^Configured this]
    (-> this (.getConf))))

