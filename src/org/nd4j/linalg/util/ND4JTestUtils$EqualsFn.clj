(ns org.nd4j.linalg.util.ND4JTestUtils$EqualsFn
  "A function for use with ND4JTestUtils.validateSerializedArrays(File, File, boolean, BiFunction) using INDArray#equals(Object)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.util ND4JTestUtils$EqualsFn]))

(defn ->equals-fn
  "Constructor."
  (^ND4JTestUtils$EqualsFn []
    (new ND4JTestUtils$EqualsFn )))

(defn apply
  "Description copied from interface: BiFunction

  i-1 - First argument - `org.nd4j.linalg.api.ndarray.INDArray`
  i-2 - Second argument - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: Result - `java.lang.Boolean`"
  (^java.lang.Boolean [^ND4JTestUtils$EqualsFn this ^org.nd4j.linalg.api.ndarray.INDArray i-1 ^org.nd4j.linalg.api.ndarray.INDArray i-2]
    (-> this (.apply i-1 i-2))))

