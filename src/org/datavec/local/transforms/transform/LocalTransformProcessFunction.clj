(ns org.datavec.local.transforms.transform.LocalTransformProcessFunction
  "Function for executing a transform process"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms.transform LocalTransformProcessFunction]))

(defn ->local-transform-process-function
  "Constructor.

  transform-process - `org.datavec.api.transform.TransformProcess`"
  (^LocalTransformProcessFunction [^org.datavec.api.transform.TransformProcess transform-process]
    (new LocalTransformProcessFunction transform-process)))

