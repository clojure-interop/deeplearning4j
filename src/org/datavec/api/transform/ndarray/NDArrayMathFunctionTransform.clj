(ns org.datavec.api.transform.ndarray.NDArrayMathFunctionTransform
  "A simple transform to do common mathematical operations, such as sin(x), ceil(x), etc.
 Operations are performed element-wise on each value in the INDArray; operations are specified by MathFunction"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.ndarray NDArrayMathFunctionTransform]))

(defn ->nd-array-math-function-transform
  "Constructor.

  column-name - `java.lang.String`
  math-function - `org.datavec.api.transform.MathFunction`"
  (^NDArrayMathFunctionTransform [^java.lang.String column-name ^org.datavec.api.transform.MathFunction math-function]
    (new NDArrayMathFunctionTransform column-name math-function)))

(defn get-new-column-meta-data
  "new-name - `java.lang.String`
  old-column-type - `org.datavec.api.transform.metadata.ColumnMetaData`

  returns: `org.datavec.api.transform.metadata.ColumnMetaData`"
  (^org.datavec.api.transform.metadata.ColumnMetaData [^NDArrayMathFunctionTransform this ^java.lang.String new-name ^org.datavec.api.transform.metadata.ColumnMetaData old-column-type]
    (-> this (.getNewColumnMetaData new-name old-column-type))))

(defn map
  "Description copied from interface: Transform

  input - the record to transform - `java.lang.Object`

  returns: the transformed writable - `java.lang.Object`"
  (^java.lang.Object [^NDArrayMathFunctionTransform this ^java.lang.Object input]
    (-> this (.map input))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NDArrayMathFunctionTransform this]
    (-> this (.toString))))

