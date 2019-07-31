(ns org.nd4j.autodiff.validation.functions.EqualityFn
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.autodiff.validation.functions EqualityFn]))

(defn ->equality-fn
  "Constructor."
  (^EqualityFn []
    (new EqualityFn )))

(defn apply
  "Description copied from interface: Function

  actual - Input - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: Result - `java.lang.String`"
  (^java.lang.String [^EqualityFn this ^org.nd4j.linalg.api.ndarray.INDArray actual]
    (-> this (.apply actual))))

