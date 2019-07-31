(ns org.datavec.local.transforms.misc.NDArrayToWritablesFunction
  "Function for converting NDArrays to lists of writables."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms.misc NDArrayToWritablesFunction]))

(defn ->nd-array-to-writables-function
  "Constructor."
  (^NDArrayToWritablesFunction []
    (new NDArrayToWritablesFunction )))

(defn apply
  "Description copied from interface: Function

  arr - Input - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: Result - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^NDArrayToWritablesFunction this ^org.nd4j.linalg.api.ndarray.INDArray arr]
    (-> this (.apply arr))))

