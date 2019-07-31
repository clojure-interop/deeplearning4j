(ns org.datavec.spark.transform.misc.NDArrayToWritablesFunction
  "Function for converting NDArrays to lists of writables."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.misc NDArrayToWritablesFunction]))

(defn ->nd-array-to-writables-function
  "Constructor."
  (^NDArrayToWritablesFunction []
    (new NDArrayToWritablesFunction )))

(defn call
  "arr - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `java.util.List<org.datavec.api.writable.Writable>`

  throws: java.lang.Exception"
  (^java.util.List [^NDArrayToWritablesFunction this ^org.nd4j.linalg.api.ndarray.INDArray arr]
    (-> this (.call arr))))

