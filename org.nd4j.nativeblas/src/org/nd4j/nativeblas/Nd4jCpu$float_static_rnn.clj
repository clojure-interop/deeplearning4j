(ns org.nd4j.nativeblas.Nd4jCpu$float_static_rnn
  "Implementation of operation \"static RNN time sequences\" with peep hole connections:
 Input arrays:
 0: input with shape [time x batchSize x inSize], time - number of time steps, batchSize - batch size, inSize - number of features
 1: input-to-hidden weights, [inSize x numUnits]
 2: hidden-to-hidden weights, [numUnits x numUnits]
 3: biases, [2*numUnits]
 4: (optional) initial cell output [batchSize x numUnits], that is at time step = 0
 5: (optional) vector with shape [batchSize] containing integer values within [0,time), each element of this vector set max time step per each input in batch, this provides no calculations for time >= maxTimeStep
 Output arrays:
 0: cell outputs [time x batchSize x numUnits]
 1: cell final non-zero output [batchSize x numUnits]"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_static_rnn]))

(defn ->float-static-rnn
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_static_rnn [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_static_rnn p))
  (^Nd4jCpu$float_static_rnn []
    (new Nd4jCpu$float_static_rnn )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_static_rnn`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_static_rnn [^Nd4jCpu$float_static_rnn this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_static_rnn this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

