(ns org.nd4j.nativeblas.Nd4jCpu$double_embedding_lookup
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_embedding_lookup]))

(defn ->double-embedding-lookup
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_embedding_lookup [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_embedding_lookup p))
  (^Nd4jCpu$double_embedding_lookup []
    (new Nd4jCpu$double_embedding_lookup )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_embedding_lookup`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_embedding_lookup [^Nd4jCpu$double_embedding_lookup this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.DoubleDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$DoubleContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$double_embedding_lookup this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$DoubleContext block]
    (-> this (.calculateOutputShape input-shape block))))

