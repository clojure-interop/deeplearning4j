(ns org.nd4j.linalg.string.NDArrayStrings
  "String representation of an ndarray.
 Printing will default to scientific notation on a per element basis
 - when absolute value is greater than or equal to 10000
 - when absolute value is less than or equal to 0.0001
 If the number of elements in the array is greater than 1000 only the first and last three elements in a dimension are included"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.string NDArrayStrings]))

(defn ->nd-array-strings
  "Constructor.

  Specify a delimiter for elements in columns for 2d arrays (or in the rank-1th dimension in higher order arrays)
  Separator in elements in remaining dimensions defaults to \",\\n\"

  col-sep - field separating columns; - `java.lang.String`
  precision - digits after decimal point - `int`"
  (^NDArrayStrings [^java.lang.String col-sep ^Integer precision]
    (new NDArrayStrings col-sep precision))
  (^NDArrayStrings [^Integer precision]
    (new NDArrayStrings precision))
  (^NDArrayStrings []
    (new NDArrayStrings )))

(def *-default-max-print-elements
  "Static Constant.

  The default number of elements for printing INDArrays (via NDArrayStrings or INDArray.toString)

  type: long"
  NDArrayStrings/DEFAULT_MAX_PRINT_ELEMENTS)

(defn format
  "Format the given ndarray as a string

  arr - the array to format - `org.nd4j.linalg.api.ndarray.INDArray`
  summarize - If true and the number of elements in the array is greater than > 1000 only the first three and last elements in any dimension will print - `boolean`

  returns: the formatted array - `java.lang.String`"
  (^java.lang.String [^NDArrayStrings this ^org.nd4j.linalg.api.ndarray.INDArray arr ^Boolean summarize]
    (-> this (.format arr summarize)))
  (^java.lang.String [^NDArrayStrings this ^org.nd4j.linalg.api.ndarray.INDArray arr]
    (-> this (.format arr))))

