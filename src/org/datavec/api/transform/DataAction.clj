(ns org.datavec.api.transform.DataAction
  "A helper class used in TransformProcess
 to store the types of action to
 execute next."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform DataAction]))

(defn ->data-action
  "Constructor.

  transform - `org.datavec.api.transform.Transform`"
  (^DataAction [^org.datavec.api.transform.Transform transform]
    (new DataAction transform))
  (^DataAction []
    (new DataAction )))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DataAction this]
    (-> this (.toString))))

(defn get-schema
  "returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^DataAction this]
    (-> this (.getSchema))))

