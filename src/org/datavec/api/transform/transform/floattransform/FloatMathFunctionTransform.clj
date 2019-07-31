(ns org.datavec.api.transform.transform.floattransform.FloatMathFunctionTransform
  "A simple transform to do common mathematical operations, such as sin(x), ceil(x), etc.
 Operations are specified by MathFunction"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.floattransform FloatMathFunctionTransform]))

(defn ->float-math-function-transform
  "Constructor.

  column-name - `java.lang.String`
  math-function - `org.datavec.api.transform.MathFunction`"
  (^FloatMathFunctionTransform [^java.lang.String column-name ^org.datavec.api.transform.MathFunction math-function]
    (new FloatMathFunctionTransform column-name math-function)))

(defn map
  "Description copied from interface: Transform

  input - the record to transform - `java.lang.Object`

  returns: the transformed writable - `java.lang.Object`"
  (^java.lang.Object [^FloatMathFunctionTransform this ^java.lang.Object input]
    (-> this (.map input))))

