(ns org.deeplearning4j.ui.providers.ObjectMapperProvider
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.providers ObjectMapperProvider]))

(defn ->object-mapper-provider
  "Constructor."
  (^ObjectMapperProvider []
    (new ObjectMapperProvider )))

(defn *module
  "returns: `com.fasterxml.jackson.databind.module.SimpleModule`"
  (^com.fasterxml.jackson.databind.module.SimpleModule []
    (ObjectMapperProvider/module )))

(defn get-context
  "type - `java.lang.Class`

  returns: `com.fasterxml.jackson.databind.ObjectMapper`"
  (^com.fasterxml.jackson.databind.ObjectMapper [^ObjectMapperProvider this ^java.lang.Class type]
    (-> this (.getContext type))))

