(ns org.datavec.api.conf.Configurable
  "Something that may be configured with a Configuration."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.conf Configurable]))

(defn set-conf
  "Set the configuration to be used by this object.

  conf - `org.datavec.api.conf.Configuration`"
  ([^Configurable this ^org.datavec.api.conf.Configuration conf]
    (-> this (.setConf conf))))

(defn get-conf
  "Return the configuration used by this object.

  returns: `org.datavec.api.conf.Configuration`"
  (^org.datavec.api.conf.Configuration [^Configurable this]
    (-> this (.getConf))))

