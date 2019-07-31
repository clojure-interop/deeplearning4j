(ns org.nd4j.linalg.util.ND4JTestUtils$EqualsWithEpsFn
  "A function for use with ND4JTestUtils.validateSerializedArrays(File, File, boolean, BiFunction) using INDArray.equalsWithEps(Object, double)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.util ND4JTestUtils$EqualsWithEpsFn]))

(defn ->equals-with-eps-fn
  "Constructor."
  (^ND4JTestUtils$EqualsWithEpsFn []
    (new ND4JTestUtils$EqualsWithEpsFn )))

(defn apply
  "Description copied from interface: BiFunction

  i-1 - First argument - `org.nd4j.linalg.api.ndarray.INDArray`
  i-2 - Second argument - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: Result - `java.lang.Boolean`"
  (^java.lang.Boolean [^ND4JTestUtils$EqualsWithEpsFn this ^org.nd4j.linalg.api.ndarray.INDArray i-1 ^org.nd4j.linalg.api.ndarray.INDArray i-2]
    (-> this (.apply i-1 i-2))))

