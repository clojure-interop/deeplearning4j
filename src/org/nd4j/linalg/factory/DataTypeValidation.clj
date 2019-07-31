(ns org.nd4j.linalg.factory.DataTypeValidation
  "Data opType validation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.factory DataTypeValidation]))

(defn ->data-type-validation
  "Constructor."
  (^DataTypeValidation []
    (new DataTypeValidation )))

(defn *assert-double
  "d - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^org.nd4j.linalg.api.ndarray.INDArray d]
    (DataTypeValidation/assertDouble d)))

(defn *assert-float
  "d-2 - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^org.nd4j.linalg.api.ndarray.INDArray d-2]
    (DataTypeValidation/assertFloat d-2)))

(defn *assert-same-data-type
  "ind-arrays - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^org.nd4j.linalg.api.ndarray.INDArray ind-arrays]
    (DataTypeValidation/assertSameDataType ind-arrays)))

