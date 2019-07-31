(ns org.nd4j.autodiff.validation.functions.RelErrorFn
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.autodiff.validation.functions RelErrorFn]))

(defn ->rel-error-fn
  "Constructor."
  (^RelErrorFn []
    (new RelErrorFn )))

(defn apply
  "Description copied from interface: Function

  actual - Input - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: Result - `java.lang.String`"
  (^java.lang.String [^RelErrorFn this ^org.nd4j.linalg.api.ndarray.INDArray actual]
    (-> this (.apply actual))))

