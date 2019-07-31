(ns org.deeplearning4j.spark.parameterserver.conf.SharedTrainingConfiguration
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.parameterserver.conf SharedTrainingConfiguration]))

(defn ->shared-training-configuration
  "Constructor."
  (^SharedTrainingConfiguration []
    (new SharedTrainingConfiguration )))

(defn set-message-handler-class
  "message-handler-class - `java.lang.String`"
  ([^SharedTrainingConfiguration this ^java.lang.String message-handler-class]
    (-> this (.setMessageHandlerClass message-handler-class))))

