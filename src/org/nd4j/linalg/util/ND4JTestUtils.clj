(ns org.nd4j.linalg.util.ND4JTestUtils
  "Test utilitiez for ND4J"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.util ND4JTestUtils]))

(defn *validate-serialized-arrays
  "Scan the specified directories for matching files (i.e., same path relative to their respective root directories)
  and compare the contents using a provided function.
  Assumes the saved files represent INDArrays saved with Nd4j.saveBinary(INDArray, File)

  dir-1 - First directory - `java.io.File`
  dir-2 - Second directory - `java.io.File`
  recursive - Whether to search recursively (i.e., include files in subdirectories - `boolean`
  eval-fn - `org.nd4j.linalg.function.BiFunction`

  returns: Comparison results - `org.nd4j.linalg.util.ND4JTestUtils$ComparisonResult`

  throws: java.lang.Exception"
  (^org.nd4j.linalg.util.ND4JTestUtils$ComparisonResult [^java.io.File dir-1 ^java.io.File dir-2 ^Boolean recursive ^org.nd4j.linalg.function.BiFunction eval-fn]
    (ND4JTestUtils/validateSerializedArrays dir-1 dir-2 recursive eval-fn))
  (^org.nd4j.linalg.util.ND4JTestUtils$ComparisonResult [^java.io.File dir-1 ^java.io.File dir-2 ^Boolean recursive]
    (ND4JTestUtils/validateSerializedArrays dir-1 dir-2 recursive)))

