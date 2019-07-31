(ns org.nd4j.nativeblas.Nd4jCpu$float_embedding_lookup
  "embedding_lookup - search for submatrices in given matrix and retunts them
 accordingly to index array given."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_embedding_lookup]))

(defn ->float-embedding-lookup
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_embedding_lookup [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_embedding_lookup p))
  (^Nd4jCpu$float_embedding_lookup []
    (new Nd4jCpu$float_embedding_lookup )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_embedding_lookup`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_embedding_lookup [^Nd4jCpu$float_embedding_lookup this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_embedding_lookup this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

