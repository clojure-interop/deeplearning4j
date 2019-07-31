(ns org.nd4j.autodiff.execution.conf.ExecutorConfiguration
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.autodiff.execution.conf ExecutorConfiguration]))

(defn ->executor-configuration
  "Constructor."
  (^ExecutorConfiguration []
    (new ExecutorConfiguration )))

(defn get-flat-configuration
  "This method

  builder - `com.google.flatbuffers.FlatBufferBuilder`

  returns: `int`"
  (^Integer [^ExecutorConfiguration this ^com.google.flatbuffers.FlatBufferBuilder builder]
    (-> this (.getFlatConfiguration builder))))

