(ns org.nd4j.nativeblas.Nd4jCpu$float_sruCell
  "Implementation of operations for Simple Recurrent Unit cell: \"Training RNNs as Fast as CNNs\" Tao Lei, Yu Zhang, Yoav Artzi
 Input arrays:
 0: input with shape [batchSize x inSize], batchSize - batch size, inSize - number of features
 1: previous cell state [batchSize x inSize], that is at previous time step t-1
 2: weights [inSize x 3*inSize]
 3: biases [1 × 2*inSize]
 Output arrays:
 0: current cell output [batchSize x inSize], that is at current time step t
 1: current cell state [batchSize x inSize], that is at current time step t"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_sruCell]))

(defn ->float-sru-cell
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_sruCell [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_sruCell p))
  (^Nd4jCpu$float_sruCell []
    (new Nd4jCpu$float_sruCell )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_sruCell`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_sruCell [^Nd4jCpu$float_sruCell this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_sruCell this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

