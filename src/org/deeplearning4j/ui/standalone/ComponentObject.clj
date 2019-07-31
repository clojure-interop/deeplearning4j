(ns org.deeplearning4j.ui.standalone.ComponentObject
  "Created by Alex on 25/03/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.standalone ComponentObject]))

(defn ->component-object
  "Constructor."
  (^ComponentObject []
    (new ComponentObject )))

(defn id
  "Instance Constant.

  type: java.lang.String"
  (^java.lang.String [^ComponentObject this]
    (-> this .-id)))

(defn content
  "Instance Constant.

  type: java.lang.String"
  (^java.lang.String [^ComponentObject this]
    (-> this .-content)))

