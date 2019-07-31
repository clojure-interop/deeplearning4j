(ns org.datavec.api.transform.transform.doubletransform.DoubleMathFunctionTransform
  "A simple transform to do common mathematical operations, such as sin(x), ceil(x), etc.
 Operations are specified by MathFunction"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.doubletransform DoubleMathFunctionTransform]))

(defn ->double-math-function-transform
  "Constructor.

  column-name - `java.lang.String`
  math-function - `org.datavec.api.transform.MathFunction`"
  (^DoubleMathFunctionTransform [^java.lang.String column-name ^org.datavec.api.transform.MathFunction math-function]
    (new DoubleMathFunctionTransform column-name math-function)))

(defn map
  "Description copied from interface: Transform

  input - the record to transform - `java.lang.Object`

  returns: the transformed writable - `java.lang.Object`"
  (^java.lang.Object [^DoubleMathFunctionTransform this ^java.lang.Object input]
    (-> this (.map input))))

