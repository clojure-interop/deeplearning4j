(ns org.deeplearning4j.rl4j.space.HighLowDiscrete
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.space HighLowDiscrete]))

(defn ->high-low-discrete
  "Constructor.

  matrix - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^HighLowDiscrete [^org.nd4j.linalg.api.ndarray.INDArray matrix]
    (new HighLowDiscrete matrix)))

(defn encode
  "a - `java.lang.Integer`

  returns: `java.lang.Object`"
  (^java.lang.Object [^HighLowDiscrete this ^java.lang.Integer a]
    (-> this (.encode a))))

