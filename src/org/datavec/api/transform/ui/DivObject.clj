(ns org.datavec.api.transform.ui.DivObject
  "Created by Alex on 25/03/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.ui DivObject]))

(defn ->div-object
  "Constructor."
  (^DivObject []
    (new DivObject )))

(defn id
  "Instance Constant.

  type: java.lang.String"
  (^java.lang.String [^DivObject this]
    (-> this .-id)))

(defn content
  "Instance Constant.

  type: java.lang.String"
  (^java.lang.String [^DivObject this]
    (-> this .-content)))

