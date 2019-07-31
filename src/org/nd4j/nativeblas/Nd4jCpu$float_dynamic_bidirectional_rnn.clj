(ns org.nd4j.nativeblas.Nd4jCpu$float_dynamic_bidirectional_rnn
  "Implementation of operation \"static RNN time sequences\" with peep hole connections:
 Input arrays:
 0: input with shape [time x batchSize x inSize] or [batchSize x time x inSize], time - number of time steps, batchSize - batch size, inSize - number of features
 1: input-to-hidden weights for forward RNN, [inSize x numUnitsFW]
 2: hidden-to-hidden weights for forward RNN, [numUnitsFW x numUnitsFW]
 3: biases for forward RNN, [2*numUnitsFW]
 4: input-to-hidden weights for backward RNN, [inSize x numUnitsBW]
 5: hidden-to-hidden weights for backward RNN, [numUnitsBW x numUnitsBW]
 6: biases for backward RNN, [2*numUnitsBW]
 7: (optional) initial cell output for forward RNN [batchSize x numUnitsFW], that is at time step = 0
 8: (optional) initial cell output for backward RNN [batchSize x numUnitsBW], that is at time step = 0
 9: (optional) vector with shape [batchSize] containing integer values within [0,time), each element of this vector set max time step per each input in batch, this provides no calculations for time >= maxTimeStep
 Input integer arguments:
 0: (optional) timeMajor - if non zero then input shape is [time, batchSize, ...], else [batchSize, time, ...]
 Output arrays:
 0: cell outputs for forward RNN [time x batchSize x numUnitsFW] or [batchSize x time x numUnitsFW]
 1: cell outputs for backward RNN [time x batchSize x numUnitsBW] or [batchSize x time x numUnitsBW]
 2: cell final non-zero output for forward RNN [batchSize x numUnitsFW]
 3: cell final non-zero output for backward RNN [batchSize x numUnitsBW]"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_dynamic_bidirectional_rnn]))

(defn ->float-dynamic-bidirectional-rnn
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_dynamic_bidirectional_rnn [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_dynamic_bidirectional_rnn p))
  (^Nd4jCpu$float_dynamic_bidirectional_rnn []
    (new Nd4jCpu$float_dynamic_bidirectional_rnn )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_dynamic_bidirectional_rnn`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_dynamic_bidirectional_rnn [^Nd4jCpu$float_dynamic_bidirectional_rnn this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_dynamic_bidirectional_rnn this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

