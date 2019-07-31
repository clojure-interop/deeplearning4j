(ns org.datavec.perf.timing.IOTiming$INDArrayCreationFunction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.perf.timing IOTiming$INDArrayCreationFunction]))

(defn create-from-record
  "record - `java.util.List`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^IOTiming$INDArrayCreationFunction this ^java.util.List record]
    (-> this (.createFromRecord record))))

