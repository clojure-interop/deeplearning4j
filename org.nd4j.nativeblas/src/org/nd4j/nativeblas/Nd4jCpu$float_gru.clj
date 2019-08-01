(ns org.nd4j.nativeblas.Nd4jCpu$float_gru
  "Implementation of gated Recurrent Unit:
 Input arrays:
 0: input with shape [time x batchSize x inSize], time - number of time steps, batchSize - batch size, inSize - number of features
 1: initial cell output [batchSize x numUnits], that is at time step = 0
 2: input-to-hidden weights, [inSize x 3*numUnits]
 3: hidden-to-hidden weights, [numUnits x 3*numUnits]
 4: biases, [3*numUnits]
 Output arrays:
 0: cell outputs [time x batchSize x numUnits], that is per each time step"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_gru]))

(defn ->float-gru
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_gru [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_gru p))
  (^Nd4jCpu$float_gru []
    (new Nd4jCpu$float_gru )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_gru`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_gru [^Nd4jCpu$float_gru this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_gru this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

