(ns org.nd4j.linalg.api.buffer.factory.AllocatorInstanceHolder
  "Created by agibsonccc on 2/25/16."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.buffer.factory AllocatorInstanceHolder]))

(defn ->allocator-instance-holder
  "Constructor."
  (^AllocatorInstanceHolder []
    (new AllocatorInstanceHolder )))

(defn *get-instance
  "returns: `org.nd4j.linalg.api.buffer.factory.DataBufferFactory`"
  (^org.nd4j.linalg.api.buffer.factory.DataBufferFactory []
    (AllocatorInstanceHolder/getInstance )))

