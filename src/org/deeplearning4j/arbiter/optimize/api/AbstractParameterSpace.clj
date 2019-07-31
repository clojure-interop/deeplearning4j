(ns org.deeplearning4j.arbiter.optimize.api.AbstractParameterSpace
  "Created by Alex on 23/07/2017."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.api AbstractParameterSpace]))

(defn ->abstract-parameter-space
  "Constructor."
  (^AbstractParameterSpace []
    (new AbstractParameterSpace )))

(defn get-nested-spaces
  "Description copied from interface: ParameterSpace

  returns: A map of nested parameter spaces - `java.util.Map<java.lang.String,org.deeplearning4j.arbiter.optimize.api.ParameterSpace>`"
  (^java.util.Map [^AbstractParameterSpace this]
    (-> this (.getNestedSpaces))))

