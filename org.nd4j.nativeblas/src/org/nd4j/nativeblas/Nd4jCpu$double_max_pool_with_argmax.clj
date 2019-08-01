(ns org.nd4j.nativeblas.Nd4jCpu$double_max_pool_with_argmax
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_max_pool_with_argmax]))

(defn ->double-max-pool-with-argmax
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_max_pool_with_argmax [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_max_pool_with_argmax p))
  (^Nd4jCpu$double_max_pool_with_argmax []
    (new Nd4jCpu$double_max_pool_with_argmax )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_max_pool_with_argmax`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_max_pool_with_argmax [^Nd4jCpu$double_max_pool_with_argmax this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.DoubleDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$DoubleContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$double_max_pool_with_argmax this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$DoubleContext block]
    (-> this (.calculateOutputShape input-shape block))))

